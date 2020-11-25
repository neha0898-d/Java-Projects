package lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int num=sc.nextInt();
		System.out.println("Input Number :"+num);
		num=modifyNumber(num);
		System.out.println("Output Number:"+num);

	}

	private static int modifyNumber(int num) {
		String str=Integer.toString(num);
		char [] charArray=str.toCharArray();
		int [] intArray=new int[charArray.length];
		int i=0;
		for( i=0;i<charArray.length;i++)
		{
			intArray[i]=charArray[i] - '0';
		}
		//System.out.println(intArray[0]);
		int [] temp=new int[str.length()];
		for(i=0;i<intArray.length-1;i++)
		{
			temp[i]=Math.abs(intArray[i]-intArray[i+1]);
			//System.out.print(temp[i]);
		}
		temp[temp.length-1]=intArray[intArray.length-1];
		/*for(i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]);
		}*/
		StringBuffer strBuf=new StringBuffer();
		for(i=0;i<temp.length;i++)
		{
			strBuf.append(temp[i]);
		}
		//System.out.print(strBuf);
		str=strBuf.toString();
		num=Integer.parseInt(str);
		return num;
	}

}
