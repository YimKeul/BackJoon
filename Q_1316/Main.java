package Q_1316;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i= 0;
		int n = sc.nextInt();
		int answer = n;
		
		for(int j = 0; j<n;j++) {
			String word = sc.next();
			boolean [] checker = new boolean[26];
			
			for(i=1; i<word.length();i++) {
				if(word.charAt(i-1)!=word.charAt(i)) {
					if(checker[word.charAt(i)-97]==true) {
						answer--;
						break;
					}
					checker[word.codePointAt(i-1)-97] = true;
				}
			}
		}
		System.out.println(answer);
	}
}
