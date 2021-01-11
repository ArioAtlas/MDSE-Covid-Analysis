library(ggplot2)
library(dplyr)
library(ggthemes)

#customColors = c("#003f5c", "#374c80", "#7a5195", "#bc5090", "#ef5675", "#ff764a", "#ffa600")

epidemiology <- read.csv("./test1.csv")

epidemiology$date <- as.Date(epidemiology$date, "%m-%d-%Y")
plot0 = epidemiology %>%
  ggplot(aes(x = date, y = new_confirmed, color= key)) +
  geom_line(size = 1.2, alpha = 1.8) +
  labs(title = "COVID-19 New Cases in Europe",
       subtitle = "Spain, United Kingdm, Italy, Sweden, Netherlands, Germany",
       x = "Date",
       y = "New Cases",
       color = "Country") + 
  theme_fivethirtyeight() +
  #scale_color_manual(values = customColors)+
  theme(axis.title = element_text())
  
ggsave("myplot.png",width = 10,height = 7.5)
