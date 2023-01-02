import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	
	static double firstNumber;
	static double secondNumber;
	static int choice;
	
	public static void printMenu() {
		Scanner myScan = new Scanner (System.in);
		
		
		System.out.println("\nWelcome to the calculator");
		System.out.println("Which operation do you want to use: \n");
		System.out.println("[1] Addition +");
		System.out.println("[2] Subtraction -");
		System.out.println("[3] Multiplicatinon *");
		System.out.println("[4] Division " + '\u00F7'); //Unicode Char number for division sign 
		System.out.println("[5] Display Memory");
		System.out.println("[6] Clear Memory");
		System.out.println("[7] Exit Calculator");
		
		if (myScan.hasNextInt())		//checks if user input is an integer
			choice = myScan.nextInt(); //if input is integer, save the value to choice
		
	}
		
		
	public static void askUserInput() {
						//method handling user input for the numbers used in the calculation
		
		boolean error = true; 
			do {			//user input tested inside a loop for exception handling
			
			Scanner myScan = new Scanner (System.in);
			System.out.println("Enter two numbers:");
			try {
			firstNumber = myScan.nextDouble();
			secondNumber = myScan.nextDouble();
			error  = false;
			
			}
			catch (InputMismatchException e) {
				System.out.println("You can only use numbers. Try again!");
				}
			
			}
			while (error);	
		
	}


 	public static void main(String[] args) {
 		
	 	boolean repeat = true;
	 	Calculator myCalculator = new Calculator();
		
		
		while (repeat){ 		 //as long as repeat is true program will re-start
		printMenu();			// calls printMenu method
		
			
			switch(choice) {
				case 1: 
					askUserInput();
					System.out.println("Result: " +firstNumber+ " - " +secondNumber+ " = " +myCalculator.addition(firstNumber, secondNumber));
					break;
					
				case 2:
					askUserInput();
					System.out.println("Result: " +firstNumber+ " - " +secondNumber+ " = " +myCalculator.subtraction(firstNumber, secondNumber));
					break;
				
				case 3:
					askUserInput();
					System.out.println("Result: " +firstNumber+ " * " +secondNumber+ " = " +myCalculator.multiplication(firstNumber, secondNumber));
					break;
					
				case 4:
					askUserInput();
					System.out.println("Result: " +firstNumber+ " / " +secondNumber+ " = " +myCalculator.division(firstNumber, secondNumber));	
					break;		
			
				case 5:
					myCalculator.printMemory();
					break;
					
				case 6:
					myCalculator.clearMemory();
					break;
					
				case 7:
					repeat = false;
					System.out.println("EXIT");
					break;	
					
				default: 
						System.out.println("No such operator available. Make a new choise");
							
			}
		}
	}	

}
