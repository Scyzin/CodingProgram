package ��Ϊ;

/*
 * ��һ���ַ���str�����ݵߵ��������������str�ĳ��Ȳ�����100���ַ���
 *  �磺���롰I am a student���������tneduts a ma I����
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
