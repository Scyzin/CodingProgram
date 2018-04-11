package 华为;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * 题目描述
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
输入描述:
输入一个int型整数
输出描述:
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
示例1
输入

9876673
输出

37689
 * 
 */
public class NorepeatNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String str = in.nextLine();
			char [] nums = str.toCharArray();
			Set<Character> st = new LinkedHashSet<Character>();
			for(int i = nums.length -1 ; i >= 0 ; i ++) {
				st.add(nums[i]);
			}
			String result = "";
			for(Character c : st) {
				result += c + "";
			}
			System.out.println(result);
		}
		
	}
}
