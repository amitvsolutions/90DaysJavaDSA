package com.demo.recursion;

//Abstraction: Abstract class representing a general "Person"
abstract class Person {
 // Encapsulation: Private fields
 private String name;
 private int age;

 // Constructor to initialize the Person object
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Encapsulation: Public getter methods to access private fields
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Abstract method - must be implemented by subclasses
 public abstract void displayDetails();
}

//Inheritance: The Patient class inherits from Person
class Patient extends Person {
 private String patientId;
 private String disease;

 // Constructor to initialize Patient object
 public Patient(String name, int age, String patientId, String disease) {
     super(name, age); // Calling the superclass constructor
     this.patientId = patientId;
     this.disease = disease;
 }

 // Getter methods for the private fields
 public String getPatientId() {
     return patientId;
 }

 public String getDisease() {
     return disease;
 }

 // Implementation of the abstract method from the Person class
 @Override
 public void displayDetails() {
     System.out.println("Patient Details:");
     System.out.println("Name: " + getName());
     System.out.println("Age: " + getAge());
     System.out.println("Patient ID: " + getPatientId());
     System.out.println("Disease: " + getDisease());
 }
}

//Inheritance: The Doctor class also inherits from Person
class Doctor extends Person {
 private String doctorId;
 private String specialization;

 // Constructor to initialize Doctor object
 public Doctor(String name, int age, String doctorId, String specialization) {
     super(name, age); // Calling the superclass constructor
     this.doctorId = doctorId;
     this.specialization = specialization;
 }

 // Getter methods for the private fields
 public String getDoctorId() {
     return doctorId;
 }

 public String getSpecialization() {
     return specialization;
 }

 // Implementation of the abstract method from the Person class
 @Override
 public void displayDetails() {
     System.out.println("Doctor Details:");
     System.out.println("Name: " + getName());
     System.out.println("Age: " + getAge());
     System.out.println("Doctor ID: " + getDoctorId());
     System.out.println("Specialization: " + getSpecialization());
 }
}

//Main class to demonstrate the hospital system
public class Hospital {
 public static void main(String[] args) {
     // Creating objects of Patient and Doctor
     Patient patient1 = new Patient("John Doe", 30, "P123", "Flu");
     Doctor doctor1 = new Doctor("Dr. Smith", 45, "D456", "Cardiology");

     // Displaying the details using polymorphism (method overriding)
     patient1.displayDetails(); // Will call Patient's displayDetails()
     System.out.println(); // Just for separation
     doctor1.displayDetails(); // Will call Doctor's displayDetails()
 }
}
