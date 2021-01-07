package se.lnu.joa.covid.model.usage;

public class Visualization {
	private String type;
	private Axes axes;
	private VisualizationInfo info;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Axes getAxes() {
		return axes;
	}
	public void setAxes(Axes axes) {
		this.axes = axes;
	}
	public VisualizationInfo getInfo() {
		return info;
	}
	public void setInfo(VisualizationInfo info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "Visualization [type=" + type + ", axes=" + axes + ", info=" + info + "]";
	}
}
