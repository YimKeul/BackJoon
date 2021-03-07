package Q_2164;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Queue q = new LinkedList<>();
		
		
		int N = sc.nextInt();
		
		for(int i =1; i <=N;i++) {
			q.add(i);
		}
		if(N==1) {
			System.out.println(1);
		}else if(N == 2) {
			System.out.println(2);
		}else {
			while(!(q.size()==1)) {
				q.poll();
				q.add(q.poll());
			}
			System.out.println(q.poll());
		}
	}
}


//1 2 3 4 5 6 
//3 4 5 6 2
//5 6 2 4
//2 4 6
//6 4
//4
