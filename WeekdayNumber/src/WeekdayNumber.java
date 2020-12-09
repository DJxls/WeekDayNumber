import java.util.Scanner; 

/** 
 * Write a Java program that keeps a number from 
 * the user and generates an integer between 1 and 7 
 * and displays the name of the weekday.

 * @author Darren
 *
 */

public class WeekdayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean exit = false; 
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

		do {
			System.out.println("Enter any number from 1 to 7");
			Scanner scanner = new Scanner(System.in); 
			String input = scanner.nextLine();
			
			if(input.isEmpty()) {
				exit = true; 
			}else {
				int num = Integer.parseInt(input);
				System.out.println(num > 0 ? days[(num - 1)%7] : "Must be greater than 0");
			}
			if(exit) {
				scanner.close();
			}
		}while(!exit);
	}

	private static int parseInt(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

}
