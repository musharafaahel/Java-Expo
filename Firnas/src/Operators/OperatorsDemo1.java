package Operators;

public class OperatorsDemo1 {
	public static void main(String[] args) {
		//RELATIONAL OPERATORS
		
				int n1=4;
				int n2=5;
				
				System.out.println(n1==n2);//false
				
				String s="hello";
				String str=new String("hello");
				System.out.println(s==str);//wrong//false
				System.out.println(s.equals(str));//true
				
				System.out.println(n1>n2);//false
				System.out.println(n1>=n2);//false
				System.out.println(n1<n2);//true
				System.out.println(n1<=n2);//true
				System.out.println(n1!=n2);//true
				
				System.out.println(n1>n2 && n1<n2);//false - && - AND
				
				System.out.println(n1>n2 || n1<n2);//true - || - OR
	}
}
