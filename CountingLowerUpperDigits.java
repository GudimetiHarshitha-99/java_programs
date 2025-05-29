package module2_Strings;
public class CountingLowerUpperDigits {
	public static void main(String[] args) {
		String s="HellO @123";
		int upper=0,lower=0,digit=0,count=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isAlphabetic(c))
			{
				if(Character.isUpperCase(c))
				{
					
					upper++;
				}
				else if(Character.isLowerCase(c))
				{
					lower++;
				}
			}
			else if(Character.isDigit(c))
			{
				digit++;
			}
			else
			{
				count++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
		System.out.println(count);
	}
}