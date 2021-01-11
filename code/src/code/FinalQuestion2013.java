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

//this is the class
class info{
	String name;
	String postcode;
}


public class FinalQuestion2013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max  = 100;
		info[] information = new info[max];
		 
		enterInfo(information, max);
		
		
		System.out.println("Enter X to stop the program");
		String userInput = InputString("Enter the name of the attraction");
		while(!(userInput.equals("X"))) {
			printInfo(information ,userInput);
			System.out.println("Enter X to stop the program");
			userInput = InputString("Enter the name of the attraction");
			
		}
		
		System.exit(0);
		
		
		
		
		
	}
	
	public static void printInfo(info[] information, String userInput) {
		int check =  search(information, userInput);
		if (check == -1) {
			System.out.println("Enter a valid attraction");
		}
		else {
			System.out.println(getAttraction(information[check]) +  "/t" + getPostcode(information[check]));
		}
		
		
	}
	
	
	
	public static String getPostcode(info information) {
		return information.postcode;
		
	}
	
	public static String getAttraction(info information) {
		return information.name;
	}
	
	
	
	// searches the userinput to see if it exists in the system.
	public static int search(info[] information , String userInput) {
		final int max = 100;
		for(int x = 0;x<100;x++) {
			if(userInput.equals(information[x].name)) {
				return x;
			}
		}
		return -1;
	}
	
	
	
	public static void enterInfo(info[] information, int max) {
		
		for(int x = 0; x<max;x++) {
			String attraction =  InputString("Enter the attraction");
			String postcode = InputString ("Enter the postcode");
			information [x] = createRecord(attraction, postcode);
			
			
		}
		
	}
	
	
	//createas the record and sets the fields
	public static info createRecord(String attraction, String postcode) {
		info b = new info();
		b.name = attraction;
		b.postcode = postcode;
		return b;
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
