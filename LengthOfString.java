package module2_Strings;

public class LengthOfString {

	public static void main(String[] args) {
		String s="Hello good morning";
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			count++;
		}
		System.out.println("Length Of String is "+count);
	}
}