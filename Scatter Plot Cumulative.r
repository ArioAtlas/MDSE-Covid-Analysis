#install.packages("gganimate")
#install.packages("gifski")
library(gganimate)
library(ggplot2)
library(dplyr)
library(gapminder)
library(ggthemes)

epidemiology <- read.csv("epidemiology_EU.csv")

epidemiology$DateS <- as.Date(epidemiology$date, "%m/%d/%Y")

# Graph 1: Transitioning through time
graph1 = epidemiology %>%
  ggplot(aes(x=total_confirmed, y=total_deceased, color=key, size=new_confirmed)) +
  geom_point(alpha = 0.7, stroke = 0) +
  theme_fivethirtyeight() +
  scale_size(range=c(0,20), guide="none") +
  scale_x_log10() +
  labs(title = "Infection vs Death by Country",
       x = "Total Infection",
       y = "Total Deaths",
       color = "Country",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text(),
        text = element_text(family = "Rubik"),
        legend.text=element_text(size=10)) +
  scale_color_brewer(palette = "Set2")

graph1.animation = graph1 +
  transition_time(DateS)+
  labs(subtitle = "Date: {frame_time}") +
  shadow_wake(wake_length = 0.01)

animate(graph1.animation, height = 500, width = 800, fps = 10, duration = 10,
        end_pause = 60, res = 100, renderer = gifski_renderer())
anim_save("gapminder graph.gif",animation = graph1.animation)

