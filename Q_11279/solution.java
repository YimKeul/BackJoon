package Q_11279;

import java.util.*;

import java.io.*;

public class solution {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			if (X == 0) {
				if (queue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(queue.poll());
				}
			}else {
				queue.add(X);
			}
		}
	}
}
