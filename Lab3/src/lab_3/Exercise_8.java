package lab_3;

import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		boolean positive=isPositive(str);
		if(positive)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}

	private static boolean isPositive(String str) {
		char [] charArray=str.toCharArray();
		boolean flag=true;
		for(int i=0;i<charArray.length-1;i++)
		{
			if(charArray[i] < charArray[i+1])
			{
				continue;
			}
			else if(charArray[i] > charArray[i+1])
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
