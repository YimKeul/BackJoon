package Q_18258;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		
		for(int i =0; i<n;i++) {
			String str []= br.readLine().split(" "); 
			String control = str[0];
			
			switch(control) {
			case "pop":
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(q.poll());
				}
				break;
			case "push":
				int x = Integer.parseInt(str[1]);
				
				q.offer(x);
				break;
				
			case "size":
				System.out.println(q.size());
				break;
				
			case "empty":
				if(q.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				break;
				
			case "front":
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(q.peek());
				}
				break;
				
			case "back":
				if(q.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(q.peekLast());
				}
				break;
			}
		}
	}
}
