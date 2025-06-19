package applications;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double firstNum = sc.nextDouble();
		
		System.out.println("Now insert the operator (+ , -, *, /)");
		char op = sc.next().charAt(0);
		double result = 0;
		
		System.out.print("Enter the second number: ");
		double secondNum = sc.nextDouble();
		
		switch(op) {
		case '+': 
			result = firstNum + secondNum; 
			break;
		case '-': 
			result = firstNum - secondNum; 
			break;
		case '*': 
			result = firstNum * secondNum; 
			break;
		case '/':
			if (secondNum != 0) {
				result = firstNum / secondNum;
				break;
			}
			else {
				System.out.println();
				System.out.println("Cannot divide by zero.");
				sc.close();
				return;
			}
		default: System.out.println("You entered an invalid operator.");
		sc.close();
		return;
		
		}
		
		System.out.printf("Your result is: %.2f", result);
		
		
		
		sc.close();
	}

}
