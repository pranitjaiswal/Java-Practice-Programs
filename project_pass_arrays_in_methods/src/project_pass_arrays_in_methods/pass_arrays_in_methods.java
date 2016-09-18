package project_pass_arrays_in_methods;

public class pass_arrays_in_methods {
	public static void main(String args[]){
		int array[]={3,4,5,6,7};
		change(array);		
	}
	public static void change(int x[]){
		for(int y=0;y<x.length;y++){
			x[y]=x[y]+5;
		}
		for(int y:x){
			System.out.println(y);
		}
	}
}
