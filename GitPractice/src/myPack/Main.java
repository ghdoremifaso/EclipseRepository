package myPack;

import java.util.Random;

//メイン
public class Main {

	public static void main(String[] args){

		System.out.println("Hello World");

		System.out.println("明日の天気は");
		int rnd = new Random().nextInt(3);
		switch(rnd){
			case 0:
				System.out.print("【晴】");
				break;
			case 1:
				System.out.print("【曇】");
				break;
			case 2:
				System.out.print("【雨】");
			default:
				break;
		}
		System.out.println("です。");

	}

}
