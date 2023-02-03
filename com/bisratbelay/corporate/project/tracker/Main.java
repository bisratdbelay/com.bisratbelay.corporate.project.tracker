package com.bisratbelay.corporate.project.tracker;

import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------initialize variables------------------
		String fileName="project_list.csv";
		String filepath=""; //if a filepath is desired
		
		//-----------initialize array objects-------------
		Employee[] arrEmp = new Employee[] {new Employee("Bisrat", "Belay", "")};
		
		//-------record user input-----------
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter projectName: ");
		String projectName = scanner1.nextLine();
		
		System.out.println("Enter clientName: ");
		String clientName = scanner1.nextLine();
		
		System.out.println("Enter quote: ");
		String quote = scanner1.nextLine();
		
		scanner1.close();
		
		//-----create new file---------//
		try {
			File newFile = new File(fileName);
			      if (newFile.createNewFile()) {
			        System.out.println("\nFile created: " + newFile.getName());
			      } else {
			        System.out.println("\nFile already exists.");
			      }
		} catch (IOException e) {
		System.out.println("\nError has occurred.");
		e.printStackTrace();
		}
		//----------write to new file---------------//
		try {
			  FileWriter newWriter = new FileWriter(fileName, true);
			      newWriter.write("\n" + arrEmp[0].firstName + " " + arrEmp[0].lastName + ", " + projectName + ", " + clientName + ", " + quote + ", " + new Date());
			      newWriter.close();
			      System.out.println("\nWrote to the file.");
		} catch (IOException e) {
			      System.out.println("\nError has occurred.");
			      e.printStackTrace();
		}
		

	}

}
