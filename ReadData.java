package models;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

public class ReadData {
	public static void main(String[] args) {
		String location="f:/Sathishjava/studentsdb.txt";
		
		File file=new File(location);
		
		try {
			FileReader reader=new FileReader(file);
			BufferedReader br=new BufferedReader(reader);
			
			String data=br.readLine(); // reads first line from the file.	
			while(!data.equals(null)) {
				System.out.println(data);
				data=br.readLine();
			}
		}
		
		catch(Exception e){
			// TODO: handle exception
			
		}
			
	}

}
