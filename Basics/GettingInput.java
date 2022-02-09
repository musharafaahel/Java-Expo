package Basics;

import java.util.Scanner;

public class GettingInput {
	public static void main(String[] args) {
		System.out.println("Getting Input from user");
		int age;
		//--For getting input you should import scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
		age = scan.nextInt();
		scan.close();
		System.out.println("Your age after 10 years : "+(age + 10));
	}
}
