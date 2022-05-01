package baekjoon.브루트포스;

import java.util.Scanner;

public class Sol7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			count = 1;
			for(int j = 0; j < n; j++) {
				if(arr[i][0] < arr[j][0]
						&& arr[i][1] < arr[j][1]) {
					count++;
				}
			}
			
			System.out.print(count + " ");
		}
		
		
		sc.close();
	}
}
