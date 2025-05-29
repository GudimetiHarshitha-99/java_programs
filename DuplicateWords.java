package module2_Strings;

public class DuplicateWords {

	public static void main(String[] args) {
		String s="Hello all everyone all Hello",s2="",s3="";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			s2=arr[x];
//			for(int y=0;y<s2.length();y++)
//			{
//				if(s.indexOf(s2)!=s.lastIndexOf(s2))
//				{
					if(s3.indexOf(s2)==-1)
					{
						s3=s3+s2;
					}
//				}
//			}
		}
		System.out.println(s3);
	}
}