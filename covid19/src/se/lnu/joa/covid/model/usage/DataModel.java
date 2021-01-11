package se.lnu.joa.covid.model.usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataModel {
	private String dataSource;
	private String datasetName;
	private List<DataFilter> filters = new ArrayList<>();
	private List<String> columns = new ArrayList<>();
	private String dateformat;
	
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
	public List<DataFilter> getFilters() {
		return filters;
	}
	public void setFilters(List<DataFilter> filters) {
		this.filters = filters;
	}
	public List<String> getColumns() {
		return columns;
	}
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}
	public String getDateformat() {
		return dateformat;
	}
	public void setDateformat(String dateformat) {
		this.dateformat = dateformat;
	}
	@Override
	public String toString() {
		return "DataModel [dataSource=" + dataSource + ", datasetName=" + datasetName + ", filters=" + filters
				+ ", columns=" + columns + ", dateformat=" + dateformat + "]";
	}
	
	
}
