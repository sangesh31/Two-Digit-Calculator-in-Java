package project1;

import java.util.Scanner;
public class Calculate {
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	boolean yes=true;
	while(yes) {
	System.out.println("Welcome to Two Digit Calculator");
	System.out.println("1.ADDITION \n2.SUBRACTION\n3.DIVISION\n4.MULTIPLICATION\n5.MODULO\n6.EXIT ");
	System.out.print("Enter your Choice:");
	int option=sc.nextInt();
	switch(option) {
	case 1:
		System.out.print("Enter First value:");
		float a=sc.nextFloat();
		System.out.print("Enter Second value:");
		float b=sc.nextFloat();
		System.out.println("Result:"+(a+b));
		break;
	case 2:
		System.out.print("Enter First value:");
		 a=sc.nextFloat();
		System.out.print("Enter Second value:");
		 b=sc.nextFloat();
		System.out.println("Result:"+(a-b));
		break;
	case 3:
		System.out.print("Enter First value:");
		 a=sc.nextFloat();
		System.out.print("Enter Second value:");
		 b=sc.nextFloat();
		System.out.println("Result:"+(a/b));
		break;
	case 4:
		System.out.print("Enter First value:");
		 a=sc.nextFloat();
		System.out.print("Enter Second value:");
		 b=sc.nextFloat();
		System.out.println("Result:"+(a*b));
		break;
	case 5:
		System.out.print("Enter First value:");
		 a=sc.nextFloat();
		System.out.print("Enter Second value:");
		 b=sc.nextFloat();
		System.out.println("Result:"+(a%b));
		break;
	case 6:
		System.out.println("Exiting...");
		yes=false;
        break;
	default:
		System.out.println("Invalid Choice");
		
		
	}}
	
	
}
}
