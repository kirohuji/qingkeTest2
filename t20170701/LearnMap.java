/**
 * 
 */
package t20170701;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Administrator
 *
 */
public class LearnMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String,Integer> map=new TreeMap<>((o1,o2)->{
			return o1.compareTo(o2);
		});
		map.put("a", 1);
		map.put("c", 2);
		map.put("b",3);
		System.out.println(map.get("zyd"));
		for(Map.Entry<String,Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
	
		}
		
		Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
