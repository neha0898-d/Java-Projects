package lab_3;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String str1=alterString(str);
		System.out.println(str+" is changed to "+str1);

	}

	private static String alterString(String str) {
		char [] charArray=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			char ch;
			ch=str.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch==' '))
			{
				charArray[i]=(char)(1+ charArray[i]);
			}
		}
		str=String.valueOf(charArray);
		return str;
	}

}
