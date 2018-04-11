package 华为;

import java.util.Scanner;
/*
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
 * 设计一个算法，求输入A和B的最小公倍数。
 * 
 * 思路：最小公倍数等于两个数的成绩除以最大公约数
 * 		最大公约数用欧几里得算法。
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
