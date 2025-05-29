package module2_Strings;

public class FirstCapitalise {

	public static void main(String[] args) {
		String s="Vision information Rest Union Strength";
		String arr[]=s.split(" ");
		String s1="",s2="";
		for(int x=0;x<arr.length;x++)
		{
			s1=arr[x];
			for(int y=0;y<s1.length();y++) 
			{
				if(y==0)
				{
					s2=s2+Character.toUpperCase(s1.charAt(y));
				}
			}
		}
		System.out.println(s2);
	}
}