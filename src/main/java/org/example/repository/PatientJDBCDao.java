package org.example.repository;


import org.example.model.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PatientJDBCDao implements PatientDao{
    private static final String DB_URL = "jdbc:postgresql://localhost/postgres";
    private static final String USER="postgres" ;
    private static final String PASS= "postgres";
    private static final Logger logger =Logger.getLogger(PatientJDBCDao.class.getName());


    public List<Patient> getPatient() {
    List<Patient> patients = new ArrayList<Patient>();
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        String sql = "SELECT * FROM patient";

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        logger.info("Connects to DB and execute the query");

        while(rs.next()) {
            Long id = rs.getLong("id");
            String name = rs.getString("name");

            Patient patient = new Patient();
            patient.setId(id);
            patient.setName(name);
            logger.info("got patients {}");
            patients.add(patient);

        }
    } catch (SQLException e) {
        logger.log("Unable to query database", e);
        throw e;
    } finally {
        try {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {
            logger.log( "Unable to close db connection", e);
        }

    }
    return patients;
}
}
