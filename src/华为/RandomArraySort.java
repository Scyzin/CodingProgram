package ��Ϊ;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * ��Ŀ����
	��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�����
	�ü����������N��1��1000֮������������N��1000�������������ظ���
	���֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ
	�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣
	����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 
Input Param 
     n               ����������ĸ���     
 inputArray      n�����������ɵ����� 
     
Return Value
     OutputArray    ����������������
 

ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣
 * 
 */
public class RandomArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			
			TreeSet<Integer> set = new TreeSet<>();
			int n =sc.nextInt();
			if(n > 0) {
				for(int i= 0; i < n; i++) {
					set.add(sc.nextInt());
				}
			}
			for(Integer i : set) {
				System.out.println(i);
			}
		}
	}
}
