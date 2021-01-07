package se.lnu.joa.covid.model.usage;

public class Axis {
	
	private String label;
	private String column;
	private Scale scale;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public Scale getScale() {
		return scale;
	}
	public void setScale(Scale scale) {
		this.scale = scale;
	}
	
	@Override
	public String toString() {
		return "Axis [label=" + label + ", column=" + column + ", scale=" + scale + "]";
	}
}
