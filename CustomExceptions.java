package module2_Strings;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) throws VoterException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age<18 || age>=60)
		{
//			try
//			{
//				throw new VoterException("Not Eligible For Vote");
//			}
//			catch(Exception e)
//			{
//				System.out.println("Yes");
//			}
			
			throw new VoterException("Not Eligible For Vote");
		}
		else
		{
			System.out.println("Welcome Voter You are Eligible For Vote");
		}
	}
}
class VoterException extends Exception
{
	public VoterException()
	{
		super();
	}
	 VoterException(String name)
	{
		super("Not Eligible");
//		 System.out.println("Not ELigible for vote");
	}
}