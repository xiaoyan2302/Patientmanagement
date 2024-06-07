package org.example.repository;

import junit.framework.TestCase;
import org.example.model.Patient;

import java.sql.SQLException;
import java.util.List;

interface InventoryDao {

    public List<Patient> getinventory () throws SQLException;

}