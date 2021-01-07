package se.lnu.joa.covid.model.usage;

public class VisualizationInfo {
	
	private String title;
	private String subTitle;
	private String caption;
	
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
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	@Override
	public String toString() {
		return "VisualizationInfo [title=" + title + ", subTitle=" + subTitle + ", caption=" + caption + "]";
	}
	
}
