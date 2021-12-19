package a;

import java.util.Arrays;

public abstract class Shape {

	private String color;
	private static int numberOfShapes;
	
	{
		numberOfShapes++;
	}
	

	public static int getNumberOfShapes() {
		return numberOfShapes;
	}

	public static final String[] COLORS =

			{ "BLACK", "RED", "GREEN", "BLUE", "WHITE", "ORANGE" };

	public Shape(String color) {
		super();
		setColor(color);
	}

	public Shape() {
		this("BLACK");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		for (int i = 0; i < COLORS.length; i++) {
			if(color.equals(COLORS[i])){
				this.color = color;
				return;
			}
		}
		System.out.println(color + 
				" is not valid. Vlaid values are: " + 
				Arrays.toString(COLORS));
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	public abstract  double getArea() ;
	

	
}
