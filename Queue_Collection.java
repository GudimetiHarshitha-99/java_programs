package module2_Strings;
import java.util.*;

public class Queue_Collection {

	public static void main(String[] args) {
//		int a[]=new int[] {15,67,44,89,45,33,21,90,77,52,43,86,41,8,3,11};
////		int a[]=new int[] {15,67,44,89,45,33,21,90,77,52,8,3};
//		Queue<Object> q=new PriorityQueue<>();
//		for(int x=0;x<a.length;x++)
//		{
//			q.add(a[x]);
//		}
//		
//		System.out.println(q);
//		q.poll();
//		System.out.println(q);
		
		
		ArrayDeque<Integer> ad=new ArrayDeque<>(Arrays.asList(34,78,99,13,61,12));
		Iterator i=ad.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}