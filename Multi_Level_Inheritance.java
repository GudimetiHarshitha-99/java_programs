package module2_Strings;

public class Multi_Level_Inheritance {

	public static void main(String[] args) {
		Child2 c2=new Child2();
		c2.marks();
		c2.marks1();
		c2.marks2();
	}
}
class Parent1
{
	int marks=80;
	String name="Harshi";
	Parent1()
	{
		System.out.println("Parent1\nMarks "+marks);
	}
	void marks()
	{
		System.out.println("Name is "+name+"\n"+"Marks are "+marks);
	}
}
class Child1 extends Parent1
{
	int roll=2;
	char grade='B';
	Child1()
	{
//		this(99,"harshitha");
		System.out.println("Child1\nRoll is "+roll);
	}
	void marks1()
	{
		System.out.println("Roll is "+roll+"\nGrade is "+grade);
	}
}
class Child2 extends Child1
{
	String name="Inheritance";
	String type="Java";
	Child2()
	{
//		this(22,'C');
		System.out.println("Child2\n"+"Name is "+name);
	}
	void marks2()
	{
		System.out.println("Name is "+name+"\nType is "+type);
	}
}