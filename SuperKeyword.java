package module2_Strings;

public class SuperKeyword {

	public static void main(String[] args) {
		Child22 c2=new Child22();
	}
}
class Parent121
{
	Parent121(int ab)
	{
		int a=10;
		System.out.println("Parent Class");
	}
}
class Child11 extends Parent121
{
	int b=50;
	double d=20.0;
	Child11(int b,double d)
	{
		super(45);
		System.out.println(b+d);
		System.out.println("Child1 Class");
	}
}
class Child22 extends Child11
{
	int b=30;
	double d=30.0;
	Child22()
	{
		super(67,90.9);
		System.out.println(this.b+this.d);
		System.out.println(super.b+super.d);
		System.out.println("Child2 Class");
	}
}