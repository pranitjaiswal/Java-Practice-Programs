package project_math_operators;
import java.util.Scanner;

public class math_operators {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int girls, boys; 
		double people;
		girls=11;
		boys=3;
		people=girls+boys;
		System.out.println(people);
		people=girls-boys;
		System.out.println(people);
		people=girls*boys;
		System.out.println(people);
		people=girls/boys;
		System.out.println(people);
		people=girls%boys;
		System.out.println(people);
	}
}
