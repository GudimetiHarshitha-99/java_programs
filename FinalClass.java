package module2_Strings;

public class FinalClass {

	public static void main(String[] args) {
		Parent3 p3=new Child3();
		p3.add();
	}
}
class Parent3
{
	void add()
	{
		System.out.println("Final Parent");
	}
}
final class Child3 extends Parent3
{
	final void add()
	{
		System.out.println("Final Child");
	}
}