package module2_Strings;

public class CapitaliseFirstLast {

	public static void main(String[] args) {
		String s="Hello all good morning",s2="";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			String s1=arr[x];
			for(int y=0;y<s1.length();y++)
			{
				if(y==0||y==s1.length()-1)
				{
					s2=s2+Character.toUpperCase(s1.charAt(y));
				}
				else
				{
					s2=s2+s1.charAt(y);
				}
			}
			s2=s2+" ";
		}
		System.out.println(s2);
		String arr1[]=s2.split(" ");
		for(String s4:arr1)
			System.out.println(s4);
	}

}
