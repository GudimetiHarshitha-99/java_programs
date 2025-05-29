package module2_Strings;

public class EvenMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hElLo aLl",s2="";
		for(int x=0;x<s1.length();x++)
		{
			char c=s1.charAt(x);
			if(x%2==0)
			{
				c=Character.toLowerCase(c);
			}
			else
			{
				c=Character.toUpperCase(c);
			}
			s2=s2+c;
		}
		System.out.println(s2);

	}

}
