package module2_Strings;

public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
//		c.marks();
		c.result();
		c.marks();
		System.out.println(c.name);

	}
}
class Parent
{
	String name="Harsha";
	int marks=79;
	
	void result()
	{
		System.out.println("Parent class");
		System.out.println("Name is "+name+"\n"+"Marks are "+marks);
		System.out.println();
	}
}
class Child extends Parent
{
	char grade='A';
	double per=9.8;
	void marks()
	{
		System.out.println("Child class\n"+"Grade is "+grade+"\n"+"Percentage is "+per);
	}
}