package ��Ϊ;

import java.util.Scanner;

/*
 * ��Ŀ����
		д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
	��������:
		����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
	�������:
		��������ַ����к��и��ַ��ĸ�����
 * ʾ��1
		����
		ABCDEF A
 */
public class CountRepeat {
	public static void main(String[] args) {
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toUpperCase();
		char target  = in.nextLine().toUpperCase().toCharArray()[0];
		
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == target) {
				count++;
			}
		}
		System.out.println(count);
	}
}
