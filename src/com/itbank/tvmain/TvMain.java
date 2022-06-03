package com.itbank.tvmain;

import java.util.Scanner;

import com.itbank.tvfunc.*;


public class TvMain {
	public static void main(String[] args) {
		TvChannel tc = new TvChannel();
		TvVolume tv = new TvVolume();
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.채널입력 & 변경");
			System.out.println("2.음량 조절");
			System.out.println("3.TV 종료");
			num = sc.nextInt();
			switch(num) {
			case 1:
				tc.channel();
				break;
			case 2:
				tv.volume();
				break;
			case 3:
				System.exit(0);
			
			}

		}
	}
}
