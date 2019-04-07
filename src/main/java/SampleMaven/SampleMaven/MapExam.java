package SampleMaven.SampleMaven;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapExam {
	
	
	
	public static void main(String arr[]) {
		Map<Integer, String> mm=new ConcurrentHashMap<Integer, String>();
		mm.put(0, "prateek");
		mm.put(1, "ssf");
		mm.put(2, "prxczdateek");
		
		mm.put(3, "lkhfh");
		
	Set<Integer>keys=mm.keySet();
	for(int i=0;i<keys.size();i++) {
		//System.out.println(mm.get(i));
	}
	
	   Set<Entry<Integer, String>>entries=mm.entrySet();
	   
	   for(Entry<Integer, String> en:entries) {
		   System.out.println(en.getKey()+"  "+en.getValue());
	   }
		
	}

}
