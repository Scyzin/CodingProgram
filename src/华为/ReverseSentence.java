package 华为;

import java.util.Scanner;
/*
 * 题目描述
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符

接口说明
/**
 * 反转句子
 * 
 * @param sentence 原句子
 * @return 反转后的句子
 */
/*public String reverse(String sentence);
 
 
 
输入描述:
将一个英文语句以单词为单位逆序排放。
输出描述:
得到逆序的句子
示例1
输入

I am a boy
输出

boy a am I
 * 
 */
public class ReverseSentence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(reverse(str));
	}
	
	public static String reverse(String sentence) {
		String[] arr = sentence.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i = arr.length - 1;i >= 0; i--) {
			sb.append(arr[i] + " ");
		}
		
		return sb.toString().trim();
	}
}

