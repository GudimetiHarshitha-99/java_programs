package module2_Strings;

public class ConstructorOverLoading {

	public static void main(String[] args) {
		Parent22 p=new Parent22(11,7);
	}
}
class Parent22
{
	Parent22()
	{
		System.out.println("Default");
	}
	Parent22(int a)
	{
		System.out.println("Integer");
	}
	Parent22(double a,double d)
	{
		System.out.println("Integer and Double");
	}
	Parent22(double a,int b)
	{
		System.out.println("Double and Integer");
	}
}