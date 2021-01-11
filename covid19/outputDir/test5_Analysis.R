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
test5 <- read.csv("./test5.csv")

# Data Modifiers
test5$date <- as.Date(test5$date,"%m-%d-%Y")
test5$date_d <- as.numeric(difftime(test5$date,test5$date[1],units="days"))
test5$date_w <- as.numeric(difftime(test5$date,test5$date[1],units="week"))
test5$date_h <- as.numeric(difftime(test5$date,test5$date[1],units="hours"))
test5$date_m <- as.numeric(difftime(test5$date,test5$date[1],units="mins"))
test5$date_s <- as.numeric(difftime(test5$date,test5$date[1],units="secs"))


# GGPLOT Configuration
plot0 = test5 %>%
  ggplot(aes(x=total_confirmed, y=total_deceased,color= key,size= new_confirmed)) +
  geom_point(alpha = 0.7, stroke = 0.0) +
  theme_fivethirtyeight() +scale_x_log10()+
  labs(title = "Total Infection vs Total Death over Time",
       x = "Total Infection",
       y = "Total Deaths",
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
  shadow_wake(wake_length = 0.02)

#Render and save the animation
animate(plot0.animation, height = 500, width = 800, fps = 30, duration = 20,
        end_pause = 60, res = 100, renderer = gifski_renderer("./Infection_vs Death over Time_animatin.gif"))

#anim_save("Total_Infection vs Total Death over Time_animatin.gif")


