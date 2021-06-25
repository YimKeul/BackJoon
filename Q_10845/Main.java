package Q_10845;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */


class Queue{
	private int[] queue;
	private int frontIndex = 0;
	private int backIndex = -1;
	
	public Queue() {
		// TODO Auto-generated constructor stub
	}
	
	// Queue의 배열 생성?
	Queue(int number){
		queue = new int[number];
	}
	//값 넣기
	public void push(int x) {
		queue[++backIndex] = x;
		
	}
	//크기 호출
	public int size() {
		return backIndex - frontIndex +1;
	}
	//비어있는지
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//맨 앞 빼기(QUEUE성질)
	public int pop() {
		if(isEmpty()) {
			return -1;
		}else {
			return queue[frontIndex++];
		}
	}
	
	//맨 앞 index 호출
	public int front() {
		if(isEmpty()){
			return -1;
		}else {
			return queue[frontIndex];
		}
		
	}
	//맨 뒤 index 호출
	public int back() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return queue[backIndex];
		}
	}
	
}


public class Main {
	public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int number = Integer.parseInt(br.readLine());
		
		Queue queue = new Queue(number);
		
		for(int i = 0 ; i < number;i++) {
			
			String input[] = br.readLine().split(" ");
			
			String command = input[0];
			switch(command) {
			case "push":
				int x = Integer.parseInt(input[1]);
				queue.push(x);
				break;
				
			case "pop":
				System.out.println(queue.pop());
				break;
			
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
				
			case "front":
				System.out.println(queue.front());
				break;
				
			case "back":
				System.out.println(queue.back());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			}
			
		}
		
	}
}

