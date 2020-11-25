package lab_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text with one gap");
		String text=sc.nextLine();
		StringTokenizer st=new StringTokenizer(text," ");
		int sum=0;
		while(st.hasMoreTokens())
		{
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("Number "+n);
			sum=sum+n;
		}
		System.out.println("Sum "+sum);

	}

}
