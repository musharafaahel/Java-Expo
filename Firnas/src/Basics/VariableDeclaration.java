package Basics;

public class VariableDeclaration {
	public static void main(String[] args) {
		//Declaration of Variable has three parts 
		/*
		 * 1.Data Type
		 * 2.Identifier (Variable name)
		 * 3.Value (May or May not present)
		 */
		//Syntax : data_type variable_name = value;
		int num = 100;
		int age;
		
		System.out.println("Num = "+num+" Age = "+(age=200));
		//Even though if you assign values to variable in output statement it will be stored
		System.out.println("Age = "+age);
		
	}
}
