package module2_Strings;

public class MaximumWordLengthInString {

	public static void main(String[] args) {
		String s="Hello good morning",s1="";
		int count=0,max=0;
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			s1=arr[x];
			count=0;
			for(int y=0;y<=s1.length()-1;y++)
			{
				char c=s1.charAt(y);
				count++;
			}
			if(count>max)
			{
				max=count;
			}
			
//			Another way using length method:
//			if(s1.length()>max)
//			{
//				max=s1.length();
//			}
			
		}
		System.out.println("Maximum Word is: "+s1+" "+max);
	}
}