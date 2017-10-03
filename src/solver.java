import java.util.InputMismatchException;
import java.util.Scanner;

public class solver {

	public static int a;
	public static int b;
	public static int c;
	private static Scanner input;
	
	public static void main(String[] args) {
		run();
	}
	
	
	public static void run() {
		input = new Scanner(System.in);
		
		System.out.println("For the equation ax^2 + bx + c = 0");
			
		try {	
			//Asks user to enter a value for a, b, and c and saves the number entered
			System.out.println("Please enter a value for a ");
			a = input.nextInt();
			
			System.out.println("Please enter a value for b ");
			b = input.nextInt();
			
			System.out.println("Please enter a value for c ");
			c = input.nextInt();
		}
		//Catches anything but int that is entered 
		catch (InputMismatchException e) {
			System.out.println("Error: please ensure you enter an int");
			run();
			return;
		} 
		
		System.out.println("Is this equation correct? " + a + "x^2 + " + b + "x + " + c + " = 0" + ", Y for Yes and N for No");
		String userInput = input.next();
		//Checks user input is not equal to y
		if(!userInput.toLowerCase().equals("y")){
			run();			
		}	
		
		solve();
	}
	
	public static void solve() {
		// adds b^2 and 4ac and then takes the square root 
		Double squareRoot = Math.sqrt(b*b - 4*a*c);
		
		if(squareRoot.isNaN()) {
			System.out.println("Error: square root of a negative number");
			run();
			return;
		}
		
		if(a == 0) {
			System.out.println("Error: \"a\" cannot be 0.");
			run();
			return;
		}
		
		//Calculates the results
		double result1 = (-b + squareRoot) / (2*a);
		double result2 = (-b - squareRoot) / (2*a);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
