package se.lnu.joa.covid.model.usage;

public class DataModel {
	private String dataSource;
	private String datasetName;
	
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getDatasetName() {
		return datasetName;
	}
	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
	}
	
	@Override
	public String toString() {
		return "DataModel [dataSource=" + dataSource + ", datasetName=" + datasetName + "]";
	}
}
