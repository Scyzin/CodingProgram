package ��Ϊ;

import java.util.Scanner;
/*
 * ��Ŀ����
д��һ�����򣬽���һ���ַ�����Ȼ��������ַ�����ת����ַ��������磺
��������:
����N���ַ�
�������:
������ַ�����ת����ַ���
ʾ��1
����

abcd
���

dcba
 * 
 */
public class ReverseChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char [] arr = in.nextLine().toCharArray();
		for(int i = arr.length -1;i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
}
