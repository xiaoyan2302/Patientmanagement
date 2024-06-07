package org.example.repository;

import org.example.model.Patient;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class PatientJDBCDaoTest {

    @Test
    public void getPatientsTest(){
        PatientJDBCDao patientJDBCDao = new PatientJDBCDao();
        List<Patient> patients = patientJDBCDao.getPatient();

        assertEquals( 0, patients.size());
    }
}
