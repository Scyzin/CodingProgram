package 华为;

/*
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 *  如：输入“I am a student”，输出“tneduts a ma I”。
 * 
 */
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String str = in.nextLine();
			StringBuffer s = new StringBuffer(str);
			System.out.println(s.reverse().toString());
		}
		in.close();
	}
}
