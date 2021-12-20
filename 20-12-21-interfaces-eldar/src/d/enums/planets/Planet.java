package d.enums.planets;

public enum Planet {

	MERCURY(4_880, 57_910_000), 
	
	VENUS(12_104, 108_200_000), 
	
	EARTH(12_756, 149_600_000), 
	
	MARS(0,0), 
	
	JUPITER(0,0), 
	
	SATURN(0,0), 
	
	URANUS(0,0), 
	
	NEPTUNE(0,0);
	
	// attributes
	public final int diameter;
	public final int distance;
	
	// CTOR
	private Planet(int diameter, int distance) {
		System.out.println("=== now creating: " + this);
		this.diameter = diameter;
		this.distance = distance;
	}
	
	

}
