package ��Ϊ;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * ��Ŀ����
����һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
��������:
����һ��int������
�������:
���մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�����
ʾ��1
����

9876673
���

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
