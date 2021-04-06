package Q_1620_나는야포켓몬마스터;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

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
//			if (map.containsKey(name)) {
//				map.put(name, map.get(name) + 1);
//			} else {
//				map.put(name, i + 1);
//			}
			map.put(name, i + 1);
			name_arr[i+1] = name;
		}


		for (int i = 0; i < answer_time; i++) {
			String quiz = br.readLine();

			if (map.containsKey(quiz)) {
				sb.append(map.get(quiz)).append("\n");
			} else {
		//		if (map.containsValue(Integer.parseInt(quiz))) {
//					if (map.containsValue(Integer.parseInt(quiz))) {
//						sb.append(getKey(map, Integer.parseInt(quiz))).append("\n");
//					}
					sb.append(name_arr[i+1]).append("\n");
	//			}
				
				
			}

		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}

//	private static <K, V> K getKey(HashMap<K, V> map, V value) {
//		for (K key : map.keySet()) {
//			if (value.equals(map.get(key))) {
//				return key;
//			}
//		}
//		return null;
//	}
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
 