package d.enums.planets;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter planet name " + Arrays.toString(Planet.values()));
		Planet planet = Planet.valueOf(sc.nextLine());
		System.out.println("you entered: " + planet);
		System.out.println("this is planet number " + (planet.ordinal() + 1) + " from the sun");
		System.out.println("diameter " + planet.diameter);
		System.out.println("distance " + planet.distance);

	}

}
