package ��Ϊ;

import java.util.Scanner;
/*
 * �����ַ������һ�����ʵĳ��ȣ������Կո������ 
	��������:
	һ���ַ������ǿգ�����С��5000��
	�������:
	����N�����һ�����ʵĳ��ȡ�
 * 
 * ����split�������ָ��ַ���
 */
public class LastWordLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			String str = in.nextLine();
			String[] arr = str.split(" ");
			System.out.println(arr[arr.length - 1].length());
	}
}
