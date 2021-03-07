package Q_20205;

//중앙대학교 알고리즘 대회
import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 기존 배열의 크기( n*n)
		int K = sc.nextInt(); // 증가시킬 배열의 크기

		int arr[][] = new int[N][N]; // 이중배열

		//arr배열에 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		//문제의 업샘플링 & up배열 생성
		int uparr[][] = new int[N * K][N * K];
		
		//계산용 변수들
		int cnt_x = 0;
		int cnt_y = 0;
		int cntx = 1;
		int cnty = 1;

		//출력을 위한 이중반복문
		for (int i = 0; i < uparr.length; i++) {
			for (int j = 0; j < uparr[i].length; j++) {
				
				//업샘플링한 배열에 입력한 배열값 넣기
				uparr[i][j] = arr[cnt_x][cnt_y];
				
				//조건 1: 배열의 구조를 (i,j)라 할때 j값 컨트롤
				//값이 변경될 구간 설정
				if (j == (K * cnty) - 1) {
					cnty++;
					cnt_y++;
				}
				
				System.out.print(uparr[i][j] + " ");
				
				//배열의  줄바굼
				//cnty, cnt_y값 초기화 : j반복문을 통해서 다시 처음부터 조건에 만족하는 값을 출력하기 위해
				if (j == uparr[i].length - 1) {
					System.out.println("");
					cnty = 1;
					cnt_y = 0;
				}

			}
			//조건 2: 배열의 구조를 (i,j)라 할때 i값 컨트롤
			//값이 변경될 구간 설정
			if (i == (K * cntx) - 1) {
				cntx++;
				cnt_x++;

			}

		}

	}

}
