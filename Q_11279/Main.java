package Q_11279;

import java.util.*;
class Myhip{
	List<Integer> list;
	int size;
	
	public Myhip() {
		list = new ArrayList<>();
		size=0;
		
	}
	public void operation(int x) {
		if( x!=0) {
			add(x);
		}else if(size == 0 && x==0) {
			System.out.println("0");
		}else {
			System.out.println(list.remove(size-1));
			size--;
			
		}
	}
	
	public void add(int x) {
		int left = 0;
		int right = list.size()-1;
		
		while(left<=right) {
			int mid = (left + right)>>1;
		
		if(list.get(mid)>=x) {
			right= mid-1;
			
		}else
			left = mid+1;
		
		}
		list.add(left,x);
		size++;
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Myhip myhip = new Myhip();
		for(int i =0; i<N;i++) {
			int value = sc.nextInt();
			myhip.operation(value);
		}
	}

}
