package Q_11047;

import java.util.Scanner;

/*
 *�ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.
 *������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�. 
 *�̶� �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int [] pride = new int [n];
		for(int i = 0; i < n; i++) {
			pride[i] = sc.nextInt();
		}
		
		int cnt = n-1;
		int ans = 0;
		while( k != 0) {
			int pp = k / pride[cnt];
			k -= pp*pride[cnt--];
			ans += pp;
		}
		System.out.println(ans);
	}
}
