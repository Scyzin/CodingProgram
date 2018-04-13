package 华为;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 题目描述
给定n个字符串，请对n个字符串按照字典序排列。
输入描述:
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
输出描述:
数据输出n行，输出结果为按照字典序排列的字符串。
示例1
输入

9
cap
to
cat
card
two
too
up
boat
boot
输出

boat
boot
cap
card
cat
to
too
two
up
 */
/*
 * 解题思路:
 * 
 */
public class DirectoryFind {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String []ss = new String[num];
		for(int i = 0; i < ss.length; i++) {
			ss[i] = in.next();
		}
		Arrays.sort(ss);
		for(int i = 0; i < ss.length; i++) {
		System.out.println(ss[i]);
	}
}
}
