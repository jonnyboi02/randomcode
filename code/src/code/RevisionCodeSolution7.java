/*
 * - Method called getUserInput
- Does not return anything
- Takes no arguments
- Prints out a message saying "Please enter a number"
- Stores the user input in an int variable called inputNumber (use Integer.parseInt
to convert the string)
- Makes a call to the method called multiple passing the variable inputNumber
as an argument
- Stores the result of the method call in an int variable called total
- Prints the value of total to the screen
b)
- Method called multiply
- Returns an int
- Takes an in argument called number
- Multiplies number by 10 and stores it in an int variable called increase
- Returns increase
 * 
 * 
 * 
*/

package code;

import java.util.Scanner;

public class RevisionCodeSolution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//asks the user to input a number
	public static void getUserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int inputNumber = Integer.parseInt(scan.nextLine());
		int total = multiply(inputNumber);
		System.out.println(total);
		
	}
	//multiplies the number by 10
	public static int multiply(int number) {
		int increase = 10*number;
		return increase;
	}
	
	


}
