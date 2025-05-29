package module2_Strings;

import java.util.*;
public class Setter {

	public static void main(String[] args) {
//		Student1 s=new Student1(1,"harsha",'A');
//		Student1 s1=new Student1(2,"asai",'B');
//		List<Integer>list=new ArrayList<>();
		List<Student1>list1=new ArrayList<>();
		list1.add(new Student1(1,"harsha",'A'));
		list1.add(new Student1(2,"Harsha",'B'));
		list1.add(new Student1(3,"Sai",'C'));
		list1.add(new Student1(4,"Queue",'A'));
		Collections.sort(list1,new Rollno());
		System.out.println(list1);
//		Queue<Integer>q=new PriorityQueue<>();
//		System.out.println(s);
//		System.out.println(s1);
		
	}

}
class Student1
{
	int roll;
	String name;
	char section;
	public Student1(int roll,String name,char section)
	{
		super();
		this.roll=roll;
		this.name=name;
		this.section=section;
	}
	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + ", section=" + section + "]";
	}
	
}
class Rollno implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s, Student1 s1) {
		return Integer.compare(s.roll, s1.roll);
	}
	
}
class Name implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s, Student1 s1) {
		return s.name.compareTo(s1.name);
	}
	
}