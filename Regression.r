library(gganimate)
library(ggplot2)
library(dplyr)
library(gapminder)
library(ggthemes)

abc <- read.csv("./epidemiology_EU.csv")

abc$date <- as.Date(abc$date, "%m/%d/%Y")
abc$date_d <- as.numeric(difftime(abc$date,abc$date[1],units="days"))
abc$date_w <- as.numeric(difftime(abc$date,abc$date[1],units="week"))
abc$date_h <- as.numeric(difftime(abc$date,abc$date[1],units="hours"))
abc$date_m <- as.numeric(difftime(abc$date,abc$date[1],units="mins"))
abc$date_s <- as.numeric(difftime(abc$date,abc$date[1],units="secs"))


plot0 = abc %>%
  ggplot(aes(x=total_deceased, y=total_deceased,color= total_deceased,size= total_deceased)) +
  geom_point(alpha = 0.7, stroke = 0.0) +
  theme_fivethirtyeight() +
  scale_size(range=c(2,12), guide="none") +
  scale_x_log10() +
  labs(title = "Infection vs Death",
       x = "Total Infection",
       y = "Total Infection",
       color = "Total Infection",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text(),
        text = element_text(family = "Rubik"),
        legend.text=element_text(size=10)) +
  scale_color_brewer(palette = "Set2")+ 
  geom_smooth()

plot0.animation = plot0 +
  transition_time(date_d)+
  labs(subtitle = "Date: : {frame_time}") +
  shadow_wake(wake_length = 0.1)
graph1.animation

animate(plot0.animation, height = 500, width = 800, fps = 30, duration = 20,
        end_pause = 60, res = 100)

anim_save("Infection vs Death_animatin.gif")