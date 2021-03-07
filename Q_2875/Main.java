package Q_2875;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N : 여자 M : 남자 K : 인턴쉽 참여하는 인원
		// N+M ==> total 중 K명 인턴쉽 반드시 참여
		// 팀 구성 : 여자 2 남자 1
		// 최대 구성할수 있는 팀의 수 출력
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
				//System.out.println("끝 : " + team);
				//System.out.println("종료");
				break;
			}

		}
		System.out.println(team); // 결과값 출력

	}
}
