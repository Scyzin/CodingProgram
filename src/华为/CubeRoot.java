package 华为;

import java.util.Scanner;
/**
 * 计算一个数字的立方根，不使用库函数
	详细描述：
	•接口说明
	原型：
	public static double getCubeRoot(double input)
	输入:double 待求解参数
	返回值:double  输入参数的立方根
	
	思路：用二分查找暴力解决
 * @author Administrator
 *
 */
public class CubeRoot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double solve = in.nextDouble();
			System.out.printf("%.1f", getCubeRoot(solve));
		}
		in.close();
	}

	public static double getCubeRoot(double input) {
		double min = 0;
		double max = input;
		double mid = 0;

		while ((max - min) > 0.001) {
			mid = (max + min) / 2;
			if (mid * mid * mid > input)
				max = mid;
			else if (mid * mid * mid < input) {
				min = mid;
			} else
				return mid;
		}
		return max;
	}
}