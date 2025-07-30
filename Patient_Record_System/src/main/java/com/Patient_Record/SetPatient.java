package com.Patient_Record;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Patient.Entity.PatientDieses;
import com.Patient.Entity.Patients;

import patient.Utility.HibernateUtility;

public class SetPatient {
    
    public void setPatientData(){

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Patients p = new Patients();
        p.setId(106);
        p.setAdmittedDate("5-6-23");
        p.setAge(41);
        p.setDisease("Cardiac");
        p.setName("Bob Brown");
        
        PatientDieses  pd = new PatientDieses();
        pd.setDieses("Fever");

        PatientDieses  pd1 = new PatientDieses();
        pd.setDieses("Cough");

        PatientDieses  pd2 = new PatientDieses();
        pd.setDieses("Headache");

        PatientDieses  pd3 = new PatientDieses();
        pd.setDieses("Hear Failure");

        PatientDieses  pd4 = new PatientDieses();
        pd.setDieses("Kideny Failure");

        List<PatientDieses> diseaseList  = Arrays.asList(pd, pd1, pd2, pd3, pd4);
        p.setPatientdieses(diseaseList);

        session.persist(p);
        transaction.commit();
        session.close();

    }

}
