package Q_2875;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N : ���� M : ���� K : ���Ͻ� �����ϴ� �ο�
		// N+M ==> total �� K�� ���Ͻ� �ݵ�� ����
		// �� ���� : ���� 2 ���� 1
		// �ִ� �����Ҽ� �ִ� ���� �� ���
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int team = 0;
		
		while (true) {
			int total = N + M - K;
			if (total / 3 > 0) {
				if (N >= 2 && M >= 1) {
					N -= 2;
					M -= 1;
					team++;
					
					//System.out.println(N + " " + M + " " + team);
				}
			} else {
				//System.out.println("�� : " + team);
				//System.out.println("����");
				break;
			}

		}
		System.out.println(team); // ����� ���

	}
}
