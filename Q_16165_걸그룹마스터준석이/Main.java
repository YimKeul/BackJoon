package Q_16165_걸그룹마스터준석이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		
		int m = Integer.parseInt(input[1]);
		
		Map<String, Map> map = new TreeMap<String,Map>();
		
		while(n-->0) {
			String group = br.readLine();
			int member = Integer.parseInt(br.readLine());
			Map<String, Integer> g = new TreeMap<String, Integer>();
			
			for(int i = 0; i< member; i++) {
				String name  = br.readLine();
				g.put(name, i);
			}
			map.put(group, g);
		}
	
		System.out.println();
//		for(String s : map.keySet()) {
//			System.out.println(s + " : " + map.get(s) + " : " + map.get(s).keySet());
//		}
	

		
		
		
//		Iterator iter = map.keySet().iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		
		
		for(Map.Entry<String, Map> tt : map.entrySet()) {
			
			System.out.println(tt.getKey() +" : "+tt.getValue().keySet());
			Iterator ii = tt.getValue().keySet().iterator();
			while(ii.hasNext()) {
				System.out.println(ii.next());
			}
		}
		
		System.out.println("---------------------");
		
		
		
		System.out.println(map.get("twice").containsValue("sana"));
		
		
		Iterator<Map.Entry<String, Map>> iterE = map.entrySet().iterator();
		while(iterE.hasNext()) {
			Map.Entry<String, Map> entry = iterE.next();
			String ky = entry.getKey();
			Map v = entry.getValue();
			
			System.out.println(ky + " : " + v);
		}
		
		while(m-->0) {
		
			String quiz = br.readLine();
			int type = Integer.parseInt(br.readLine());
			if(type == 1) {
				
				
				for(Map.Entry<String, Map> tt : map.entrySet()) {
					
					//System.out.println(tt.getKey() +" : "+tt.getValue().keySet());
					
					//map의 key의 value인 <map>의 key 출력
					Iterator ii = tt.getValue().keySet().iterator();
					while(ii.hasNext()) {
						//System.out.println(ii.next());
					}
				}
			
			}else {
				
				
			}
		}
		
	}
}
