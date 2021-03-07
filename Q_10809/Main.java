package Q_10809;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for(char c = 'a'; c<='z';c++) {
			System.out.print(S.indexOf(c)+" ");
		}
		
	}
}
