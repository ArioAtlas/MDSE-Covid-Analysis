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
test2 <- read.csv("./test2.csv")

# Data Modifiers
test2 <- filter(test2,key=="SE")
test2$date <- as.Date(test2$date,"%m-%d-%Y")
test2$date_d <- as.numeric(difftime(test2$date,test2$date[1],units="days"))
test2$date_w <- as.numeric(difftime(test2$date,test2$date[1],units="week"))
test2$date_h <- as.numeric(difftime(test2$date,test2$date[1],units="hours"))
test2$date_m <- as.numeric(difftime(test2$date,test2$date[1],units="mins"))
test2$date_s <- as.numeric(difftime(test2$date,test2$date[1],units="secs"))


# GGPLOT Configuration
plot0 = test2 %>%
  ggplot(aes(x=total_deceased, y=total_confirmed)) +
  geom_point(alpha = 0.7, stroke = 0.0) +
  theme_fivethirtyeight() +
  labs(title = "Infection vs Death",
       x = "Total Infection",
       y = "Total Deaths",
       color = "",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text(),
        text = element_text(family = "Rubik"),
        legend.text=element_text(size=10)) +
  scale_color_brewer(palette = "Set2")+ 
  stat_summary(fun.data= mean_cl_normal) + 
  geom_smooth(color='red',method='lm')
  
  sink("test2_linear_regression_result.txt")
  summary(lm(test2,formula=total_deceased ~ total_confirmed))
  sink()


#Save the plot image
ggsave("Infection_vs Death_ScatterPlot.png")

