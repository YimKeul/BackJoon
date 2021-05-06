package Q_1717_집합의표현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String start[] = br.readLine().split(" ");
		
		
		int n = Integer.parseInt(start[0]);
		int m = Integer.parseInt(start[1]);
		
		
		int arr [] = new int [n+1];
		for(int i = 0 ; i <= n;i++) {
			arr[i] = i;
		}
		
		Set<Integer> set_a = new HashSet<Integer>();
		Set<Integer> set_b = new HashSet<Integer>();
		
		
		while(m-- > 0) {
			String input [] = br.readLine().split(" ");
			int check = Integer.parseInt(input[0]);
			int a = Integer.parseInt(input[1]);
			int b = Integer.parseInt(input[2]);
			
			if(check == 0) {
				if(a == arr[a] && b == arr[b]){
					set_a.add(a);
					set_b.add(b);
				}
			
			
			}
			
			
			else {
				Set<Integer> union = new HashSet<Integer>();
				union.addAll(set_a);
				union.addAll(set_b);
//				System.out.println(set_a);
//				System.out.println(set_b);
//				System.out.println(union);
//				System.out.println(a + " " + b);
				//&& union.containsAll(set_a) && union.containsAll(set_b)
				if(set_a.contains(a) && set_b.contains(b) ) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
				union.clear();
				set_a.clear();
				set_b.clear();
			}
		}
		
		
	}
}
