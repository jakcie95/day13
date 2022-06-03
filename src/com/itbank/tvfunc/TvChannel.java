package com.itbank.tvfunc;


import java.util.*;

public class TvChannel {
public void channel() {
	Scanner sc = new Scanner(System.in);
	int num, cha, cha2;
	while(true) {
	System.out.println("1.채널을 입력");
	System.out.println("2.채널을 변경");
	System.out.println("3.메인으로 돌아가기");
	num = sc.nextInt();
	if(num == 1) {
		System.out.println("채널을 입력해주세요 : ");
		cha = sc.nextInt();
		System.out.println("현재 채널은 " + cha +" 입니다.");
	}else if(num == 2) {
		System.out.println("채널을 변경합니다");
		System.out.println("변경할 채널을 입력해주세요 : ");
		cha2 = sc.nextInt();
		System.out.println("변경된 채널은 " + cha2 + " 입니다.");
	}else if(num == 3) {
		System.out.println("처음으로 돌아갑니다.");
		break;
	}else {
		System.out.println("잘못된 동작입니다.");
		continue;
	}
	
	}
	
	
}	
}
