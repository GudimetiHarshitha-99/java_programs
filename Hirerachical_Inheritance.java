package module2_Strings;

public class Hirerachical_Inheritance {

	public static void main(String[] args) {
		Child21 c2=new Child21();
		c2.result2();
		c2.result();
		Child12 c1=new Child12();
		c1.result();
		c1.result1();
	}
}
class Parent2
{
	int roll=2;
	char c='A';
	void result()
	{
		System.out.println(roll);	
	}
}
class Child12 extends Parent2
{
	int m1=89;
	int m2=90;
	void result1()
	{
		System.out.println(m2);
	}
}
class Child21 extends Parent2
{
	String name="abc";
	char c1='B';
	void result2()
	{
		System.out.println(name);
	}
}