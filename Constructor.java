package module2_Strings;

public class Constructor {

	public static void main(String[] args) {
		Student s=new Student(56,78);
		s.add();
		System.out.println(s.a);
		int r=s.b;
		System.out.println(r);

	}
}
class Student
{
	int a=10,b=20,aaa=99;
	Student(int a,int b)
	{
		System.out.println("student constructor");		
	}
	Student(int aaa)
	{
		this(40,70);
//		System.out.println("Student1 Constructor");
		this.aaa=aaa;
	}
	void add()
	{
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("a+b="+(a+b)+"\n"+aaa);
		
	}
}
