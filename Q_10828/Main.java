package Q_10828;

import java.util.*;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack stack = new Stack();

		for (int i = 0; i < n; i++) {
			String str;
			str = br.readLine();
			String ar[] = str.split(" ");

			switch (ar[0]) {
			case "push":
				int x = Integer.parseInt(ar[1]);
				stack.push(x);
				break;
			case "pop":
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if (stack.empty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "top":
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
			}
		}
	}
}

//			//push
//			if(ar[0].equals("push")) {
//				int x = Integer.parseInt(ar[1]);
//				stack.push(x);	
//			}
//			
//			//pop
//			else if(ar[0].equals("pop")){
//				if(stack.empty()) {
//					System.out.println("-1");
//				}else {
//					System.out.println(stack.pop());
//				}
//			}
//			
//			//size
//			else if(ar[0].equals("size")) {
//				System.out.println(stack.size());
//			}
//			
//			//empty
//			else if(ar[0].equals("empty")) {
//				if(stack.empty()) {
//					System.out.println("1");
//				}else {// 비어있지 않다
//					System.out.println("0");
//				}
//			}
//			
//			//top
//			else if(ar[0].equals("top")) {
//				if(stack.empty()) {
//					System.out.println("-1");
//				}else {
//					System.out.println(stack.peek());
//				}
//			}
