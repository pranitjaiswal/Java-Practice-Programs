package project_enhanced_for_loops;

public class enhanced_for_loops {
	public static void main(String args[]){
		int array[]={3,4,5,6,7};
		int total=0;
		
		for(int x:array){
			total+=x;
		}
		System.out.println(total);
	}
}
