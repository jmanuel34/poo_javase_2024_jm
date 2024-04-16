package service;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public abstract double area();
}
