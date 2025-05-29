package module2_Strings;
import java.util.Arrays;
public class AnagramOrNot {

	public static void main(String[] args) {
		String s1="listen",s2="silent";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if(s1.length()==s2.length())
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not a Anagram");
			}
		}
	}
}