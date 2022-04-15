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
		
		System.out.println("Length Method : "+name.length());
		
		System.out.println("ToLowerCase Method : "+name.toLowerCase());
		
		System.out.println("ToUpperCase Method : "+name.toUpperCase());
		
	}
}
