package com.basic.Impotant_programme;

import java.io.File;

public class File_Handleing {

	public static void main(String[] args) {
		File f=new File("E:\\Handling");
//		if(f.mkdir())
//		{
//			System.out.println("Creating Handling folder ");
//		}
//		if(f.exists())
//		{
//			System.out.println("Folder exists");
//		}
//		if(f.delete())
//		{
//			System.out.println("Delete the folder");
//		}
		if(f.mkdir())
		{
			System.out.println("Folder created.");
		}
		if(f.exists())
		{
			System.out.println(" Folder Exist");
		}
		else
		{
			System.out.println("Not exist");
		}
		
		

	}

}
