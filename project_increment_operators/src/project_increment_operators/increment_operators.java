package project_increment_operators;
import java.util.Scanner; 

public class increment_operators {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int tuna=5;
		int bass=8;
		++tuna;
		System.out.println(tuna);
		System.out.println(++tuna);
		System.out.println(tuna);
		System.out.println(--tuna);
		System.out.println(tuna--);
		System.out.println(tuna);
		tuna+=5;
		System.out.println(tuna);
		tuna-=5;
		System.out.println(tuna);
		tuna*=5;
		System.out.println(tuna);
	}
}
