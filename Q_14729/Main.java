package Q_14729;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(br.readLine());
		ArrayList list = new ArrayList<>();
	
		/*
		 * 알고리즘을 생각해보자
		 * 7개까지만 비교연산을 해서 배열 또는 리스트에 저장하고
		 * 맨 마지막 들어간 수 보다 클 경우에는 넣지 않음
		 * 7개가 다 찬 상태에서 작은 수가 입력이 되면
		 * 배열에 넣고
		 * 제일큰수 제외
		 * 이거 반복
		 * 
		 */
		
		for(long i = 0 ; i < 7; i++) {
			list.add(Double.parseDouble(br.readLine()));
			
		}
		Collections.sort(list);
		
		Comparator<Double> com = new Comparator<Double>() {
			
			@Override
			public int compare(Double o1, Double o2) {
				if(o1 > o2) {
					return 1;
				}else if( o1< o2) {
					return -1;
				}else {
					return 0;
				}
			}
		};
		for(long i = 7; i < n;i++ ) {
			double input = Double.parseDouble(br.readLine());
			int result = com.compare((Double) list.get(6), input);
			if(result == 1) {
				list.remove(6);
				list.add(input);
				Collections.sort(list);
			}else if(result == 0) {
				list.add(input);
				Collections.sort(list);
				list.remove(list.size()-1);
			}
		}
		
		
		for(int i = 0 ; i < 7;i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
	}
}




//for(long i = 0; i < n; i++) {
//	list.add(Double.parseDouble(br.readLine()));
//}
//
//Collections.sort(list);
//
//double [] answer = new double[7];
//for(int i = 0; i< answer.length; i++) {
//	answer[i] = (double) list.get(i);
//}
//for(int i = 0; i < answer.length;i++) {
//	System.out.println(answer[i]);
//}
//


//8
//20.000
//70.000
//80.000
//30.000
//80.000
//30.000
//60.000
//70.000
