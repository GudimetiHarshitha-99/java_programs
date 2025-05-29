package module2_Strings;

public class PalindromeString {

	public static void main(String[] args) {
		String s="a man,a plan @ a canal ? panama",s1="",s2="";
		for(int x=0;x<s.length();x++) 
		{
			char c=s.charAt(x);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
		StringBuffer sb=new StringBuffer(s1);
		sb=sb.reverse();
		s2=sb.toString();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
