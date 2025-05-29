package module2_Strings;

public class LambdaFunction {

	public static void main(String[] args) {
		aaa i=()->
		{
			System.out.println("Lambda Function");
		};
		i.add1();
	}

}
@FunctionalInterface
interface aaa
{
	void add1();
}
//class abc
//{
//	aaa i=()->
//	{
//		System.out.println("Lambda Function");
//	};
////	i.add1();
//}