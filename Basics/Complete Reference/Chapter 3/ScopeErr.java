// This program will not compile

class ScopeErr{
	public static void main(String args[]){
		int bar = 1;     
		{  			//Create a new scope 
			int bar = 2;	//Compile-tiem error - bar already defined.
		}
	}
}