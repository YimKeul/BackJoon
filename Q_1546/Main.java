package Q_1546;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double[]score = new double[N];
		double total = 0;
		for(int i=0;i<N;i++) {
			score[i]= sc.nextDouble();
		}
		
		Arrays.sort(score);
		//ÃÖ´ñ°ª == score[N-1]
		for(int i =0; i< score.length;i++) {
			score[i]= (score[i]/score[N-1])*100;
			total += score[i];
		}
		double answer = total/N;
		System.out.println(answer);
		
	}
}
