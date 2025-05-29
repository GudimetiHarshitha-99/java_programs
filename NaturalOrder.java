package module2_Strings;

import java.util.ArrayList;
import java.util.*;

public class NaturalOrder {

	public static void main(String[] args) {
//		String[] s=new String[] {"One","Evening","Apple","ball","Parrot","ant","cap"};
		ArrayList<String> a1=new ArrayList<>(Arrays.asList("Ant","Pot","book","Lamp","pen","Dog"));
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(10,20,40,80,33,21,17,90));
//		for(int x=0;x<s.length;x++)
//		{
//			a1.add(s[x]);
//		}
		a1.sort(Comparator.naturalOrder());
		System.out.println(a1);
		a1.sort(Comparator.reverseOrder());
		System.out.println(a1);
		System.out.println("Right Rotation");
		Collections.rotate(a, 2);
		System.out.println(a);
		System.out.println("Left Rotate");
		Collections.rotate(a, -2);
		System.out.println(a);
//		Collections.max(a);
		System.out.println("Max Value "+Collections.max(a));
		System.out.println("Min Value "+Collections.min(a));
		System.out.println(Collections.binarySearch(a, 20));
		System.out.println(Collections.binarySearch(a, 9));
		
	}
}