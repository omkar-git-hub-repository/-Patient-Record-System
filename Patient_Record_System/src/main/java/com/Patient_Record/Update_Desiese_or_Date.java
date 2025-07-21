package com.Patient_Record;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Patient.Entity.Patients;

import patient.Utility.HibernateUtility;

public class Update_Desiese_or_Date {

	public void updateDetails() {

		SessionFactory factory = HibernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient id: ");

		int pid = sc.nextInt();
		sc.nextLine();

		Patients p = session.find(Patients.class, pid);
		int patientNo = sc.nextInt();
		System.out.println("Enter Patient Id: ");

		p.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter patient name: ");
		p.setName(sc.nextLine());

		System.out.println("Enter patient Age: ");
		p.setAge(sc.nextInt());

		System.out.println("Enter patient Disease: ");
		p.setDisease(sc.nextLine());

		System.out.println("Enter admited Date :");
		p.setAdmittedDate(sc.nextLine());

		// persist
		session.persist(p);
		System.out.println("Updated Successfully " + p);

		transaction.commit();
		session.close();

	}
}
