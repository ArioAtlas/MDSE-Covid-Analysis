package se.lnu.joa.covid.model.usage;

public class Visualization {
	private String type;
	private String xAxis;
	private String yAxis;
	private String color;
	private String title;
	private String subTitle;
	private String xAxisLabel;
	private String yAxisLabel;
	private String colorLabel;
	private String caption;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getxAxis() {
		return xAxis;
	}
	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}
	public String getyAxis() {
		return yAxis;
	}
	public void setyAxis(String yAxis) {
		this.yAxis = yAxis;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getxAxisLabel() {
		return xAxisLabel;
	}
	public void setxAxisLabel(String xAxisLabel) {
		this.xAxisLabel = xAxisLabel;
	}
	public String getyAxisLabel() {
		return yAxisLabel;
	}
	public void setyAxisLabel(String yAxisLabel) {
		this.yAxisLabel = yAxisLabel;
	}
	public String getColorLabel() {
		return colorLabel;
	}
	public void setColorLabel(String colorLabel) {
		this.colorLabel = colorLabel;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	@Override
	public String toString() {
		return "Visualization [type=" + type + ", xAxis=" + xAxis + ", yAxis=" + yAxis + ", color=" + color
				+ ", title=" + title + ", subTitle=" + subTitle + ", xAxisLabel=" + xAxisLabel + ", yAxisLabel="
				+ yAxisLabel + ", colorLabel=" + colorLabel + ", caption=" + caption + "]";
	}    
}
