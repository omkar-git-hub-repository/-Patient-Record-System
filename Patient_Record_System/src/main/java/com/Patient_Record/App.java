package com.Patient_Record;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Patient Registration System! ");

		System.out.println("Choose an option: " 
		+ "\n1.Add new Patient" 
				+ "\n2.Delete Patient By Id"
				+ "\n3.Update Desiese"
				+ "\n4 Get All PAtients Details :" 
				+ "\n5.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:
			Add_new_patient ap = new Add_new_patient();
			ap.AddPatients();
			break;

		case 2:
			DeletePatientByID d = new DeletePatientByID();
			d.PatientId();
			break;

		case 3:
			Update_Desiese_or_Date u = new Update_Desiese_or_Date();
			u.updateDetails();
			break;
			
		case 4:
			GetAllPatients p  = new GetAllPatients();
			p.getAllPatientDetails();
			break;

		case 5:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;
		}
	}
}
