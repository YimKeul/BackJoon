package Q_3079_입국심사;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static int [] gate;
	static long maxHigh = 0;
	static long min = Long.MAX_VALUE;
	
	public static void main(String arg[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input [] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); //줄
		int m = Integer.parseInt(input[1]); //사람 수
		
		gate = new int [n];
		
		
		
		for(int i =0; i<n;i++) {
			gate[i] = Integer.parseInt(br.readLine());
			
			maxHigh = Math.max(maxHigh, gate[i]);
			
			
		}
		
		getMinTime(n,m);
		System.out.println(min);
		
	}

	private static void getMinTime(int n, int m) {
		long left = 1;
		long right = maxHigh*m;
		int arr[] = new int[(int)right];
		for(int i = 0; i< n ; i++) {
			arr[gate[i]] = gate[i];
		}
		
		
		while(left <= right) {
			long mid = (left+right)/2;
			long sum = 0;
			
			for(int idx : gate) {
				
			
				long count = (mid/idx);
			
				
//				if(min/(idx*10)>0) {
//					System.out.println("arr[idx] 값 : "+arr[idx]);
//					System.out.println("쉰다~~~");
//					min+= idx;
//					continue;
//				}else {
//					if(sum >= m) {
//						break;
//					}
//					sum+=count;	
//				}
				
				
				if((mid/idx)/10 >=1	) {
					count -= (mid/idx)/10;
				}
				
				if(sum >= m) {
					break;
				}
				
				sum+=count;	
			}
			
			
			
			
			if(sum >=m) {
			
				min = Math.min(min, mid);
				right = mid-1;
				
			}else {
				left = mid +1;
				
			}
			
			
			
		}
		
	}
}
