package StringMethods;

public class StringBasics {
	public static void main(String[] args) {
		//Method 1
		String name1 = "Musharaf Aahel. A";
		//This will create only one object in memory
		
		//Method 2
		String name2 = new String("Musharaf Aahel. A");
		//This will create two objects in memory
		
		
		//Method 3
		StringBuffer name3 = new StringBuffer("Musharaf Aahel. A");
		//This is used only when we modify content very often
		//Performance worst security good
		
		StringBuilder name4 = new StringBuilder("Musharaf Aahel. A");
		//Performance good security lack
	}
}
