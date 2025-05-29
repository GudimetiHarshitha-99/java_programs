package module2_Strings;

public class AlternateWordsInStringArray {

	public static void main(String[] args) {
		String s="Hello all good morning";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				StringBuffer sb= new StringBuffer(a[x]);
				System.out.println(sb.reverse());
			}
			else
			{
				System.out.println(a[x]);
			}
		}
		
		
//		String to Integer
		
//		String s1="1234";
//		int num=Integer.parseInt(s1);
//		System.out.println(num);
	}
}