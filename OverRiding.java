package module2_Strings;

public class OverRiding {

	public static void main(String[] args) {
//		Animal a=new Rabbit();   // upcasting
//		a.name();
		Parent4 pa=new Child4();
		pa.m1();
		System.out.println(pa.m2());
		pa.m3();
		pa.m4();
	}

}
//class Animal
//{
//	void name()
//	{
//		System.out.println("Animal Class");
//	}
//}
//class Rabbit extends Animal
//{
//	void name()
//	{
//		System.out.println("Rabbit Class");
//	}
//}


class Parent4
{
	void m1()
	{
		System.out.println("M1 Marks");
	}
	Object m2()
	{
		System.out.println("M2 Marks");
		return new Object();
	}
	void m3()
	{
		System.out.println("M3 Marks");
	}
	void m4()
	{
		System.out.println("M4 marks");
	}
}




class Child4 extends Parent4
{
	Number m2()
	{
		System.out.println("M2 Marks Child");
		return 20;
	}
	void m3()
	{
		System.out.println("M3 Marks Child");
	}
}