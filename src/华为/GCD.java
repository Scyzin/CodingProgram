package ��Ϊ;

import java.util.Scanner;
/*
 * ������A��������B ����С��������ָ �ܱ�A��B��������С��������ֵ��
 * ���һ���㷨��������A��B����С��������
 * 
 * ˼·����С�����������������ĳɼ��������Լ��
 * 		���Լ����ŷ������㷨��
 * 
 * @author Administrator
 *
 */
public class GCD{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int A = in.nextInt();
            int B = in.nextInt();
            int result = A * B /divisor(A,B);
            System.out.println(result);
        }
    }
    
    public static int divisor(int m,int n){
        if (m % n == 0) {
            return n;
        }else{
            return divisor(n,m % n);
        }
    }
}
