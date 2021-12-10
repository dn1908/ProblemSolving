package com.prepare.day;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class CompareFolders {

	//Function to extract list of files from the folder passed-in
	static ArrayList<ArrayList<String>> getFilesFromFolder(String path) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> folders = new ArrayList<String>();
		ArrayList<ArrayList<String>> finalList =  new ArrayList<ArrayList<String>>();
		
		File folder  = new File(path);
		File[] listFiles = folder.listFiles();
		
		for(File file  :listFiles) {
			if(file.isFile())
				list.add(file.getName());
			else if(file.isDirectory())
				folders.add(file.getPath());
		}
		finalList.add(list);
		finalList.add(folders);
		return finalList;
	}
	
	//Compares 2 folders passed-in and prints out the differences in contents 
	static void Compare2Folders(String path1, String path2) throws IOException {
		ArrayList<String> nameslist1 =  new ArrayList<String>();
		ArrayList<String> nameslist2 =  new ArrayList<String>();
		ArrayList<String> foldersIn1 = new ArrayList<String>();
		ArrayList<String> foldersIn2 = new ArrayList<String>();
		
		ArrayList<ArrayList<String>> finalList1 = getFilesFromFolder(path1);
		ArrayList<ArrayList<String>> finalList2 = getFilesFromFolder(path2);	
		
		ArrayList<String> fileslist1 = finalList1.get(0);
		ArrayList<String> foldersList1 = finalList1.get(1);
		
		ArrayList<String> fileslist2 = finalList2.get(0);
		ArrayList<String> foldersList2 = finalList2.get(1);
		
		for(int i = 0 ; i< fileslist1.size(); i++) {
			fileslist2.remove(fileslist1.get(i));
			fileslist1.remove(fileslist1.get(i));
		}
		
		for(String item  : foldersList1) {
			if(foldersList2.contains(item)) {
				foldersList2.remove(item);
				foldersList1.remove(item);
			}
		}
		
		//getFilesForSubFolders(foldersList1)
		
		for(String item : fileslist1) 
			System.out.println("Only in " + path1 + " : " + item);
		for(String item : foldersList1) 
			System.out.println("Only in " + path1 + " : " + item);
		for(String item : fileslist2) 
			System.out.println("Only in " + path2 + " : " + item);
		for(String item : foldersList2)
			System.out.println("Only in " + path2 + " : " + item);
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path1 = "C:\\Important\\Divya\\Divya\\Cover letters\\actian";
		String path2 =  "C:\\Important\\Divya\\Divya\\Cover letters\\Cerner";
		
		Compare2Folders(path1,path2);
		
		

	}

}
