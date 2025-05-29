package module2_Strings;

import java.io.IOException;
import java.sql.SQLException;

public class Exception1 {

	public static void main(String[] args){//throws IOException, SQLException{
		// TODO Auto-generated method stub
		int a=10,b=20;
		if(a>b)
		{
			try
			{
				//System.out.println("A is greater");
				throw new ArithmeticException("/ by zero");
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Exception Occurred");
			}
			finally
			{
				System.out.println("After Exception");
				System.out.println("Exception handled");
			}
		}
//		else if(a<b)
//		{
//			try
//			{
//				throw new IOException();
//			}
//			catch(IOException io)
//			{
//				System.out.println("IO Exception Occured");
//			}
//		}
		else
		{
			try
			{
				throw new SQLException();
			}
			catch(Exception e)
			{
				System.out.println("SQL");
				e.printStackTrace();
			}
//			throw new NullPointerException("null Pointer");
		}
	}

}

//class Marks
//{
//	void m11()
//	{
//		m22();
//		System.out.println("M11 Method");
//	}
//	void m22()
//	{
//		m33();
//		System.out.println("M22 Method");
//	}
//	void m33() throws IOException
//	{
//		System.out.println("M33 Method");
//		throw new IOException();
//	}
//}
