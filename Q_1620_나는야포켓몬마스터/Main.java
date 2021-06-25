package Q_1620_나는야포켓몬마스터;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
// 내 코드는 시간초과

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int answer_time = Integer.parseInt(input[1]); // 나중에 쓸것

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String name_arr[] = new String [n+1];
		for (int i = 0; i < n; i++) {
			String name = br.readLine();

			map.put(name, i + 1);
			name_arr[i+1] = name;
		}


		for (int i = 0; i < answer_time; i++) {
			String quiz = br.readLine();

			if (map.containsKey(quiz)) {
				sb.append(map.get(quiz)).append("\n");
			} else {
					sb.append(name_arr[i+1]).append("\n");	
				
			}

		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

}


/* 테스트케이스
26 5
Bulbasaur
Ivysaur
Venusaur
Charmander
Charmeleon
Charizard
Squirtle
Wartortle
Blastoise
Caterpie
Metapod
Butterfree
Weedle
Kakuna
Beedrill
Pidgey
Pidgeotto
Pidgeot
Rattata
Raticate
Spearow
Fearow
Ekans
Arbok
Pikachu
Raichu
25
Raichu
3
Pidgey
Kakuna

 * */
 