package com.cg.lab8.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread{
	public CopyDataThread() {

	}

	@Override
	public void run() {
		FileInputStream instream = null;
		FileOutputStream outstream = null;

		try{
			File infile =new File("C:\\Users\\Admin\\capgemini_demo\\Lab8\\source.txt");
			File outfile =new File("C:\\Users\\Admin\\capgemini_demo\\Lab8\\target.txt");

			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);
			while(infile.length()!=0) {
			for(int i=0;i<10;i++) {
				int b;
				if((b=instream.read())!=-1) {
					outstream.write(b);
				}
				else {
					break;
				}
			}
			System.out.println("10 characters are copied");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			if(outfile.length()==infile.length())
				break;
			}
			instream.close();
			outstream.close();



		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}


}
