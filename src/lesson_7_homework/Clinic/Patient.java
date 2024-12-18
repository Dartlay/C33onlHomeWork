package lesson_7_homework.Clinic;

import lesson_7_homework.Clinic.Doctors.Doctor;

public class Patient {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_STANDARD = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    private String firstName;
    private String lastName;
    private int age;
    private String diagnosis;
    private String treatmentPlan;
    private Doctor personalDoctor;

    public Patient(String firstName, String lastName, int age, String diagnosis, String treatmentPlan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    public void setPersonalDoctor(Doctor doctor) {
        this.personalDoctor = doctor;
    }
    public void displayCard() {
        System.out.println( ANSI_GREEN + "--------------"+ANSI_YELLOW +"Patient Card"+ANSI_GREEN+"-------------------" + ANSI_STANDARD);
        System.out.println( ANSI_GREEN + "\tFirst Name: " + ANSI_YELLOW +firstName );
        System.out.println( ANSI_GREEN+ "\tLast Name: " + ANSI_YELLOW +lastName );
        System.out.println(ANSI_GREEN + "\tAge: " + ANSI_YELLOW + age);
        System.out.println(ANSI_YELLOW + "\tDiagnosis: " + ANSI_GREEN + diagnosis);
        System.out.println(ANSI_GREEN + "--------------Personal Doctor---------------" + ANSI_STANDARD);
        System.out.println( ANSI_GREEN + "\tPersonal Doctor: " + ANSI_GREEN
                + (personalDoctor != null ? personalDoctor :  ANSI_RED +"Not assigned"));
        System.out.println( ANSI_GREEN + "\tTreatment Plan: " + ANSI_YELLOW + treatmentPlan + ANSI_STANDARD);
        System.out.println(ANSI_GREEN +"-----------------------------" + ANSI_STANDARD);
    }

}