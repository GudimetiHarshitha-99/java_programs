package module2_Strings;

public class MaxVowelsInString {

	public static void main(String[] args) {
		String s="happy new year to all",s2="",s3="";
		String arr[]=s.split(" ");
		int max=0;
		for(int x=0;x<arr.length;x++)
		{
			s2=arr[x];
//			System.out.println(s2);
			int count=0;
			for(int y=0;y<s2.length();y++)
			{
				char c=s2.charAt(y);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					{
						count++;
					}
			}
			if(count>max)
			{
				max=count;
				s3=s2;
			}
			System.out.println(s2+" "+count);
		}
		System.out.println("Maximum vowels: "+ s3+" "+max);
	}

}


