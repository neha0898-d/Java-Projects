package lab_3;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Final image String--->"+getImage(str));

	}

	private static String getImage(String str) {
		String reverse=new StringBuffer(str).reverse().toString();
		str=str.concat("|");
		str=str.concat(reverse);
		return str;
	}

}
