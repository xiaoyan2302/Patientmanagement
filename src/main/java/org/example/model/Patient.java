package org.example.model;

public class Patient {

    public Patient () {
    }

    public Patient(long id, String name, String dob, String phonenumber, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    private long id;
    private String name;
    private String address;
    private String phonenumber;
    private String dob;

    public void setId(Long id) {this.id=id;}
    public void setName(String name) {
        this.name=name;
    }
    public void setDob(String dob){this.dob=dob;}
    public void setPhonenumber(String phonenumber){this.phonenumber=phonenumber;}
    public void setAddress(String address){
        this.address=address;
    }



}