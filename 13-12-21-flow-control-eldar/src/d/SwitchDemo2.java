package d;

public class SwitchDemo2 {

	public static void main(String[] args) {
		String day = "aaa";
		System.out.println(day);
		switch(day) {
		case "sunday":
		case "monday":
		case "wednesday":
		case "thursday":
			System.out.println("leave at 16:30");
			break;
		case "tuesday":
			System.out.println("leave at 12:30");
			break;
		case "friday":
		case "saturday":
			System.out.println("go home - it's weekend");
			break;
			
			default:
				System.out.println(day + " is not a day");
		}
		
		System.out.println("=== END ===");
	}
	
}
