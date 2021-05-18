package Q_1753_최단경로;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


/*
  다익스트라
  방향그래프
  
  다익스트라란?
  한 노드에서 모든 노드로 가는 최단거리를 구할 수 있다.
  이때 최단거리를 저장하는 배열 + 우선순위 큐를 이용하여 구현할 수 있다.
  
 */
class Node implements Comparable<Node> {
	int end, weight;

	public Node(int end, int weight) {
		this.end = end;
		this.weight = weight;
	}

	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return weight - o.weight;
	}

}

public class Main {

	private static final int INF = 100_000_000;
	static int v, e, k;
	static List<Node>[] list;
	static int[] dist;

	public static void main(String args[]) throws Exception {
		System.out.println();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[] = br.readLine().split(" ");
		v = Integer.parseInt(input[0]);
		e = Integer.parseInt(input[1]);

		k = Integer.parseInt(br.readLine());
		list = new ArrayList[v + 1];
		dist = new int[v + 1];
		Arrays.fill(dist, INF);

		for (int i = 1; i <= v; i++) {
			list[i] = new ArrayList<Node>();
		}
		// 리스트에 그래프 정보를 초기화
		for (int i = 0; i < e; i++) {
			input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			int weight = Integer.parseInt(input[2]);
			// start에서 end로 가는 weight 가중치
			list[start].add(new Node(end, weight));
		}

		StringBuilder sb = new StringBuilder();
		// 다익스트라 알고리즘
		dijkstra(k);
		// 출력부분
		for (int i = 1; i <= v; i++) {
			if (dist[i] == INF) {
				sb.append("INF\n");
			} else {
				sb.append(dist[i] + "\n");
			}
		}

		System.out.println(sb.toString());
	}

	private static void dijkstra(int start) {
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		boolean[] check = new boolean[v + 1];
		queue.add(new Node(start, 0));
		dist[start] = 0;

		while (!queue.isEmpty()) {
			Node curNode = queue.poll();
			int cur = curNode.end;

			if (check[cur] == true) {
				continue;
			}
			for (Node node : list[cur]) {
				if (dist[node.end] > dist[cur] + node.weight) {
					dist[node.end] = dist[cur] + node.weight;

				}
				queue.add(new Node(node.end, dist[node.end]));
			}
		}
	}
}
