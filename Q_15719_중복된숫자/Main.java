package Q_15719_중복된숫자;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 이 풀이는 메모리 초과이다.
 * */

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		String input[] = br.readLine().split(" ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			set.add(arr[i]);
			list.add(arr[i]);

		}
		Collections.sort(list);
		Iterator iter = set.iterator();
		ListIterator ii = list.listIterator();

		while(ii.hasNext()) {
			if( ii.next() != iter.next()	) {
				System.out.println(ii.previous());
				break;
			}
		}
	
	}
}
