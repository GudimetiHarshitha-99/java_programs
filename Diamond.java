package module2_Strings;

public class Diamond {

	public static void main(String[] args) {
		Child55 c5=new Child55();
		c5.add21();
		c5.sub21();
		c5.div21();
	}
}
interface i0
{
	void add21();
}
interface i1 extends i0
{
	void sub21();
}
interface i2 extends i0
{
	void div21();
}
class Child55 implements i1,i2
{
	public void add21()
	{
		System.out.println("Add Method");
	}
	public void sub21()
	{
		System.out.println("Sub Method");
	}
	public void div21()
	{
		System.out.println("Div Method");
	}
}