package se.lnu.joa.covid.model.usage;

public class Axes {
	
	private Axis x;
	private Axis y;
	private Axis z;
	
	public Axis getX() {
		return x;
	}
	public void setX(Axis x) {
		this.x = x;
	}
	public Axis getY() {
		return y;
	}
	public void setY(Axis y) {
		this.y = y;
	}
	public Axis getZ() {
		return z;
	}
	public void setZ(Axis z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "Axes [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
