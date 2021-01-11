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

public class template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
