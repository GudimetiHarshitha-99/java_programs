package module2_Strings;

import java.util.*;
import java.util.Set;
public class Unique_Elements_Collections {

	public static void main(String[] args) {
		Integer[] a= {10,20,60,80,20,60,77,45,69,77,19,10};
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(a));
		System.out.println("Unique Elements");
		for(int x=0;x<a1.size();x++)
		{
			if(a1.indexOf(a1.get(x))==a1.lastIndexOf(a1.get(x)))
			{
				System.out.println(a1.get(x));
			}
		}
	}
}