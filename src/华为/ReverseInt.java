package ��Ϊ;

import java.util.Scanner;
/*
 * ��Ŀ����
������
����һ��������������������ַ�������ʽ�������
���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
 
��������:
����һ��int����
�������:
������������ַ�������ʽ�������
ʾ��1
����

1516000
���

0006151
 * 
 */


public class ReverseInt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		StringBuffer sb = new StringBuffer();

		String str = String.valueOf(num);
		sb.append(str);
		System.out.println(sb.reverse().toString());

	}
}
