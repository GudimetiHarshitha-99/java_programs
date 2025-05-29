package module2_Strings;

public class MostOccuranceCharacter {

	public static void main(String[] args) {
		String s="hello good morning",s2="";
		int count=0,max=0;char hchar=' ';
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			count=0;
			for(int y=0;y<s.length();y++)
			{
				if(s.charAt(x)==s.charAt(y))
				count++;
			}
			if(count>max)
			{
				max=count;
				hchar=c;
			}
		
		}
		System.out.println(hchar+" "+max);
		
		
//		int num=76,temp=num,rem=0;
//		int square=(int)Math.pow(num,2);
//		while(square>0)
//		{
//			rem=square%100;
//			break;
//		}
//		if(rem==temp)
//			System.out.println(temp+" Automatic Number");
//		else
//			System.out.println(temp+" Not a Automatic Number");

	}

}
