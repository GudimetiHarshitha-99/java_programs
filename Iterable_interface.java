package module2_Strings;

public class Iterable_interface {

	public static void main(String[] args) {
		Two t=new Two();
		Xyz x=t.Student();
		System.out.println(x.add87());
	}

}
interface Abcd1
{
	int add87();
}
class  Xyz implements Abcd1
{

	@Override
	public int add87() {
		return 30;
	}
	
}
class Two
{
	public Xyz Student()
	{
		Xyz a=new Xyz();
		return a;
//		return new Xyz();
		
	}
}
