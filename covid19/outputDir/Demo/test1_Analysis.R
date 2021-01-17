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
test1 <- read.csv("./test1.csv")

# Data Modifiers
test1$date <- as.Date(test1$date,"%m-%d-%Y")
test1$date_d <- as.numeric(difftime(test1$date,test1$date[1],units="days"))
test1$date_w <- as.numeric(difftime(test1$date,test1$date[1],units="week"))
test1$date_h <- as.numeric(difftime(test1$date,test1$date[1],units="hours"))
test1$date_m <- as.numeric(difftime(test1$date,test1$date[1],units="mins"))
test1$date_s <- as.numeric(difftime(test1$date,test1$date[1],units="secs"))


# GGPLOT Configuration
plot0 = test1 %>%
  ggplot(aes(x = date, y = new_confirmed,color= key)) +
  geom_line(size = 1.2, alpha = 1.8) +
  labs(title = "COVID-19 New Cases in Europe",
       subtitle = "Spain, United Kingdm, Italy, Sweden, Netherlands, Germany",
       x = "Date",
       y = "New Cases"
       ,color = "Country") + 
  theme_fivethirtyeight() +
  theme(axis.title = element_text())

#Save the plot image
ggsave("COVID-19_New Cases in Europe_LinearPlot.png")

