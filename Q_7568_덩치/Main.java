package Q_7568_덩치;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int size [][] = new int [n][2];
		
		for(int i = 0; i < n ; i++) {
			String input [] = br.readLine().split(" ");
			int weight = Integer.parseInt(input[0]);
			int height = Integer.parseInt(input[1]);
			size[i][0] = weight;
			size[i][1] = height;
		}
		
		for(int i = 0; i < n ; i++) {
			int rank = 1;
			for(int j = 0; j < n ; j++) {
				if(i == j) {
					continue;
				}if(size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					System.out.println("test i : " + i + " test j : " + j);
					System.out.println();
					rank++;
				}
			}
			//System.out.print(rank + " ");
		}
		
	}
}
