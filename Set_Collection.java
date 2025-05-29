package module2_Strings;
import java.util.*;
import java.util.Set;
public class Set_Collection {

	public static void main(String[] args) {
//		int a[]=new int[] {15,67,44,89,45,33,21,90,77,52,43,86,41,8,3,11};
//		Set<Integer> b1=new HashSet<>();
//		for(int x=0;x<a.length;x++)
//		{
//			b1.add(a[x]);
//		}
//		System.out.println(b1);
//		System.out.println(b1.contains(56));
		
		
//		Set<Integer> b2=new LinkedHashSet<>();
//		for(int x=0;x<a.length;x++)
//		{
//			b2.add(a[x]);
//		}
//		System.out.println(b2);
//		for(Integer temp:b2)
//		{
//			System.out.print(temp+" ");
//		}
		
		
		
		Set <Integer>set=new HashSet<>(Arrays.asList());
		set.add(15);
		set.add(null);
		set.add(39);
		set.add(77);
		set.add(11);
//		set.get(2);
		System.out.println(set);
		Set<Integer> set1=new LinkedHashSet<>(Arrays.asList(20,89,45,88,null));
		System.out.println(set1);
		Set<Object>set2=new TreeSet<>();
		set2.add(45);
		set2.add(67);
//		set2.add(null);
		set2.add(88);
		set2.add(3);
		set2.add(74);
//		set2.add("Harshi");
//		set2.add(9.8);
		System.out.println(set2);
	}

}
