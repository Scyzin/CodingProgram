package 华为;

import java.util.Scanner;
/*
 *  写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
	输入描述:
	输入一个十六进制的数值字符串。
	输出描述:
	输出该数值的十进制字符串。
 * 
 * 
 * 利用Integer.parseInt(str,进制)
 */
public class HexTransfer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String str = in.nextLine();
			System.out.println(Integer.parseInt(str.substring(2),16));
		}
	}
}
