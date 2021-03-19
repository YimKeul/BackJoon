package Q_1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 *  L : Ŀ���� �������� ��ĭ( �� ���̸� ����)
 *  D : Ŀ���� ���������� ��ĭ( �� ���̸� ����)
 *  B : Ŀ�� ���ʿ� �ִ� ���� ���� (�� ���̸� ����_
 *  P $ : $��� ���ڸ� Ŀ�� ���ʿ� �߰�
 */
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> list = new LinkedList<>();

		String input = br.readLine();
		for(int i = 0; i < input.length();i++) {
			list.add(input.charAt(i));
		}
		ListIterator<Character> iter = list.listIterator();
		
		
		while(iter.hasNext()) {
			iter.next();
		}
		
		
		int n = Integer.parseInt(br.readLine());
//		String[] control = new String [2];
		
		
		for (int i = 0; i < n; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			switch(c) {
			case 'L':
				if(iter.hasPrevious())
					iter.previous();
	
				break;
			case 'D':
				if(iter.hasNext())
					iter.next();
	
				break;
			case 'B':
				//remove()�� next()�� previous()�� ���� ��ȯ�� ���� ������ ��Ҹ� ����Ʈ���� ������
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			case 'P':
				char t = command.charAt(2);
				iter.add(t);
	
				break;
			default:
				break;
			}
	
			
			
//			control = br.readLine().split(" ");
//			if(control[0].equals("L")) {
//				if(iter.hasPrevious()) {
//					iter.previous();
//				}
//			}
//			if(control[0].equals("D")) {
//				if(iter.hasNext()) {
//					iter.next();
//				}
//			}
//			if(control[0].equals("B")) {
//				if(iter.hasPrevious()) {
//					iter.previous();
//					iter.remove();
//				}
//			}
//			if(control[0].equals("P")){
//				iter.add(control[1].charAt(0));
//			}
		}
		

		for(Character chr : list) {
			bw.write(chr);
			
		}
		bw.flush();
		bw.close();
		br.close();
		

	}
}
