package module2_Strings;
import java.util.Scanner;
public class CheckedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		try
		{
			System.out.println(10/a);
			int arr[]=new int[a];
			System.out.println(arr[a]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
