package se.lnu.joa.covid.model.usage;

public class Animation {
	private String label;
	private String transitionTime;
	private Integer width;
	private Integer height;
	private Integer duration;
	private String outputName;
	private String outputPath;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTransitionTime() {
		return transitionTime;
	}
	public void setTransitionTime(String transitionTime) {
		this.transitionTime = transitionTime;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getOutputName() {
		return outputName;
	}
	public void setOutputName(String outputName) {
		this.outputName = outputName;
	}
	public String getOutputPath() {
		return outputPath;
	}
	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}
	
	@Override
	public String toString() {
		return "Animation [label=" + label + ", transitionTime=" + transitionTime + ", width=" + width + ", height="
				+ height + ", duration=" + duration + ", outputName=" + outputName + ", outputPath=" + outputPath
				+ "]";
	}	
}
