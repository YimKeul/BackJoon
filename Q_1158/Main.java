package Q_1158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input [] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		LinkedList<Integer> list = new LinkedList<>();
		
		
		//�� ����
		for(int i = 1; i <= n;i++) {
		
			list.add(i);
		}
		sb.append("<");
		
		while(!list.isEmpty()) {
//			System.out.println("Ȯ�ο� while: "+list.get(0) );
//			System.out.println("//////////////////////////");
			for(int i = 0; i < k;i++) {
//				System.out.println("Ȯ�ο� : "+list.get(0) + " i�� " +i);
				if(i == k-1) {
					int a = list.remove();
					if(list.size() == 0) {
						sb.append(a);
					}else {
						sb.append(a + ", ");
					}
				}else {
					list.add(list.remove());
				}
				
			}
		}
		sb.append(">");
		br.close();
		
		System.out.println(sb.toString());
	}
}
