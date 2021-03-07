package Q_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] A = new int [n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int m = sc.nextInt();
	
		for(int j = 0; j< m;j++) {
			int k = sc.nextInt();
			System.out.println(binarySeatch(A, k));
		}
			
	}
	
	private static int binarySeatch(int [] A, int n) {
	
		int first = 0;
		int last = A.length-1;
		int mid= 0;
		
		while(first <= last) {
			mid = (first+last)/2;
			
			if(n == A[mid]) {
				return 1;
			}else {
				if(n < A[mid]) {
					last = mid -1;
				}else {
					first = mid+1;
				}
			}
		}
		
		
		return 0;
		
	}
}
