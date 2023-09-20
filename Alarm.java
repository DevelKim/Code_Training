package com.Sep_13;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = 0;
		int m = 0;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		int cH = h - 1;
		int cM = m - 45;
		
		if(m>=45) System.out.printf("%d %d", h, cM);
		else {
			if(h==0) {
				cH = 23;
				cM += 60;
				System.out.printf("%d %d", cH, cM);
			}
			else {
				cM += 60;
				System.out.printf("%d %d", cH, cM);
			}
		}
	}
}