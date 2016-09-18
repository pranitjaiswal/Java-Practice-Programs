package project_random_number_generator;
import java.util.Random;

public class random_number_generator {
	public static void main(String args[]){
		Random obj=new Random();
		int counter=0;
		
		for(counter=0;counter<10;counter++){
			System.out.println(1+obj.nextInt(6));
		}
	}
}
