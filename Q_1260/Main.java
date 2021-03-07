package Q_1260;

//DFS(���� �켱 Ž�� : �� �칰��) BFS(�ʺ� �켱 Ž�� : ���� ������ �ִ� �������� ���� Ž��)
/*
 *BFS
 *ť�� ����
 *while(!que.isEmpty)
 *�� ����Ʈ���� �� �� �ִ� ����Ʈ�� �� �ְ� Ž���� ������
 *�� ���� ������(ť���� poll();��Ű��)���� �� �� �մ� ����Ʈ�� Ž��
 *
 *
 *DFS
 *��ͳ� �������� ����(��ͼ���)
 *�������� ����� ����Ʈ�� ����Լ��� �Ἥ ��� ������ Ž��
 * */

import java.util.*;

public class Main {
	public static int [][] arr;
	public static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// ������ ����
		int M = sc.nextInt();// ������ ����
		int V = sc.nextInt();// ������ ������ ��ȣ
		
		arr = new int [N+1][N+1];
		for(int i=1;i<=M;i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		
		visited = new boolean[N+1];
		dfs(V);
		
		System.out.println();
		
		visited = new boolean[N+1];
		bfs(V);
		
		
	}
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		if(start == arr.length) {
			return;
		}
		for(int a=1; a<arr.length;a++) {
			if(arr[start][a]==1 &&visited[a] == false) {
				dfs(a);
			}
		}
	}
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(start);
		visited[start]= true;
		System.out.print(start+" ");
		while(!que.isEmpty()) {
			int temp = que.peek();
			que.poll();
			for(int i =1; i<arr.length;i++) {
				if(arr[temp][i]==1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
	}
}
