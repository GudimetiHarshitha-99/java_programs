package module2_Strings;

import java.util.Arrays;

public class SortingAnString {

	public static void main(String[] args) {
		String s="everyone all ABCDE";
//		char c1[]=s.toCharArray();
//		Arrays.sort(c1);
//		String s2=new String(c1);
//		String s3=String.valueOf(c1);
//		System.out.println("Ascending Sorting");
//		System.out.println(c1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println("Descending Sorting");
//		for(int x=c1.length-1;x>=0;x--)
//		{
//			System.out.print(c1[x]);
//		}
		

//		char c1[]=s.toCharArray();
//		for(int x=0;x<c1.length;x++)    //h
//		{
////			char c=s.charAt(x);
//			for(int y=x+1;y<c1.length;y++)    //hello   //e
//			{
////				 char c2=s.charAt(y);
//				if(c1[x]>c1[y])     //h>e
//				{
//					char temp=c1[y];
//					c1[y]=c1[x];
//					c1[x]=temp;
//				}
//			}
//		}
//		for(char t:c1)
//			System.out.println(t);
//	
		
		StringBuilder sb=new StringBuilder(s);
		for(int x=0;x<s.length();x++)
		{
//			char c=sb.charAt(x);
//			char c=s.charAt(x);
			for(int y=x+1;y<s.length();y++)
			{
//				char c1=sb.charAt(y);
//				char c1=s.charAt(y);
				if(sb.charAt(x)>sb.charAt(y))
//				if(c>c1)
				{
					char t=sb.charAt(x);              //t=c
					sb.setCharAt(x, sb.charAt(y));    //x=c1
					sb.setCharAt(y, t);        //y=t
//					char t=c;
//					sb.setCharAt(x,c1);
//					sb.setCharAt(y, t);
					
					 
				}
			}
		}
		System.out.println(sb);
		
//		String s1="";
//		for(char x='A';x<='z';x++)
//		{
//			for(int y=0;y<s.length();y++)
//			{
//				if(s.charAt(y)==x)
//				s1=s1+x;	
//			}
//		}
//		System.out.println(s1);
	}	
}


