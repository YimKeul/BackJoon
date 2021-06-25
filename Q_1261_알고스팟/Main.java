package Q_1261_알고스팟;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//틀린코드
//수정해야함

/*
 * 미로 크기 n*m
 * 
 * 운영진 현 위치 x,y -> 이동가능 상하좌우
 * 
 * 현재 1,1에 있는 운영진이 n m 이로 이동할려면 최소 이동 갯수
 * 
 * n m
 * n = width 
 * m = height
 * 
 * 
 * 
 * */

class room{
	int x;
	int y; 
	int wall;
	
	
	public room(int x, int y, int wall) {
		this.x = x;
		this.y = y;
		this.wall = wall;
	}
}
public class Main {
	
	static int width;
	static int height;
	static int dx []= {1,-1,0,0};
	static int dy []= {0,0,1,-1};
	
	static int road [][] ;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		width = Integer.parseInt(input[0]);
		height = Integer.parseInt(input[1]);
		
		StringTokenizer st ;
		 road = new int [height+1][width+1];
		for(int i = 1 ; i <= height ;i++) {
			String in = br.readLine();
			for(int j = 1; j <= width ;j++) {
				road[i][j] = Character.getNumericValue(in.charAt(j -1));
	
				
				
			}
		}
		
		
		bfs();
		
		
		
		
	}
	private static void bfs() {
		Queue<room> q = new LinkedList<>();
		
		int wall = 0;
		
		for(int i = 1; i <= height;i++) {
			for(int j = 1; j <= width;j++) {
				if(road[i][j] == 0) {
					q.add(new room(i,j,wall));
				}
			}
		}
		
		
		while(!q.isEmpty()) {
			room r = q.poll();
			wall = r.wall;
			
			for(int i = 0; i < 4 ; i++) {
				int nx = r.x + dx[i];
				int ny = r.y + dy[i];
				if(nx>=1 && nx <= height && ny>=1 && ny <= width) {
					if(road[nx][ny] == 1) {
						road[nx][ny] = 0;
						q.add(new room(nx, ny, wall+1));
					}
				}
			}
		}
		
		
		if(check()) {
			System.out.println(wall);
		}else {
			System.out.println(0);
		}
		
		
		
	}
	private static boolean check() {
		for(int i = 1 ; i <= height;i++) {
			for(int j = 1; j <= width;j++) {
				if(road[i][j] ==1) {
					return false;
				}
			}
		}
		return true;
	}
}
