package project_many_methods_instances;
import java.util.Scanner;

public class many_methods {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		method_1 obj=new method_1();
		System.out.println("Enter the name of your first gf");
		String temp=sc.nextLine();
		obj.setName(temp);
		obj.saying();
	}
}
