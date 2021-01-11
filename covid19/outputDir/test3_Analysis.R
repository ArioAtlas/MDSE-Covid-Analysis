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
test3 <- read.csv("./test3.csv")

# Data Modifiers
test3$date <- as.Date(test3$date,"%m-%d-%Y")
test3$date_d <- as.numeric(difftime(test3$date,test3$date[1],units="days"))
test3$date_w <- as.numeric(difftime(test3$date,test3$date[1],units="week"))
test3$date_h <- as.numeric(difftime(test3$date,test3$date[1],units="hours"))
test3$date_m <- as.numeric(difftime(test3$date,test3$date[1],units="mins"))
test3$date_s <- as.numeric(difftime(test3$date,test3$date[1],units="secs"))


# GGPLOT Configuration
plot0 = test3 %>%
  ggplot(aes(x=date_d, y=total_confirmed,color= key)) +
  geom_point(alpha = 0.7, stroke = 0.0) +
  theme_fivethirtyeight() +
  labs(title = "Infection over Time in Europe",
       x = "Days Passed",
       y = "Total Infection",
       color = "Country",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text(),
        text = element_text(family = "Rubik"),
        legend.text=element_text(size=10)) +
  scale_color_brewer(palette = "Set2")+ 
  geom_smooth()

#Save the plot image
ggsave("Infection_over Time in Europe_ScatterPlot.png")

