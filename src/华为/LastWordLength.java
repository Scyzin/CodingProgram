package 华为;

import java.util.Scanner;
/*
 * 计算字符串最后一个单词的长度，单词以空格隔开。 
	输入描述:
	一行字符串，非空，长度小于5000。
	输出描述:
	整数N，最后一个单词的长度。
 * 
 * 运用split方法区分割字符串
 */
public class LastWordLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			String[] arr = str.split(" ");
			System.out.println(arr[arr.length - 1].length());
	}
}
