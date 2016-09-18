package project_constructors;

public class construct {
	private String girlName;
	
	public construct(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("\nThe name of the first gf is: %s", getName());
	}
}
