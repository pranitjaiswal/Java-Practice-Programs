package project_method_parameters;
import java.util.Scanner;

public class method_parameters {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		parameters obj=new parameters();
		System.out.println("Enter you name");
		String name=sc.nextLine();
		obj.simpleMessage(name);
	}
}
