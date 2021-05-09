package Q_5430_AC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		//R : reverse
		//D : removeFirst
		//if error : "error"
		
		while(t-->0) {
			String function = br.readLine();
			int size = Integer.parseInt(br.readLine());
		
			
			String arr = br.readLine();
			String revise []= arr.substring(1,arr.length()-1).split(",");
			Deque<Integer> q = new LinkedList<Integer>(); 
			StringBuilder sb = new StringBuilder();

			//반례 찾는중
			if(size == 0 && function.contains("D")) {
				System.out.println("error");
				
			}else if(size == 0) {
				System.out.println("[]");
			
			}else {
				for(int i = 0 ; i<revise.length;i++) {
					q.add(Integer.parseInt(revise[i]));
				}
				
				
				for(int i = 0 ; i< function.length();i++) {
					char text = function.charAt(i);
					if (!q.isEmpty() &&text == 'R') {
						reverse(q);
					}else if(!q.isEmpty()&&text == 'D') {
						q.removeFirst();
					}
				}
				
				
				//result control 
				if(q.isEmpty()) {
					System.out.println("error");
				}else {
					Iterator iter = q.iterator();
					sb.append("[");
					while(iter.hasNext()) {
						sb.append(iter.next() + ",");
					}
					sb.deleteCharAt(sb.lastIndexOf(","));
					sb.append("]");
					System.out.println(sb.toString());
				
				}
				
			}
			
		
		}
	}

	private static void reverse(Deque<Integer> q) {
		// TODO Auto-generated method stub
		Deque<Integer> r_q = new LinkedList<Integer>();
	
		
		while(!q.isEmpty()) {
			r_q.add(q.pollLast());
		}

		
		while(!r_q.isEmpty()) {
			q.add(r_q.pollFirst());
		}
		
		
	}
}
