package Q_1654_랜선자르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		int arr [] = new int [n];
		
		
		for(int i = 0 ; i < n ; i++) {
			int lan = Integer.parseInt(br.readLine());
			arr[i] = lan;
		
		}
		Arrays.sort(arr);
		
		long min = 1;
		long max = arr[n-1];
		
		while(max>=min) {
			long mid = (max+min)/2;
			
			long cnt = 0;
			
			for(int i = 0; i < n;i++) {
				cnt += arr[i]/mid;
			}
			if(cnt >=k) {
				min = mid+1;
			}else {
				max = mid-1;
			}
		}
		System.out.println(max);
		
	}
}
