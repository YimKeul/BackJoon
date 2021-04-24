package Q_1063_킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		String king = input[0];
		String stone = input[1];
		int n = Integer.parseInt(input[2]);
		
		int bord_k [][]= new int [8][8];
		int bord_s [][]= new int [8][8];
		
		int king_row =  king.charAt(0) - 65;
		int king_col = king.charAt(1) -'0' -1;
		
		int stone_row = stone.charAt(0)-65;
		int stone_col = stone.charAt(1)-'0' -1;
		
		
		//초기 위치 지정
		 bord_k[king_row][king_col] = 1;
		 bord_s[stone_row][stone_col] = 1;
		
	
		while (n-- > 0) {
			String move = br.readLine();
			switch (move) {
			case "R":
				if (king_col + 1 <=7 && bord_k[king_row][king_col+1] != 1) {
					bord_k[king_row][king_col]--;
					king_col += 1;
					bord_k[king_row][king_col] = 1;
				}

				if(bord_s[king_row][king_col] == 1) {
					if (king_col + 1<=7 && bord_s[king_row][king_col+1] != 1) {
						bord_s[king_row][king_col]--;
						king_col += 1;
						bord_s[king_row][king_col] = 1;
					}
				}//구현중
				if(bord_k[king_row][king_col] ==1  && bord_s[stone_row][stone_col] == 1) {
					System.out.println("run");
					bord_k[king_row][king_col]--;
					bord_k[king_row][king_col-1] = 1;
					
				}
				break;
			case "L":
				
				if (king_col - 1 >= 0 && bord_k[king_row][king_col-1] != 1) {
					bord_k[king_row][king_col]--;
					king_col -= 1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_col - 1 >= 0 && bord_s[king_row][king_col-1] != 1) {
						bord_s[king_row][king_col]--;
						king_col -= 1;
						bord_s[king_row][king_col] = 1;
					}
					
				}
				
				break;
			case "B":
				if (king_row - 1 >=0&&bord_k[king_row-1][king_col] != 1) {
					bord_k[king_row][king_col]--;
					king_row -=1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_col- 1 >=0&&bord_s[king_row-1][king_col] != 1) {
						bord_s[king_row][king_col]--;
						king_row -= 1;
						bord_s[king_row][king_col] = 1;
					}	
				}
				break;
			case "T":
				if (king_row + 1 <= 7&&bord_k[king_row+1][king_col] != 1) {
					bord_k[king_row][king_col]--;
					king_row += 1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_row + 1 <= 7&&bord_s[king_row+1][king_col] != 1) {
						bord_s[king_row][king_col]--;
						king_row += 1;
						bord_s[king_row][king_col] = 1;
					}
				}
				
				break;
			case "RT":
				
				if (king_row + 1 <= 7 && king_col + 1 <= 7 &&bord_k[king_row+1][king_col+1] != 1) {
					bord_k[king_row][king_col]--;
					king_row += 1;
					king_col += 1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_row + 1 <= 7 && king_col + 1 <= 7 &&bord_s[king_row+1][king_col+1] != 1) {
						bord_s[king_row][king_col]--;
						king_row += 1;
						king_col += 1;
						bord_s[king_row][king_col] = 1;
					}
				}
				break;
			case "LT":
				if (king_row + 1 <= 7 && king_col - 1 >= 0&&bord_k[king_row+1][king_col-1] != 1) {
					bord_k[king_row][king_col]--;
					king_row += 1;
					king_col -= 1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_row + 1 <= 7 && king_col - 1 >= 0&&bord_s[king_row+1][king_col-1] != 1) {
						bord_s[king_row][king_col]--;
						king_row += 1;
						king_col -= 1;
						bord_s[king_row][king_col] = 1;
					}
				}
				
			break;
			case "RB":
				
				if (king_row - 1 >= 0 && king_col + 1 <= 7&&bord_k[king_row-1][king_col+1] != 1) {
					bord_k[king_row][king_col]--;
					king_row -= 1;
					king_col += 1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_row - 1 >= 0 && king_col + 1 <= 7&&bord_s[king_row-1][king_col+1] != 1) {
						bord_s[king_row][king_col]--;
						king_row -= 1;
						king_col += 1;
						bord_s[king_row][king_col] = 1;
					}	
				}
				break;
			case "LB":
				if (king_row - 1 >= 0 && king_col - 1 >= 0&&bord_k[king_row-1][king_col-1] != 1) {
					bord_k[king_row][king_col]--;
					king_row -= 1;
					king_col -= 1;
					bord_k[king_row][king_col] = 1;
				}
				if(bord_s[king_row][king_col] == 1) {
					if (king_row - 1 >= 0 && king_col - 1 >= 0&&bord_s[king_row-1][king_col-1] != 1) {
						bord_s[king_row][king_col]--;
						king_row -= 1;
						king_col -= 1;
						bord_s[king_row][king_col] = 1;
					}	
				}
				break;
			}
		}
		
		
		
			for (int i = 7; i >= 0; i--) {

			for (int j = 0; j < 8; j++) {
				if (bord_k[i][j] == 1) {

					char text_x = (char) (i + 65);
					System.out.println(" K : "+text_x + "" + (j + 1));
				}

				if (bord_s[i][j] == 1) {
					char text_s = (char) (i + 65);

					System.out.println("S : "+text_s + "" + (j + 1));
				}

			}
		}

	}
}



/*
 			for (int i = 7; i >= 0; i--) {

				for (int j = 0; j < 8; j++) {
					if (bord[i][j] == 1) {

						char text_x = (char) (i + 65);
						System.out.println("king : " + text_x + "" + (j + 1));
					}

					if (bord[i][j] == 1) {
						char text_s = (char) (i + 65);

						System.out.println("stone : " + text_s + "" + (j + 1));
					}

				}
			}
 */




/*
 			if (move.equals("L")) {
				if (king_col - 1 >= 0 && bord[king_row][king_col-1] != 1) {
					bord[king_row][king_col]--;
					king_col -= 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_col - 1 >= 0&&bord[stone_row][stone_col-1] != 1) {
					bord[stone_row][stone_col]--;
					stone_col -= 1;
					bord[stone_row][stone_col] = 1;
				}
			} 
			
			else if (move.equals("R")) {
				if (king_col + 1 <= 7&&bord[king_row][king_col+1] != 1) {
					bord[king_row][king_col]--;
					king_col += 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_col + 1 <= 7&&bord[stone_row][stone_col+1] != 1) {
					bord[stone_row][stone_col]--;
					stone_col += 1;
					bord[stone_row][stone_col] = 1;
				}
			} 
			else if (move.equals("B")) {
				if (king_row - 1 >= 0&&bord[king_row-1][king_col] != 1) {
					bord[king_row][king_col]--;
					king_row -= 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_row - 1 >= 0&&bord[stone_row-1][stone_col] != 1) {
					bord[stone_row][stone_col]--;
					stone_row -= 1;
					bord[stone_row][stone_col] = 1;
				}
			} else if (move.equals("T")) {
				if (king_row + 1 <= 7&&bord[king_row+1][king_col] != 1) {
					bord[king_row][king_col]--;
					king_row += 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_row + 1 <= 7&&bord[stone_row+1][stone_col] != 1) {
					bord[stone_row][stone_col]--;
					stone_row += 1;
					bord[stone_row][stone_col] = 1;
				}
			} 
			
			else if (move.equals("RT")) {
				if (king_row + 1 <= 7 && king_col + 1 <= 7 &&bord[king_row+1][king_col+1] != 1) {
					bord[king_row][king_col]--;
					king_row += 1;
					king_col += 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_row + 1 <= 7 && stone_col + 1 <= 7&&bord[stone_row+1][stone_col+1] != 1) {
					bord[stone_row][stone_col]--;
					stone_row += 1;
					stone_col += 1;
					bord[stone_row][stone_col] = 1;
				}
			} else if (move.equals("LT")) {
				if (king_row + 1 <= 7 && king_col - 1 >= 0&&bord[king_row+1][king_col-1] != 1) {
					bord[king_row][king_col]--;
					king_row += 1;
					king_col -= 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_row + 1 <= 7 && stone_col - 1 >= 0&&bord[stone_row+1][stone_col-1] != 1) {
					bord[stone_row][stone_col]--;
					stone_row += 1;
					stone_col -= 1;
					bord[stone_row][stone_col] = 1;
				}
			} else if (move.equals("LB")) {
				if (king_row - 1 >= 0 && king_col - 1 >= 0&&bord[king_row-1][king_col-1] != 1) {
					bord[king_row][king_col]--;
					king_row -= 1;
					king_col -= 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_row - 1 >= 0 && stone_col - 1 >= 0&&bord[stone_row+1][stone_col-1] != 1) {
					bord[stone_row][stone_col]--;
					stone_row -= 1;
					stone_col -= 1;
					bord[stone_row][stone_col] = 1;
				}
			} 
			else if (move.equals("RB")) {
				if (king_row - 1 >= 0 && king_col + 1 <= 7&&bord[king_row-1][king_col+1] != 1) {
					bord[king_row][king_col]--;
					king_row -= 1;
					king_col += 1;
					bord[king_row][king_col] = 1;
				}
				if (stone_row - 1 >= 0 && stone_col + 1 <= 7&&bord[stone_row-1][stone_col+1] != 1) {
					bord[stone_row][stone_col]--;
					stone_row -= 1;
					stone_col += 1;
					bord[stone_row][stone_col] = 1;
				}
			}
 * */
 