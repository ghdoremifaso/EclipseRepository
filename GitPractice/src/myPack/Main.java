package myPack;

import java.util.Random;

public class Main {

	public static void main(String[] args){

		System.out.println("Hello World");

		System.out.println("明日の天気は");
		int rnd = new Random().nextInt(3);
		switch(rnd){
			case 0:
				System.out.println("晴");
				break;
			case 1:
				System.out.println("曇");
				break;
			case 2:
				System.out.println("雨");
			default:
				break;
		}


	}

}
