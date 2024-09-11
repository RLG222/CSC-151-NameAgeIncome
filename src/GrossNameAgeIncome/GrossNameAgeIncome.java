// This is Robert Gross' 3rd Java program, made June 6th, 2023. The purpose of the program is to utilize
// the java scanner in order to print out the users name, age in 10 years, and annual income using the 
// data they provide in the console. This same objective can be achieved using the JOptionPane object.
package GrossNameAgeIncome; // package declaration

import java.util.Scanner; //insert scanner in order to be able to execute scanner commands


public class GrossNameAgeIncome { //class declaration

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); //Create Scanner to request info from user
		
		System.out.println("What is your full name?"); //request name from user
		String name = scan.next();	//store  name from user as string
		name += scan.nextLine(); //store rest of name from the user
		
		System.out.println("What is your age?"); //request age from user
		int age = scan.nextInt(); // store age as integer
		
		System.out.println("What is your monthly income?(don't include the $)"); //request monthly income from user
		double annualIncome = scan.nextDouble(); //store income as double
		
		System.out.println("Your name is " + name); //print users name
		System.out.println("Your age in 10 years will be " + (age +10)); //print users age in 10 years
		System.out.println("Your annual income is $" + (annualIncome * 12)); //print users annual income using monthly
		
		scan.close(); //end scanner
	}
			}
