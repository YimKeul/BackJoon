package Q_2512_예산;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr [] = new int [n];
		long max = 0;
		String input []= br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			max = Math.max(max, arr[i]);
			
		}
		
		long m = Long.parseLong(br.readLine());
		
		
		Arrays.sort(arr);
		
		long min =0;
		long answer = 0;
		
		
		while(max >= min) {
			//System.out.println("max : " + max + "// min : " + min+" // answer :" + answer);
			long mid = (max + min)/2;
			long sum = 0;
			
			for(int money : arr) {
				if(money >= mid) {
					sum += mid;
				}else {
					sum +=money;
				}
			}
			if(sum > m) {
				max = mid -1;
			}else {
				min = mid +1;
				answer = Math.max(answer, mid);
			}
			
		}
		
		System.out.println(answer);
		
		
		
		
	}
}
