library(ggplot2)
library(dplyr)
library(ggthemes)

#customColors = c("#003f5c", "#374c80", "#7a5195", "#bc5090", "#ef5675", "#ff764a", "#ffa600")

epidemiology <- read.csv("./epidemiology_EU.csv")

epidemiology$DateS <- as.Date(epidemiology$date, "%m/%d/%Y")

epidemiology %>%
  ggplot(aes(x = DateS, y = new_confirmed, color= key)) +
  geom_line(size = 1.2, alpha = 1.8) +
  labs(title = "COVID-19 New Cases in Europe",
       subtitle = "Spain, United Kingdm, Italy, Sweden, Netherlands, Germany",
       x = "Date",
       y = "New Cases",
       color = "Country") + 
  theme_fivethirtyeight() +
  #scale_color_manual(values = customColors)+
  theme(axis.title = element_text())
  