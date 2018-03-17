package 华为;

import java.util.Scanner;
/*
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
	最后一个数后面也要有空格

	详细描述：

	函数接口说明：
	public String getResult(long ulDataInput)
	输入参数：
	long ulDataInput：输入的正整数
	返回值：
	String
 * 
 */
public class Decompose{
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            long ulDatainput = in.nextLong();
	            System.out.println(getResult(ulDatainput));
	        }
	    }
	    
	    public static String getResult(long ulDatainput){
	        StringBuffer str = new StringBuffer();
	        long n = ulDatainput;
	        while(n != 1){
	            for(int i =2 ; i < n +1 ; i++){
	                if(n % i == 0 ){
	                    str.append(i + " ");
	                    n /= i;
	                    break;
	                }
	            }
	        }
	        return str.toString();
	    }
	}
