package Q_2805_나무자르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		long n = Long.parseLong(input[0]);
		long m = Long.parseLong(input[1]);
	
		long arr[] = new long[(int)n];
		
		input = br.readLine().split(" ");
		for(int i  = 0 ; i < n ; i++){
			arr[i] = Long.parseLong(input[i]);
			
		}
		
		Arrays.sort(arr);
		
		System.out.println(binarysearch(arr , m));
		
	
	}

	private static long binarysearch(long[] arr, long m) {
		
		long left = 1;
		long right = arr[arr.length-1];
		while(left<=right) {
			long mid = (left + right)/2;
			long sum = 0;
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] >= mid) {
					sum += (arr[i] -mid);
				}
			}
			
			
			if(sum >= m	) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		
		
		return right;
	}
}
