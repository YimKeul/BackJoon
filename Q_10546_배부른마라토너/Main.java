package Q_10546_배부른마라토너;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		 for(int i = 0; i < n; i++) {
	            String key = br.readLine();
	            if(!map.containsKey(key)) {
	                map.put(key, 1);
	            }else {
	                map.put(key, map.get(key) + 1);
	            }
	        }

	        for(int i = 0; i < n-1; i++) {
	            String key = br.readLine();
	            map.put(key, map.get(key) - 1);
	        }

	        for(String key : map.keySet()) {
	            if(map.get(key) != 0) {
	                System.out.println(key);
	                break;
	            }
	        }
	}
}


//Map<Integer,String> map = new TreeMap<>();
//Map<Integer,String> map_1 = new TreeMap<>();
//
//for(int i = 0 ; i < n; i++) {
//	String input = br.readLine();
//	map.put(i,input);
//	
//}
//System.out.println();
//
//List<Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
//
//Collections.sort(list,new Comparator<Entry<Integer, String>>() {
//
//	@Override
//	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//		String x = o1.getValue();
//		String y = o2.getValue();
//		return x.compareTo(y);
//	}
//});
//
//for(int i = 0 ; i < n-1; i++) {
//	String input = br.readLine();
//	map_1.put(i, input);
//}
//
//
//List<Entry<Integer, String>> list_1 = new ArrayList<Map.Entry<Integer,String>>(map_1.entrySet());
//
//Collections.sort(list_1,new Comparator<Entry<Integer, String>>() {
//
//	@Override
//	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//		String x = o1.getValue();
//		String y = o2.getValue();
//		return x.compareTo(y);
//	}
//});
//
//
//System.out.println();
//
//for(Entry<Integer,String> en : list) {
//System.out.println(en.getKey() + " : " + en.getValue() );
//}
//System.out.println("---------------");
//for(Entry<Integer,String> en : list_1) {
//System.out.println(en.getKey() + " : " + en.getValue() );
//}
//System.out.println("---------------");
//
//
//
//for(Entry<Integer,String> en : list) {
//for(Entry<Integer,String> tt : list_1) {
//	
//}	
//}
//