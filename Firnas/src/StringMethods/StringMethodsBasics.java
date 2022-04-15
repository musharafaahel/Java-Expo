package StringMethods;

public class StringMethodsBasics {
	public static void main(String[] args) {
		String fname = "Musharaf";
		String lname = "Aahel";
		System.out.println("Concatenation operator : "+ fname+ " "+ lname); 
		/*
		 * 	String Concatenation
		 *  here "+" is used as concatenation operator
		 *   
		 */
		
		String name = fname.concat(" "+lname);
		System.out.println("Concat Method : "+name);
		
	}
}
