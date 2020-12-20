package se.lnu.joa.covid.model.usage;

public class Regression {
	private String type;
	private String dependentValue;
	private String independentValue;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDependentValue() {
		return dependentValue;
	}
	public void setDependentValue(String dependentValue) {
		this.dependentValue = dependentValue;
	}
	public String getIndependentValue() {
		return independentValue;
	}
	public void setIndependentValue(String independentValue) {
		this.independentValue = independentValue;
	}
	
	@Override
	public String toString() {
		return "Regression [type=" + type + ", dependentValue=" + dependentValue + ", independentValue="
				+ independentValue + "]";
	}
}
