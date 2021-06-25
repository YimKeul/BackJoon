package Q_14729;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long n = Long.parseLong(br.readLine());
		List<Double> list = new ArrayList<>();
		
		for(int i = 0; i < n ; i++) {
			double score = Double.parseDouble(br.readLine());
			list.add(score);
		}
		Collections.sort(list, new Comparator<Double>() {
			public int compare(Double d1, Double d2) {
				
				return d1.compareTo(d2);
			}
		});
		
		for(int i = 0; i < 7;i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb.toString());
	}
}
