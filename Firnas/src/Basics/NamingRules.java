package Basics;

public class NamingRules {
	public static void main(String[] args) {
		//Variable Naming Rules
		/*
		 * 1. First character can be _ or $ or A to Z or a to z.
		 * 2. Second and More character can be _ or $ or A to Z or a to z or 0 to 9.
		 * 3. It cannot contain any special characters other than _ or $.
		 * 4. It should not contain space in between.
		 * 
		 *  
		 *  Valid Identifier
		 *  
		 *  name
		 *  _name
		 *  $name
		 *  
		 *  age_19
		 *  $_19age_$kt
		 *  
		 * InValid Identifier
		 * 
		 * 1name
		 * nam e
		 * #name
		 * &nam e
		 * 
		 * 
		 * Naming Rules
		 * 
		 * 1.Variable Name, Method Name, Package Name first letter should be small
		 * 2.Class Name first letter should be Capital
		 *
		 */
		
		String $_name  = "Musharaf Aahel";
		int age_greater_than_18 =  21;
		
		char initial_1$ = 'A';
		
		System.out.println("Name : "+$_name+"\nage : "+age_greater_than_18+"\nInitial : "+initial_1$);;
	}
}
