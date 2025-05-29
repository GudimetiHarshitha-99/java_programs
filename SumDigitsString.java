package module2_Strings;

public class SumDigitsString {

	public static void main(String[] args) {
		String s="hello12 all 11 & 177",s1="";
		int n=0,num=0,sum=0;
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			s1=arr[x];
			n=0;
			for(int y=0;y<s1.length();y++)
			{
				char c=s1.charAt(y);
				if(Character.isDigit(c))
				{
					num=Character.getNumericValue(c);
					n=n*10+num;
				}
			}
			sum=sum+n;
//			System.out.println(sum);
		}
		System.out.println(sum+" ");
	}
}