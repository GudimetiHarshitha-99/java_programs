package module2_Strings;

public class UniqueCharactersInString {

	public static void main(String[] args) {
		String s="Hello all good morning";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				System.out.print(c);
			}
		}
	}
}