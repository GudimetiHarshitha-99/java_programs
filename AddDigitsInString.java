package module2_Strings;

public class AddDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="231Hello all5 ever4yone";
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			int num=Character.getNumericValue(c);
			if(Character.isDigit(c))
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}
