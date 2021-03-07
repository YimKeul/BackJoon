package Q_20206;

import java.util.*;
//포기

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		int x[] = new int [2];
		for(int i = 0; i < 2; i++) {
			x[i] =sc.nextInt();
		}
		
		int y[] = new int [2];
		for(int i = 0; i < 2; i++) {
			y[i] =sc.nextInt();
		}
		
		double ans_x=0;
		double ans_y=0;
		
		//좌표 확인용
		for(int i =0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				System.out.println("("+x[i]+","+y[j]+")");
				
			}

		}
		
		

		System.out.println("");
		
		for(int i =0; i< x.length;i++) {
			ans_y = (double)-(A*x[i]/B +C/B);

			System.out.println("("+x[i]+","+ans_y+")");
		}
		
		for(int j =0; j< y.length;j++) {
			ans_x = -(B*y[j]/A+C/A);

			System.out.println("("+ans_x+","+y[j]+")");
		}
		
		
		for(int i =0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				//System.out.println("("+x[i]+","+y[j]+")");
				if(x[i]>=0 && y[j]>=0) { //1사분면
					
				}
				if(x[i]<0 && y[j]>=0) {//2사분면
					
				}
				if(x[i]<0 && y[j]<0) {//3사분면
					
				}
				if(x[i]>=0 && y[j]<0) {//4사분면
					
				}
				
				
				
			}

		}
		
		
	}
}
