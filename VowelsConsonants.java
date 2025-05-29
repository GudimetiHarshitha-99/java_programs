package module2_Strings;

public class VowelsConsonants {

	public static void main(String[] args) {
		String s=new String();
		s="Hello good morning";
		int count=0,count1=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("Vowels "+count);
		System.out.println("Consonants "+count1);

	}

}
