package module2_Strings;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String s="Hello all good morning",s2="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(s.indexOf(c)!=s.lastIndexOf(c))
			{
				if(s2.indexOf(c)==-1)
				{
					s2=s2+c;
				}
			}
		}
		System.out.println(s2);
//		System.out.println(s.subSequence(1, 8));
		System.out.println(s.indexOf(30));
	}

}
