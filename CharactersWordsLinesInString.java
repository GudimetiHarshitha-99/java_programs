package module2_Strings;

public class CharactersWordsLinesInString {

	public static void main(String[] args) {
		String s="Hello all \ngood morning @ \neveryone";
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			count++;
		}
		System.out.println("No.Of Characters "+count);
		String arr[]=s.split(" ");
		int count1=0;
		for(int x=0;x<arr.length;x++)
		{
			char c=s.charAt(x);
			count1++;
		}
		System.out.println("No.of Words "+count1);
		int count2=0;
		String arr1[]=s.split("\n");
		for(int y=0;y<arr1.length;y++)
		{
			count2++;
		}
		System.out.println("No.Of Lines "+count2);
	}
}