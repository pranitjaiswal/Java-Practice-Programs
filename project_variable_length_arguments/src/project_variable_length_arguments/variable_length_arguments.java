package project_variable_length_arguments;

public class variable_length_arguments {
	public static void main(String args[]){
		System.out.println(average(1,2,3,4,5));
	}
	
	public static int average(int...numbers){
		int total=0;
		for(int x:numbers){
			total+=x;
		}
		return(total/numbers.length);
	}
}
