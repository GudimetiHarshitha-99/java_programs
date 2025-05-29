package module2_Strings;

public class Static {
//
	public static void main(String[] args) {
		Parent13 p3=new Parent13();
		p3.mul();
//		Parent13.sub();
//		Parent13 p3=new Parent13();
		mul();
		System.out.println(Parent13.add());
	}
	static void mul()
	{
		System.out.println("mul");
	}
}




class Parent13
{
	static int a=30;
	int b=90;
	static int add()
	{
		System.out.println("Static a "+a);
//		System.out.println("B value "+b);
		return 100;
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
	{
		System.out.println("Instance Block");
	}
	{
		System.out.println("Instance Block 1");
	}
	void mul()   
	{
		System.out.println("A value "+a+" and "+"B value "+b);
	}
	static
	{
		System.out.println("Static Block");
	}
}
