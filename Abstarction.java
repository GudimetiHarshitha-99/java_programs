package module2_Strings;

public class Abstarction {

	public static void main(String[] args) {
		Child23 c2=new Child23();
		c2.m3();
		System.out.println(c2.m4());
		Demo d=new Child23();
		d.m1();
//		d.m6();
	}
}
abstract class Demo
{
	void m1()
	{
		System.out.println("M1 Parent");
	}
	int m2()
	{
		System.out.println("M2 Parent");
		return 2;
	}
	void m5()
	{
		System.out.println("M5 Parent");
	}
	public abstract void m3();
	abstract int m4();
}
class Child23 extends Demo
{

	public void m3()
	{
		System.out.println("M3 Overriding");
	}
	int m4()
	{
		return 50;
	}
	void m5()
	{
		System.out.println("M5 child");
	}
	void m6()
	{
		System.out.println("M6 Child");
	}
	
}