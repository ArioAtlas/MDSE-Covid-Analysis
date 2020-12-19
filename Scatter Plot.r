#install.packages("gganimate")
#install.packages("gifski")
library(gganimate)
library(ggplot2)
library(dplyr)
library(gapminder)
library(ggthemes)

epidemiology <- read.csv("./epidemiology_EU.csv")

epidemiology$DateS <- as.Date(epidemiology$date, "%m/%d/%Y")
epidemiology$Elapsed <- as.numeric(epidemiology$DateS)

# Graph 1: Transitioning through time
graph1 = epidemiology %>%
  ggplot(aes(x=new_confirmed, y=new_deceased, color=key, size=total_confirmed)) +
  geom_point(alpha = 0.7, stroke = 0) +
  theme_fivethirtyeight() +
  scale_size(range=c(2,12), guide="none") +
  scale_x_log10() +
  labs(title = "Infection vs Death by Country",
       x = "New Cases",
       y = "New Deaths",
       color = "Country",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text(),
        text = element_text(family = "Rubik"),
        legend.text=element_text(size=10)) +
  scale_color_brewer(palette = "Set2")

graph1.animation = graph1 +
  transition_time(DateS)+
  labs(subtitle = "Date: {frame_time}") +
  shadow_wake(wake_length = 0.1)
graph1.animation

animate(graph1.animation, height = 500, width = 800, fps = 30, duration = 20,
        end_pause = 60, res = 100)
anim_save("gapminder graph.gif")
