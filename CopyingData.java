package models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyingData {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the file path to Read");
		String src=scan.nextLine();
		System.out.println("Enter the file to PAste the data");
		String trgt=scan.nextLine();
		
		File source,target;
		
		source=new File(src);
		target=new File(trgt);
		try {
			FileInputStream fis=new FileInputStream(source);
			FileOutputStream fos=new FileOutputStream(target);
			
			byte data[]=new byte[512];
			
			while(fis.read(data)!=-1) {
				fos.write(data);
			}
			System.out.println("Data copied successfully ");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
//C:/Users/sathi/Desktop/modified.pdf