library(ggplot2)
library(dplyr)
library(ggthemes)

start = strptime("2/1/2020", format = "%m/%d/%Y")


#customColors = c("#003f5c", "#374c80", "#7a5195", "#bc5090", "#ef5675", "#ff764a", "#ffa600")

epidemiology <- read.csv("./epidemiology_EU.csv")
epidemiology$Day <- as.numeric(difftime(strptime(epidemiology$date, format = "%m/%d/%Y"),start,units="days"))

data <- epidemiology[-c(1,5:6,9:10) ]

data %>%
ggplot(aes(x=Day, y=total_confirmed, color=key)) +
  geom_point(alpha = 0.7, stroke = 0) +
  theme_fivethirtyeight() +
  labs(title = "Infection vs Death",
       x = "Days Passed",
       y = "Total Infection",
       color = "Country",
       caption = "Source: Google Open Data") +
  theme(axis.title = element_text()) +
  scale_color_brewer(palette = "Set2")+
  stat_summary(fun.data= mean_cl_normal) + 
  geom_smooth()
