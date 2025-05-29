package module2_Strings;

import java.util.*;
import java.util.Set;
public class DuplicateElements_Collections {

	public static void main(String[] args) {
		Integer[] a= {23,66,98,43,17,49,66,43,49,21,21,40,3,10};
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(a));
		Set<Integer> s1=new HashSet<>();
		for(int x=0;x<a1.size();x++)
		{
			if(a1.indexOf(a1.get(x))!=a1.lastIndexOf(a1.get(x)))
			{
				s1.add(a1.get(x));
			}
		}
		System.out.println(s1);
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+"\t");
		}
	}

}
