package Q_1260;

//DFS(김피 우선 탐색 : 한 우물만) BFS(너비 우선 탐색 : 같은 레벨에 있는 정점들은 같이 탐색)
/*
 *BFS
 *큐로 구현
 *while(!que.isEmpty)
 *한 포인트에서 갈 수 있는 포인트들 다 넣고 탐색이 끝나면
 *그 다음 포인터(큐에서 poll();시키고)에서 갈 수 잇는 포인트들 탐색
 *
 *
 *DFS
 *재귀나 스택으로 구현(재귀선택)
 *한점에서 연결된 포인트들 재귀함수를 써서 계속 끝까지 탐색
 * */

import java.util.*;

public class Main {
	public static int [][] arr;
	public static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// 정점의 개수
		int M = sc.nextInt();// 간선의 개수
		int V = sc.nextInt();// 시작할 정점의 번호
		
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
