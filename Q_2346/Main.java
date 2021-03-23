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
				for(int j=0;j<val-1;j++) { //���������� �̵� val-1 ��ŭ.
					++now;
					if(now >= li.size()) { // ������� Ŀ���� �� �������� �̵�.
						now = 0;
					}
				}
			}else if(val < 0) {
				val *=-1; //-1���ؼ� ����� �ٲ��ֱ�.
				for(int j=0;j<val;j++) { //�������� �̵� val��ŭ.
					--now;
					if(now < 0) { // 0���� �۾����� list�� ������ ������ �̵�.
						now = li.size()-1;
					}
				}
			}
			Dot d = li.get(now);
			val = d.value;
			System.out.print(d.num+" ");
			li.remove(now);
			if(now == li.size()) { //now ��ġ�� size�� ������ now�� 0����..
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
	