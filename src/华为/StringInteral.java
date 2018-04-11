package 华为;

import java.util.Scanner;

/*
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
	长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * 
 * 输出到长度为8的新字符串数组
 */
public class StringInteral {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            if(s.length() % 8 != 0){
                  s = s + "00000000";
            }
              
            while(s.length() >= 8){
                System.out.println(s.substring(0,8));
                s = s.substring(8);
                
            }
        }
		
	}
}
