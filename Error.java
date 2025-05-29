package module2_Strings;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abcd a=new Abcd();
		a.m1();

	}

}
class Abcd
{
	void m1()
	{
		m2();
		System.out.println("M1 method");
	}
	void m2()
	{
		m1();
		System.out.println("M2 method");
	}
}