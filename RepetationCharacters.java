package module2_Strings;

public class RepetationCharacters {

	public static void main(String[] args) {
		String s="a12b15c17";
		int n=0;
		for(int x=0;x<s.length();x++)
		{
				char c=s.charAt(x); 
				n=0; 
				if(Character.isAlphabetic(c))
				{
					for(int y=x+1;y<s.length();y++)
					{
						//char c1=s.charAt(y);  
						char c1=s.charAt(y);
						if(Character.isDigit(c1))
						{
							int num=Character.getNumericValue(c1);
							n=n*10+num;
						}
						else
						{
							break;
						}
					}
					
				}
				for(int z=1;z<=n;z++)
				{
					System.out.print(c+" ");
				}
		}
	
	
		
		
		
		
		
//		String s="a2b5c7";
////		char ch=' ';
//		char ch;
//		int num=0;
//		for(int x=0;x<s.length();x++)
//		{
//			char c=s.charAt(x);
//			if(Character.isDigit(c))
//			{
//				num=Character.getNumericValue(c);
//				for(int y=1;y<=num;y++)
//				{
//					ch=s.charAt(x-1);
//					System.out.print(ch+" ");
//				}
//			}
//		}
	}
}