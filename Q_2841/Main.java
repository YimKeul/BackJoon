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
		
		//�� �ڵ忡�� �ǹ̴� ������ �ǹ̺ο��ϸ� plet�� total_plet�� ���� �� ����. (�̰� ���� ����) 
		//�����Ѵٸ� line25~for������ if(plet < total_plet){}�� �ɸ� �ȴ�.
		
		int result = 0;
		//�߿��� �ڵ� ���ñ����� ���� �迭 ���� �� �ʱ�ȭ(���ϸ� ������)
		Stack <Integer> stack[] = new Stack[melody];
		
		for(int i = 0 ; i < melody;i++) {
			stack[i] = new Stack<Integer>();
			stack[i].push(0);
		}
		
		for(int i = 0 ; i < melody;i++) {
			String play [] = br.readLine().split(" ");
			int line = Integer.parseInt(play[0]);
			int plet = Integer.parseInt(play[1]);
			
			//�հ��� ����
			while(stack[line].peek() > plet) {
				stack[line].pop();
				result++;
			}
			
			//�հ��� ������
			if(stack[line].size() == 0 || stack[line].peek()<plet) {
				stack[line].push(plet);
				result++;
			}
		
			
		}
		System.out.println(result);
	}
}
