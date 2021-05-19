package Q_3190_뱀;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
//n*n사이즈

public class Main {

	private static int[] dx = { 0, 1, 0, -1 };
	private static int[] dy = { 1, 0, -1, 0 };
	private static int n, l, k;
	private static int[][] board;
	private static List<int[]> snake;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		snake = new LinkedList<int[]>();
		snake.add(new int[] { 0, 0 });

		// 사이즈
		n = Integer.parseInt(br.readLine());

		board = new int[n][n];

		// 사과의 개수
		k = Integer.parseInt(br.readLine());

		for (int i = 0; i < k; i++) {
			String input [] = br.readLine().split(" ");
			
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			board[x - 1][y - 1] = 1;
		}

		l = Integer.parseInt(br.readLine());

		int[][] dir = new int[l][2];

		for(int i = 0; i<l;i++) {
			String input[] = br.readLine().split(" ");
			
			dir[i][0] = Integer.parseInt(input[0]);
			char temp = input[1].charAt(0);
			
			dir[i][1]= (temp == 'L') ? -1 : 1; // L -> -1 , D -> 1
		}
		
		int time = solution(0,0,0,dir);
		System.out.println(time);

	}

	private static int solution(int curx, int cury, int currentDir, int[][] dir) {
		
		int time = 0;
		int turn = 0;
	
		while(true) {
			time++;
			int nextx = curx + dx[currentDir];
			int nexty = cury + dy[currentDir];
			
			if(isFinish(nextx, nexty)) break;
			
			if(board[nextx][nexty] == 2) {
				snake.add(new int[] {nextx, nexty});
			}else {
				snake.add(new int[] {nextx, nexty});
				snake.remove(0);
			}
			curx = nextx;
			cury = nexty;
			
			if(turn <l) {
				if(time == dir[turn][0]) {
					currentDir = nextDir(currentDir, dir[turn][1]);
					turn++;
				}
			}
		}
		
		return time;
	}

	private static int nextDir(int current, int dir) {
		// TODO Auto-generated method stub
		
		int next= (current + dir) % 4;
		if(next == -1) {
			next = 3;
			
		}
		return next;
	}

	private static boolean isFinish(int x, int y) {
		// TODO Auto-generated method stub
		if(x == -1 || x == n || y == -1 || y == n) {
			return true;
		}
		
		for( int i = 0 ; i < snake.size();i++) {
			int [] s = snake.get(i);
			if(s[0] == x && s[1] == y) {
				return true;
			}
		}
		return false;
	}
}
