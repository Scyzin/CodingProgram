package ��Ϊ;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ��Ŀ����
��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
��������:
����N���ַ����ַ���ACSII�뷶Χ�ڡ�
�������:
�����Χ��(0~127)�ַ��ĸ�����
ʾ��1
����

abc
���

3
 * 
 */
public class CharNums {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		HashSet<String> setchars = new HashSet<String>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 0&& str.charAt(i)<=127) {
				setchars.add(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(setchars.size());
	}
}
