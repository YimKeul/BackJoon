package Q_1920_수찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input [] = br.readLine().split(" ");
		int arr [] = new int [n];
		
		for(int i = 0; i < n ;i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
		

		
		int m= Integer.parseInt(br.readLine());
		input = br.readLine().split(" ");

		for(int i = 0; i < m; i++) {
			int k = Integer.parseInt(input[i]);
			System.out.println(binarysearch(arr, k));
		
		}
		
		
		
		
		
	}

	private static int binarysearch(int[] arr, int k) {
		
		int start = 0;
		int last = arr.length-1;
		
		while(start<= last) {
			int mid = (start+last)/2;
			if(k == arr[mid]) {
				return 1;
			}else {
				if(k>arr[mid]) {
					start = mid+1;
				}else {
					last = mid-1;
				}
			}
		}
		
		
		
		return 0;
	}

	
}
