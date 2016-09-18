package javatpoint_arraylist_functions;

import java.util.*;

public class arraylist_functions {
	public static void main(String args[]){
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Pranit");
		a1.add("Sneha");
		a1.add("ABC");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("ABC");
		a2.add("PSR");
		a2.add("RST");
		
		//a1.addAll(a2);  
		//a1.removeAll(a2);
		a1.retainAll(a2);
		
		for(String x:a1){
			System.out.println(x);
		}
	}
}
