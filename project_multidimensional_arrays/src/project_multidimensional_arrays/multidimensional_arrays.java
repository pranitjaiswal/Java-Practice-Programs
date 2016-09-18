package project_multidimensional_arrays;

public class multidimensional_arrays {
	public static void main(String args[]){
		int array[][]={{1,2,3,4},{5,6,7,8}};
		int array1[][]={{9,10},{3,4,2}};
		System.out.println("This is the first array:");
		display(array);
		System.out.println("This is the second array:");
		display(array1);
	}
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.print(x[row][col]+ "\t");
			}
			System.out.println();
		}
	}
}
