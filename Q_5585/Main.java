package Q_5585;

import java.util.Scanner;

/*
 * Ÿ�δ� ���� JOI��ȭ������ ������ ���.
 * JOI��ȭ������ �ܵ����� 500��, 100��, 50��, 10��, 5��, 1���� ����� �ְ�,
 * ������ �Ž����� ������ ���� ���� �ܵ��� �ش�. 
 * Ÿ�ΰ� JOI��ȭ������ ������ ��� ī���Ϳ��� 1000�� ���� ���� ���� ��,
 * ���� �ܵ��� ���Ե� �ܵ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 1000 - sc.nextInt();
		int [] array = {500,100,50,10,5,1};
		int idx = 0;
		int ans = 0;
		
		while( money !=0) {
			int change = money / array[idx];
			
				System.out.println("t1 "+idx);
				money -= change * array[idx++];
				System.out.println("t2 " + idx + " mon : " +money);
			ans += change;
			
		}
		System.out.println(ans);
	}
}
