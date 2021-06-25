package Q_2841;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		int melody = Integer.parseInt(input[0]);
		//int total_plet = Integer.parseInt(input[1]); 
		
		//현 코드에는 의미는 없지만 의미부여하면 plet은 total_plet을 넘을 수 없다. (이건 구현 안함) 
		//구현한다면 line25~for문에서 if(plet < total_plet){}을 걸면 된다.
		
		int result = 0;
		//중요한 코드 스택구조를 가진 배열 생성 및 초기화(안하면 에러뜸)
		Stack <Integer> stack[] = new Stack[melody];
		
		for(int i = 0 ; i < melody;i++) {
			stack[i] = new Stack<Integer>();
			stack[i].push(0);
		}
		
		for(int i = 0 ; i < melody;i++) {
			String play [] = br.readLine().split(" ");
			int line = Integer.parseInt(play[0]);
			int plet = Integer.parseInt(play[1]);
			
			//손가락 때기
			while(stack[line].peek() > plet) {
				stack[line].pop();
				result++;
			}
			
			//손가락 누르기
			if(stack[line].size() == 0 || stack[line].peek()<plet) {
				stack[line].push(plet);
				result++;
			}
		
			
		}
		System.out.println(result);
	}
}
