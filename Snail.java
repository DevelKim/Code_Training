package com.Sep_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int count = 0;
		while(sum < V) {
			sum += A;
			count++;
			if(sum >= V) {
				break;
			}
			else {
				sum -= B;
			}
		}
		
		System.out.println(count);
	}
}