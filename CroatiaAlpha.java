package com.Sep_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CroatiaAlpha {

	public static void main(String[] args) throws IOException{
		String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String s = br.readLine();
		int count2 = 0;
		int count3 = 0;
		
		for(int i=0; i<s.length()-1; i++) {
			String str = "";
			str = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1));
			for(int j=0; j<strArr.length; j++) {
				if(str.equals(strArr[j])) {
					if(i>0) {
						if(str.equals("z=") && s.charAt(i-1) == 'd') {
						continue;
						}
					}
					count2++;
				}
			}
		}
		
		for(int i=0; i<s.length()-2; i++) {
			String str = "";
			str = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1)) + String.valueOf(s.charAt(i+2));
			for(int j=0; j<strArr.length; j++) {
				if(str.equals(strArr[j])) {
					count3++;
				}
			}
		}
		
		int n = (s.length() - count2*2 - count3*3) + count2 + count3;
		
		bw.write(String.valueOf(n));
		bw.flush();
		bw.close();
		br.close();
	}
}