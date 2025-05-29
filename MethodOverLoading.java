package module2_Strings;

public class MethodOverLoading {

	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
		gc.add();
		gc.sub(43,33);
		gc.mul(5);
		gc.div(34,2);
	}

}
class GrandChild
{
//	/int a=80,b=10;
	void add()
	{
		System.out.println("Addition");
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void mul(int a)
	{
//		System.out.println(this.a*this.a);
		System.out.println(a*a);
	}
	void div(double d,int a)
	{
		System.out.println(d/a);
	}
}