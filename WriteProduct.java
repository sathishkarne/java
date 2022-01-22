package models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteProduct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String location="f:/Sathishjava/ProductDetails.txt";
		File fo=new File(location);
		try {
			FileWriter writer = new FileWriter(fo,true);
			
			//Accepting data from user.
			System.out.println("Enter Product ID  ");
			int Id=scan.nextInt();
			writer.write("\n"+"Product ID:"+Id);
			System.out.println("Enter Product Name  ");				
			String name = scan.next(); 				
			writer.write("\n"+"Product Name:"+name);
			System.out.println("Enter Product Category  ");
			String cat=scan.next();
			writer.write("\n"+"Product Category:"+cat);
			System.out.println("Enter Product Cost  ");
			int Cost=scan.nextInt();
			writer.write("\n"+"Product Cost:"+Cost);
			System.out.println("Enter Product Quantity  ");
			int Qty=scan.nextInt();
			writer.write("\n"+"Product Quantity:"+Qty);
			

			//close the writer object
			writer.close();
			System.out.println("Data Stored successfully in the file");
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
		}
	}

}
