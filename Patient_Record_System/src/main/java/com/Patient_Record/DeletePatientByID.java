package com.Patient_Record;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Patient.Entity.Patients;

import patient.Utility.HibernateUtility;

public class DeletePatientByID {
	
	public void PatientId() {
		// 1.session factory
				SessionFactory factory = HibernateUtility.getSessionFactory();
				
				// 2.session from session factory
				Session session = factory.openSession();
				
				// 3.Transaction from session
				Transaction transaction = session.beginTransaction();
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Patient ID to delete : ");
				int Id = sc.nextInt();
				

				Patients st = session.find(Patients.class, Id);
				session.remove(st);
				
				
				
				transaction.commit();
				
				session.clear();
				
		}	

}
