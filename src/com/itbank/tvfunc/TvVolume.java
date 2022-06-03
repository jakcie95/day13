package com.itbank.tvfunc;

import java.util.Scanner;

public class TvVolume {
public void volume() {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	char a;
	System.out.println("! 버튼을 누르면 메인으로 돌아갑니다.");
	while(true) {
		System.out.println("현재 볼륨은" + num + "입니다");
		System.out.println("볼륨 조절" + "\n"+"+\t"+"-");
		a = sc.next().charAt(0);
		if(a == '+') {
			num = num + 1;
			continue;
		}else if(a == '-') {
			num = num - 1;
			continue;
		}else if(a == '!'){
			break;
		}else {
			System.out.println("잘못된 입력입니다");
			continue;
		}
			
	}
}
}