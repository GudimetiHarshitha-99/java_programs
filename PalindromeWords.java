package module2_Strings;

public class PalindromeWords {

	public static void main(String[] args) {
		String s="mom and dad",s2="";
		String arr[]=s.split(" ");
//		for(String s1:arr)
//			System.out.println(s1);
		for(int x=0;x<arr.length;x++)
		{
//			s2="";
			String s1=arr[x];
			StringBuffer sb=new StringBuffer(s1);
			sb=sb.reverse();
//			s2=s2+sb.toString();
			s2=sb.toString();
			if(s2.equals(s1))
				System.out.println(s2);
		}
	}

}
