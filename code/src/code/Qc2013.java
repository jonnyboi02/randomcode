/*
 * A program to do blah
 * 
 * 
 * code by Jonathan Chiu 
 * 
 * 
 * 
*/

package code;

import java.util.Scanner;

public class Qc2013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startSystem();
		
		System.exit(0);

	}
	
	public static void startSystem() {
		int userInput = InputInt("Age?");
		while (!(userInput==-1)) {
			if (userInput>-1 && userInput<120) {
				printInfo(userInput);
			}
			else {
				System.out.println("Enter a valid input");
			}
			userInput = InputInt("Age?");
		}
		System.out.println("good bye");
	}
	
	
	//this part of the program prints out the info depending on the age of the user
	public static void printInfo(int userInput) {
		if(userInput>18 && userInput <65) {
			System.out.println("As you are "+ userInput + " and in the 18 - 65 age range it will cost you 3 pounds");
		}
		else if(userInput<=18 && userInput>4)   {
			System.out.println("As you are"+ userInput+ " and in the 5 - 18 ager range it will cost you 2 pounds ");
		}
		else if(userInput<5) {
			System.out.println("No need to pay");
		}
		else {
			System.out.println("As you are 65 and over you will only be charged 2 pounds");
			
		}
		
	}
	
	
	/*
	 * The input methods for the program
	 */
	public static int InputInt(String question) {
		System.out.println(question);
		Scanner scan= new Scanner(System.in);
		return scan.nextInt();
		
	}
	public static String InputString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}

}
