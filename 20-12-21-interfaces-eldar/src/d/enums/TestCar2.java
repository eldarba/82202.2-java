package d.enums;

import java.util.Arrays;
import java.util.Scanner;

import d.enums.Car.Type;

public class TestCar2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter car number: ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("enter car speed: ");
		int speed  = Integer.parseInt(sc.nextLine());
		
		System.out.print("enter car color " + Arrays.toString(Color.values()) + ": ");
		Color color = Color.valueOf(sc.nextLine());
		System.out.print("enter car type " + Arrays.toString(Type.values()) + ": ");
		Type type = Type.valueOf(sc.nextLine());
		
		Car car = new Car(number, speed, color, type);
		System.out.println(car);
		
		sc.close();
	}

}
