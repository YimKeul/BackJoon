package Q_7562_나이트의이동;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
    //나이트가 이동할 수 있는 경우의 수를 설정해준다.
    static int[] dx = {-2,-1,2,1,2,1,-2,-1};
    static int[] dy = {1,2,1,2,-1,-2,-1,-2};
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int start_x, start_y, end_x, end_y;
    static int count = 0;
    static Queue<dot> q = new LinkedList<dot>();
 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int t = Integer.parseInt(br.readLine());
        //테케 3
        
        for(int i=0; i<t; i++) {
            n = Integer.parseInt(br.readLine()); // 8
            map = new int[n][n];
            visited = new boolean[n][n];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            //현재 위치
            start_x = Integer.parseInt(st.nextToken());
            start_y = Integer.parseInt(st.nextToken());
            
 
            st = new StringTokenizer(br.readLine());
            //이동하려는 칸
            end_x = Integer.parseInt(st.nextToken());
            end_y = Integer.parseInt(st.nextToken());
            
            bfs(new dot(start_x, start_y));
            System.out.println(map[end_x][end_y]);
        }
        
    }
    
    static void bfs(dot d) {
        //미리 설정해둔 도착지가 되면 return해준다.
        if(d.x == end_x && d.y == end_y) {
            return;
        }
        visited[d.x][d.y] = true;
        
        q.add(d);
        
        while(!q.isEmpty()) {
            dot t = q.remove();
            int x1 = t.x;
            int y1 = t.y;
            
            for(int i=0; i<dx.length; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                
                if(x2>=0 && x2<n && y2>=0 && y2<n && !visited[x2][y2]) {
                    q.add(new dot(x2,y2));
                    visited[x2][y2] = true;
                    //전의 이동 횟수에 +1 씩 더해주며 이동 횟수를 증가시켜준다.
                    map[x2][y2] = map[x1][y1] + 1;
                }
            }
        }
        
    }
 
}
 
class dot {
    int x;
    int y;
    
    public dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}