package javatpoint_userdefinedobjects_arraylist;
import java.util.*;
class student {
	int rollno;
	String name;
	int number;
	student(int rollno, String name, int number){
		this.rollno=rollno;
		this.name=name;
		this.number=number;
	}
}
public class userdefinedobjects_arraylist {
	public static void main(String args[]){
		ArrayList<student> al=new ArrayList<student>();
		student s1=new student(1,"Pranit",100);
		student s2=new student(2,"Sneha",101);
		student s3=new student(3,"ABC",102);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<student> a2=new ArrayList<student>();
		student s4=new student(4,"XYZ",104);
		student s5=new student(5,"PSR",105);
		student s6=new student(3,"ABC",102);

		
		a2.add(s4);
		a2.add(s5);
		a2.add(s6);
		
		al.addAll(a2);
		//al.removeAll(a2);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext()){
			student st=(student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.number );
		}
	}
}
