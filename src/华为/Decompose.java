package ��Ϊ;

import java.util.Scanner;
/*
 * ����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
	���һ��������ҲҪ�пո�

	��ϸ������

	�����ӿ�˵����
	public String getResult(long ulDataInput)
	���������
	long ulDataInput�������������
	����ֵ��
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
