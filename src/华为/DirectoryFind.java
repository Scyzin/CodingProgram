package ��Ϊ;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ��Ŀ����
����n���ַ��������n���ַ��������ֵ������С�
��������:
�����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
�������:
�������n�У�������Ϊ�����ֵ������е��ַ�����
ʾ��1
����

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
���

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
 * ����˼·:
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
