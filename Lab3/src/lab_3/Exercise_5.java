package lab_3;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String text=sc.nextLine();
		int word_count=0,line_count=0,char_count=0;
		String [] wordSplit=text.split(" ");
		word_count=wordSplit.length;
		System.out.println(word_count);
		String [] lineSplit=text.split("\n");
		line_count=lineSplit.length;
		System.out.println(line_count);
		for(int i=0;i<=word_count;i++)
		{
			char_count=char_count+wordSplit[i].length();
		}
		System.out.println(char_count);

	}

}
