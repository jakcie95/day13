package main;

import java.util.Scanner;

import tv.TvClass;

public class MainClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num;
	TvClass tv = new TvClass();
	while (true) {
		System.out.println("1.TV");
		System.out.println("2.냉장고");
		System.out.println("3.에어컨");
		num = sc.nextInt();
		switch(num) {
		case 1:
			tv.display();
			break;
		case 2:break;
		case 3:break;
		}
	}
	
}
}
