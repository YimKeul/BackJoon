package Q_20205;

//�߾Ӵ��б� �˰��� ��ȸ
import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // ���� �迭�� ũ��( n*n)
		int K = sc.nextInt(); // ������ų �迭�� ũ��

		int arr[][] = new int[N][N]; // ���߹迭

		//arr�迭�� �Է�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		//������ �����ø� & up�迭 ����
		int uparr[][] = new int[N * K][N * K];
		
		//���� ������
		int cnt_x = 0;
		int cnt_y = 0;
		int cntx = 1;
		int cnty = 1;

		//����� ���� ���߹ݺ���
		for (int i = 0; i < uparr.length; i++) {
			for (int j = 0; j < uparr[i].length; j++) {
				
				//�����ø��� �迭�� �Է��� �迭�� �ֱ�
				uparr[i][j] = arr[cnt_x][cnt_y];
				
				//���� 1: �迭�� ������ (i,j)�� �Ҷ� j�� ��Ʈ��
				//���� ����� ���� ����
				if (j == (K * cnty) - 1) {
					cnty++;
					cnt_y++;
				}
				
				System.out.print(uparr[i][j] + " ");
				
				//�迭��  �ٹٱ�
				//cnty, cnt_y�� �ʱ�ȭ : j�ݺ����� ���ؼ� �ٽ� ó������ ���ǿ� �����ϴ� ���� ����ϱ� ����
				if (j == uparr[i].length - 1) {
					System.out.println("");
					cnty = 1;
					cnt_y = 0;
				}

			}
			//���� 2: �迭�� ������ (i,j)�� �Ҷ� i�� ��Ʈ��
			//���� ����� ���� ����
			if (i == (K * cntx) - 1) {
				cntx++;
				cnt_x++;

			}

		}

	}

}
