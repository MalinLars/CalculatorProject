import java.util.ArrayList;
public class Calculator {	
	
	double result;
	private ArrayList <Double> memoryList;
	
	public Calculator() {
		memoryList = new ArrayList <Double> ();
	}
		
		/*
		 * Methods for calculating the result
		 */
	
		public double addition(double firstNumber, double secondNumber) {
			result = firstNumber + secondNumber;
			memoryStorage(result);
			return result;
			
		}
		public double subtraction(double firstNumber, double secondNumber) {
			result = firstNumber - secondNumber;
			memoryStorage(result);
			return result;
			
		}
		public double multiplication(double firstNumber, double secondNumber) {
			result = firstNumber * secondNumber;
			memoryStorage(result);
			return result;
			
		}
		public double division(double firstNumber, double secondNumber) {
			result  = firstNumber / secondNumber;
			memoryStorage(result);
			return result;	
		}
		
			/*
			 *Methods for memory function
			 */
		
		public void memoryStorage(double result) {
			memoryList.add(result);
		}
		
		public void printMemory() {
			for (int i = 0; i < memoryList.size(); i++) {
			}
			System.out.print("Stored values are: " +memoryList+ "\n");
		}
	
		public void clearMemory() {
			memoryList.clear();
			System.out.println("Memory cleared");
		}
				
}
