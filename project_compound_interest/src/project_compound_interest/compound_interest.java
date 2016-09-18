package project_compound_interest;

public class compound_interest {
	public static void main(String args[]){
		double amount = 0;
		double principal=10000;
		double rate=0.01;
		int day;
		
		for(day=1; day<=20; day++){
			amount=principal*Math.pow(1+rate, day);
			System.out.println(day+ "   " +amount);
		}
		
	}
}
