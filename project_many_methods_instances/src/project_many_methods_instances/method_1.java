package project_many_methods_instances;

public class method_1 {
	private String girlName;
	public void setName(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("You first gf is %s",getName());
	}
}
