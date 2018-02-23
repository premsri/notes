package in.oops;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

class Map {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> ex =new LinkedHashMap<Integer, String>();
		//map is a key and value pair <entry set>
		ex.put(10, "test1");
		ex.put(11, "test2");
		ex.put(12, "test3");
		System.out.println(ex);
		System.out.println(ex.get(11));
		System.out.println(ex.keySet());
		System.out.println(ex.values());
		Set<Entry<Integer, String>> ey = ex.entrySet();
		for (Entry<Integer, String> i : ey) {
			System.out.println(i.getKey() + ""+i.getValue());
		}
	}
}