package StringMethods;

public class StringMethodsIntermidiate {
	public static void main(String[] args) {
		String name = "Musharaf Aahel";
		String splitedName[] = name.split(" ");
		
		for(String x : splitedName) {
			System.out.println(x);
		}
		
		String place1 = "India";
		String place2 = new String("India");
		
		System.out.println("compareTo Method : "+ place1.compareTo(place2));
		
		System.out.println("Equals Method : "+place1.equals(place2));
		
		System.out.println("Equal to Operator : "+ (place1 == place2));
		
		System.out.println("Sub string with 1 arguments : "+ name.substring(5));
		System.out.println("Sub string with 2 arguments : "+ name.substring(9, 14));
		
		System.out.println("Char At Method : "+ name.charAt(9));
		System.out.println("Index Of Method :"+name.indexOf("A"));
	}
}
