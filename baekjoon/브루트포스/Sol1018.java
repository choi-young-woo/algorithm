package baekjoon.브루트포스;

import java.util.Scanner;

public class Sol1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		String[][] board = new String[n][m];
		String line = "";
		String[] arr = new String[m];
		
		for(int i = 0 ; i < n; i++) {
			line = sc.nextLine();
			
			arr = line.split("");
			board[i] = arr;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0 ; j < m; j++) {
				
			}
			System.out.println();
		}
		
		sc.close();
	}
}
