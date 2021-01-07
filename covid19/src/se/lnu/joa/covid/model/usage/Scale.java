package se.lnu.joa.covid.model.usage;

public class Scale {
	private String type;
	private String format;
	private String breaks;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getBreaks() {
		return breaks;
	}
	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}
	
	@Override
	public String toString() {
		return "Scale [type=" + type + ", format=" + format + ", breaks=" + breaks + "]";
	}
}
