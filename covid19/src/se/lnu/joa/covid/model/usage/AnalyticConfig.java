package se.lnu.joa.covid.model.usage;

public class AnalyticConfig {
	private DataModel dataModel;
    private Visualization visualization;
    private Animation animation;
    private Regression regression;
    
    public DataModel getDataModel() {
		return dataModel;
	}

	public void setDataModel(DataModel dataModel) {
		this.dataModel = dataModel;
	}

	public Visualization getVisualization() {
		return visualization;
	}

	public void setVisualization(Visualization visualization) {
		this.visualization = visualization;
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	public Regression getRegression() {
		return regression;
	}

	public void setRegression(Regression regression) {
		this.regression = regression;
	}
	
	

	@Override
	public String toString() {
		return "AnalyticConfig [dataModel=" + dataModel + ", visualization=" + visualization + ", animation="
				+ animation + ", regression=" + regression + "]";
	}
}
