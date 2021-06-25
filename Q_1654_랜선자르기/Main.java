package Q_1654_랜선자르기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int k = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);

		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		
		}
		Arrays.sort(arr);

		long max = arr[k-1];
		long min = 1;
		long middle = 0;
		
		while (max >= min) {
			middle = (max + min) / 2;
			
			long count = 0;
			
			for (int i = 0; i < k; i++) {
				count += (arr[i] / middle);
				//System.out.println(count);
			}
			if (count >= n) {
				min = middle + 1;
			} else  {
				max = middle - 1;
			}
			
		}
		System.out.println(max);
	}

}
