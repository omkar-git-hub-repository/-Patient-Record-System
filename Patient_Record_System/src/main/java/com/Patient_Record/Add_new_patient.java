package com.Patient_Record;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.Patient.Entity.Patients;
import patient.Utility.HibernateUtility;

public class Add_new_patient {

	public void AddPatients() {

		// 1.session factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2.session from session factory
		Session session = factory.openSession();

		// 3.Transaction from session
		Transaction transaction = session.beginTransaction();

		Patients p = new Patients();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Patient Id: ");

		p.setId(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter patient name: ");
		p.setName(sc.nextLine());

		System.out.println("Enter patient Age: ");
		p.setAge(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter patient Disease: ");
		p.setDisease(sc.nextLine());

		System.out.println("Enter admited Date :");
		p.setAdmittedDate(sc.nextLine());

		// persist
		session.persist(p);
		System.out.println("Updated Successfully " + p);
		transaction.commit();
	}

}
