package ��Ϊ;
/*
 * �Ǹ�����
 * 
 * �������������������ͳ�����еĸ��������������зǸ�����ƽ��ֵ
 */

import java.util.Scanner;

public class NonPositive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count1 = 0, count2 = 0;
		double sum = 0, avg = 0;
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n < 0) {
				count1++;
			} else {
				count2++;
				sum += n;
			}
		}
		avg = sum / count2;
		System.out.println(count1);
		System.out.printf("%.1f\n", avg);
	}
}
