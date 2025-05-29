package module2_Strings;

public class EvenOddString1 {

	public static void main(String[] args) {
		String s="Hello all good morning",s1="",s2="";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			s1=arr[x];
			if(x%2==0)
			{
				for(int y=0;y<s1.length();y++)
				{
					char c=s1.charAt(y);
					if(y%2==0)
					{
						s2=s2+Character.toUpperCase(s1.charAt(y));
					}
					else
					{
						s2=s2+s1.charAt(y);
					}
				}
			}
			else
			{
				StringBuffer sb=new StringBuffer(s1);
				sb=sb.reverse();
				s2=s2+sb.toString();
			}
			s2=s2+" ";
			
		}
		System.out.println(s2);
	}
}




// HeLlO lla GoOd gninrom