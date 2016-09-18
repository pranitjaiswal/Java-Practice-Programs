package project_basic_calculator;
import java.util.Scanner;

public class basic_calculator {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter the 2 numbers below: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=a+b;
		System.out.println("Addition: " +c);
	}
}
