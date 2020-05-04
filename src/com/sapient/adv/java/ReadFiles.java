package com.sapient.adv.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFiles {

	public static void readDirectory(String dirName) throws IOException {
        Files.list(new File(dirName).toPath())
                .forEach(path -> {
                    System.out.println(path);
                });
	}	
	
	public static void readAllFiles(String dirName) {
		File dir = new File(dirName);

		File [] subDirs = dir.listFiles();
		System.out.println(subDirs);
		displaySubDir(subDirs, 0);
		
	}
	
	
	 static void displaySubDir(File[] dirList, int level)  
     { 
         for (File file : dirList)  
         { 
             for (int i = 0; i < level; i++) 
                 System.out.print("\t"); 
              
             if(file.isFile())  
                 System.out.println(file.getName()); 
               
             else if(file.isDirectory())  
             {  
                 System.out.println(file.getName().toUpperCase() ); 
                 displaySubDir(file.listFiles(), level + 1); 
             } 
         } 
    } 
	
	
}
