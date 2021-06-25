package Q_19535_ㄷㄷㄷㅈ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 트리 종류 : D-트리 : 'ㄷ'이 'ㅈ'의 3배보다 많은 트리
 * 			G-트리 : 'ㄷ' 이 'ㅈ'의 3배보다 적은 트리
 * 			DUDUDUNGA-트리 : 'ㄷ'이 'ㅈ'의 정확히 3배만큼 있는 트리
 * */
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//4~300,000
		int n = Integer.parseInt(br.readLine());
	
		//입력을 이렇게 받네..?
		for(int i = 0; i< n-1;i++) {
			String input [] = br.readLine().split(" ");
			int u = Integer.parseInt(input[0]);
			int v = Integer.parseInt(input[1]);
			
		}
	}
}
