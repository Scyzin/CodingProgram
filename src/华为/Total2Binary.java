package 华为;

import java.util.Scanner;

/*
 * 题目描述
输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
输入描述:
 输入一个整数（int类型）
输出描述:
 这个数转换成2进制后，输出1的个数
示例1
输入

5
输出

2
 * 
 */
public class Total2Binary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int total = 0;
		String binary = Integer.toBinaryString(i);
		for(int b = 0; b < binary.length(); b ++) {
			if(binary.charAt(b) == '1') {
				total++;
			}
		}
		
		System.out.println(total);
		/*
	Scanner scan = new Scanner(System.in);
		        int n = scan.nextInt();
		        int count = 0;
		        while(n>0){
		            if((n&1)>0){
		                count++;
		            }
		            n=n>>1;
		        }
		        System.out.println(count);
		*/
	}
}
