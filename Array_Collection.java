package module2_Strings;

import java.util.*;

public class Array_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vector<Object> a1=new Vector <>();
		LinkedList<Object> a1=new LinkedList<>();
		a1.add(10);
		a1.add(20);
		a1.add("Array List");
		for(int x=0;x<a1.size();x++)
		{
			System.out.println(a1.get(x));
		}
		for(Object temp: a1)
		{
			System.out.println(temp);
		}
	}
}
