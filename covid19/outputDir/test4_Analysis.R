# This file has been auto-generated based on Model Driven Engineering techniques
# as a projects in model-based development at Linnaeus University (2021)
# Authors: Angelica Hjelm Gardner, Jens Jakob Sveding, Omid Golshan Tafti
# Special thanks to: Mirko D' Angelo, Diego Perez Palacin, and Cristian Leoni



# Notice: Below package are required
# in order to install each you can easily uncomment them
#install.packages("gifski")

# Libraries
library(gganimate)
library(ggplot2)
library(dplyr)
library(gapminder)
library(ggthemes)

# Options
options(max.print = 100000)


# Data input
test4 <- read.csv("./test4.csv")

# Data Modifiers
test4$date <- as.Date(test4$date,"%m-%d-%Y")
test4$date_d <- as.numeric(difftime(test4$date,test4$date[1],units="days"))
test4$date_w <- as.numeric(difftime(test4$date,test4$date[1],units="week"))
test4$date_h <- as.numeric(difftime(test4$date,test4$date[1],units="hours"))
test4$date_m <- as.numeric(difftime(test4$date,test4$date[1],units="mins"))
test4$date_s <- as.numeric(difftime(test4$date,test4$date[1],units="secs"))


# GGPLOT Configuration
plot0 = test4 %>%
  ggplot(aes(x=new_confirmed, y=new_deceased,color= key,size= total_confirmed)) +
  geom_point(alpha = 0.7, stroke = 0.0) +
  theme_fivethirtyeight() +scale_x_log10()+
  labs(title = "Infection vs Death over Time by Country",
       x = "New Cases",
       y = "New Deaths",
       color = "Country",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text(),
        text = element_text(family = "Rubik"),
        legend.text=element_text(size=10)) +
  scale_color_brewer(palette = "Set2")


# GGAnimate Configuration
plot0.animation = plot0 +
  transition_time(date)+
  labs(subtitle = "Date: {frame_time}") +
  shadow_wake(wake_length = 0.1)

#Render and save the animation
animate(plot0.animation, height = 500, width = 800, fps = 30, duration = 20,
        end_pause = 60, res = 100, renderer = gifski_renderer("./Infection_vs Death over Time_animatin.gif"))

#anim_save("Infection_vs Death over Time by Country_animatin.gif")


