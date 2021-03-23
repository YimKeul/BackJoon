package Q_2346;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input [] = br.readLine().split(" ");
		
		LinkedList<Dot> li = new LinkedList<Dot>();
		for(int i=0;i<n;i++) {
			int v = Integer.parseInt(input[i]);
			li.add(new Dot(i+1,v));
		}
		int now = 0; int val = 0;
		for(int i=0;i<n;i++) {
			if(val > 0) {
				for(int j=0;j<val-1;j++) { //오른쪽으로 이동 val-1 만큼.
					++now;
					if(now >= li.size()) { // 사이즈보다 커지면 맨 왼쪽으로 이동.
						now = 0;
					}
				}
			}else if(val < 0) {
				val *=-1; //-1곱해서 양수로 바꿔주기.
				for(int j=0;j<val;j++) { //왼쪽으로 이동 val만큼.
					--now;
					if(now < 0) { // 0보다 작아지면 list의 오른쪽 끝으로 이동.
						now = li.size()-1;
					}
				}
			}
			Dot d = li.get(now);
			val = d.value;
			System.out.print(d.num+" ");
			li.remove(now);
			if(now == li.size()) { //now 위치와 size가 같으면 now를 0으로..
				now = 0;
			}

	}

}
	public static class Dot{
		int num;
		int value;
		Dot(int n,int v){
			this.num = n;
			this.value = v;
		}
	}
}
	