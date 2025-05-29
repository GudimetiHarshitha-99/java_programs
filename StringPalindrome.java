package module2_Strings;
public class StringPalindrome {

	public static void main(String[] args) {
//		String s1="MALAYALAM",s2="";
//		StringBuffer sb=new StringBuffer(s1);
//		System.out.println(sb);
//		System.out.println(sb.reverse());
//		s2=sb.toString();
//		if(s1.equals(s2))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		
		
//		String s1="Hello@123",s2="";
//		for(int x=s1.length()-1;x>=0;x--)
//		{
//			s2=s2+s1.charAt(x);
//		}
//		if(s2.equals(s1))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
		
		
		
		
		String num="121",s2="";
		StringBuffer sb=new StringBuffer(num);
		sb.reverse();
		System.out.println(sb);
		s2=sb.toString();
		if(num.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
