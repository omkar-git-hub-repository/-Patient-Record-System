package com.Patient_Record;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Patient.Entity.Patients;

import patient.Utility.HibernateUtility;

public class GetAllPatients {
	
	public void getAllPatientDetails() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		System.out.println("All Patients : \n");
		
		List<Patients> studentlist = session.createQuery("SELECT p FROM Patients p", Patients.class).getResultList();
		studentlist.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();
		
	}

}
