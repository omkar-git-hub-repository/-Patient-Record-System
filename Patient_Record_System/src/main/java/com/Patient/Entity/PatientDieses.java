package com.Patient.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientDieses {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dieses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDieses() {
        return dieses;
    }

    public void setDieses(String dieses) {
        this.dieses = dieses;
    }

    @Override
    public String toString() {
        return "PatientDieses [id=" + id + ", dieses=" + dieses + "]";
    }
    


}
