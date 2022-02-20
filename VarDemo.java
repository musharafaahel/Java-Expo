// A simple demonstration of local variable type inference.

class VarDemo {
	public static void main(String args[]){
		
		//Use type inference to determine type of the
		//variable name avg. In this case, double is inferred.
		var avg = 10.0;
		System.out.println("Value of avg : "+avg);

		//In the following context var is not predifined indentifier 
		//It is simply user defined variable name
		int var = 1;
		System.out.println("Value of var : "+var);
		
		var k = -var;
		System.out.println("Value of k : "+k);
	}	
}