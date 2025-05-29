package module2_Strings;

public class Interfaces {

	public static void main(String[] args) {
		Child99 c12=new Child99();
		c12.add66();
		c12.sub66();
		c12.sub222();

	}

}
interface parent90
{
	void add66();
	static void sub222()
	{
		System.out.println("Sub");
	}
}
interface parent20
{
	void sub66();
}
class Child99 implements parent90,parent20
{
	public void add66()
	{
		System.out.println("Add Method");
	}
	public void sub222() {
		System.out.println("Sub 222");
		
	}
	public void sub66()
	{
		System.out.println("Sub Method");
	}
}