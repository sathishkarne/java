package models;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Create a new file in Sathish folder in the  F drive
		String location="f:/Sathishjava/studentsdb.txt";
		
		//convert the location into file format
		File fo=new File(location);
		
		//Creating FileWriter object.
		try {
			//FileWriter writer=new FileWriter(fo);
			//Write the data in a file.
			//writer.write("This is an example for the files");
			FileWriter writer = new FileWriter(fo,true);
			
			//Accepting data from user.
			System.out.println("Enter your data  ");
			String data = scan.nextLine(); 
			
			//Write the data in a file.
			writer.write("\n"+data);

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
