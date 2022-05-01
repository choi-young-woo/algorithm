package baekjoon;

import java.util.Scanner;

public class Sol2447 {
	
	static int sum = Integer.MAX_VALUE;
	static int abs = Integer.MAX_VALUE;
	static int n = 0;
	static int m = 0;
	static int arr[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		fun(0, 0, 0);
		
		System.out.println(sum);
		
		sc.close();
	
	}
	
	public static void fun(int cnt, int curSum, int idx) {
		//System.out.println(cnt + ", " + curSum + ", " + idx);
		
		if(idx == arr.length) {
			return;
		}
		
		if(cnt == 3) {
			
			//curSum += arr[idx];
			
			int temp = Math.abs(m - curSum);
			
			//System.out.println(m + ", " + curSum + ", " + temp);
			
			if(temp < abs) {
				sum = curSum;
				abs = temp;
			}
			
			return;
		}
		
		curSum += arr[idx];
		cnt++;
		idx++;
		fun(cnt, curSum, idx);
		
		curSum -= arr[idx-1];
		cnt--;
		fun(cnt, curSum, idx);
	}
}
