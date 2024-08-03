package com.basic.Impotant_programme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\Handling\\Create.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Some text should be there");
		fw.flush();
		System.out.println("Data inserted successfully!");
		fw.close();

	}

}
