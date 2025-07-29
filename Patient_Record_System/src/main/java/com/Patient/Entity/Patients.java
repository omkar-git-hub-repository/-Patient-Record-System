package com.Patient.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patient_Details")
public class Patients {

	@Id
	private int id;
	private String name;

	private int age;
	private String disease;
	private String admittedDate;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Patients_Id")
	private List<PatientDieses> patientdieses;

	

	public List<PatientDieses> getPatientdieses() {
		return patientdieses;
	}

	public void setPatientdieses(List<PatientDieses> patientdieses) {
		this.patientdieses = patientdieses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(String admittedDate) {
		this.admittedDate = admittedDate;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", age=" + age + ", disease=" + disease + ", admittedDate="
				+ admittedDate + "]";
	}

}
