package ��Ϊ;

import java.util.Scanner;
/*
 * ��Ŀ����
��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�

�ӿ�˵��
/**
 * ��ת����
 * 
 * @param sentence ԭ����
 * @return ��ת��ľ���
 */
/*public String reverse(String sentence);
 
 
 
��������:
��һ��Ӣ������Ե���Ϊ��λ�����ŷš�
�������:
�õ�����ľ���
ʾ��1
����

I am a boy
���

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

