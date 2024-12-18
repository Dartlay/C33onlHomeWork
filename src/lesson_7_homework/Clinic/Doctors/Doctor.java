package lesson_7_homework.Clinic.Doctors;

import lesson_7_homework.Clinic.Patient;

public class Doctor {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_STANDARD = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private String additionalInfo;

    public Doctor(String firstName, String lastName, int age, String position, String additionalInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.additionalInfo = additionalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void treatPatient(Patient patient) {
        System.out.println("Treating " + patient.getFirstName() + " "
                + patient.getLastName() + " as a " + this.position);
    }
    @Override
    public String toString() {
        return "\n" +
                ANSI_GREEN + "\tFirst Name: " + ANSI_YELLOW + firstName  + "\n" +
                ANSI_GREEN + "\tLast Name: "+ ANSI_YELLOW + lastName  + "\n" +
                ANSI_GREEN + "\tAge: "+ ANSI_YELLOW + age + "\n" +
                ANSI_GREEN + "\tPosition: "+ ANSI_YELLOW + position + "\n" +
                ANSI_GREEN + "\tInfo: "+ ANSI_YELLOW + additionalInfo;

    }
}