package Q_2957_이진탐색트리;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        
        long count = 0;
        int depth[] = new int[n+2];
        depth[0] = -1;
        depth[n+1] = -1;
        set.add(0);
        set.add(n+1);
        
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
//            System.out.println("lower : "+set.lower(number));
//            System.out.println("higher : "+set.higher(number));
            
            depth[number] = Math.max(depth[set.lower(number)], depth[set.higher(number)]) + 1;
            set.add(number);
            count += depth[number];
            sb.append(count + "\n");
        }
        System.out.println(sb.toString());
    }
}
/*
8

3
5
1
6
8
7
2
4
 
 
0
1
2
4
7
11
13
15
 
  */

/*
2 1 2 1 2
1 1 2 2 3 

2 2 2 1 1
*/