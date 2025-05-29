package module2_Strings;

public class EvenOddString {

	public static void main(String[] args) {
		String s1="hello all good morning";
		String s2="",s3="";
		String arr[]=s1.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			s2=arr[x];
			if(x%2==0)
			{
				for(int y=0;y<s2.length();y++)
				{
					char c=s2.charAt(y);
					if(y==0)
					{
						s3=s3+Character.toUpperCase(s2.charAt(y));
					}
					else
					{
						s3=s3+s2.charAt(y);
					}
				}
//				s3=s3+s2;
			}
			else
			{
				StringBuffer sb=new StringBuffer(s2);
				sb=sb.reverse();
				s3=s3+sb.toString();
			}
			s3=s3+" ";
		}
		System.out.println(s3);
	}
}


// Hello lla Good gninroM
