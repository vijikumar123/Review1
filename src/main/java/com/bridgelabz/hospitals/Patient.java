package com.bridgelabz.hospitals;

public class Patient {
    String name;
    int age;
    String phoneNumber;
    String city;
    String state;
    Department department;

    Patient(String name, int age, String phoneNumber, String city, String state, Department department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;
    }
}
class Hospital{
    String name;
    Map<Department,Patient> patient;
    Hospital(String name) {
        this.name = name;
        this.patient = new
                HashMap<Department, Patient>();
    }
    void addPatient(Pat)
    }



}
