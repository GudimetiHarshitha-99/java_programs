package module2_Strings;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
public class MapInterface {

	public static void main(String[] args) {
		Map <Integer,String> map=new LinkedHashMap<>();
		map.put(1,"Harsha");
		map.put(2,"Harshi");
		map.put(8, "sai");
		map.put(1,"Harshaaaaaa");
		map.put(9,"Harshi");
		map.put(7, "AAA");
		System.out.println("Linked Hash Map");
		System.out.println(map);
		System.out.println("Hash Map");
		Map<Integer,String> map1=new HashMap<>();
		map1.putAll(map);
		System.out.println(map1);
		System.out.println("Tree Map");
		Map<Integer,String> map2=new TreeMap<>();
		map2.putAll(map);
		System.out.println(map2);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
//		Set<Entry<Integer, String>> set=map.entrySet();
		Set set=map.entrySet();
		for(Object temp:set)
		{
			System.out.println(temp);
		}
		map.computeIfAbsent(10, k -> "BBB");
		System.out.println(map);
		map.computeIfPresent(7, (k,v) -> "Mapping");
		System.out.println(map);
		map.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
	}
}
