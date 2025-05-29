package module2_Strings;

import java.util.*;

public class Array_Deque {

	public static void main(String[] args) {
//		ArrayDeque <Object> a1=new ArrayDeque<>();
		int a[]=new int[] {10,20,30,50,78};
		Queue<Object>a1=new ArrayDeque<>();
//		a1.add("Harshi");
//		a1.add(20);
//		a1.add(50.8);
//		System.out.println(a1);
//		for(int x=0;x<a.length;x++)
//		{
//			a1.add(a[x]);
//		}
//		System.out.println(a1);
		
		
		
		for(int temp:a)
		{
			a1.add(temp);
		}
		System.out.println(a1);

	}

}
