package lesson_7_homework.Clinic.Doctors;

import lesson_7_homework.Clinic.Patient;

public class Surgeon extends Doctor {
    public Surgeon(String firstName, String lastName, int age, String additionalInfo) {
        super(firstName, lastName, age, "Surgeon", additionalInfo);
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println(ANSI_RED + "--------------Performing---------------------" + ANSI_STANDARD);
        System.out.println();
        System.out.println(ANSI_GREEN +"Surgeon " + ANSI_YELLOW +this.getFirstName() + " " + this.getLastName() +
                ANSI_GREEN +" is performing surgery on " + ANSI_YELLOW
                + patient.getFirstName() + " " + patient.getLastName() + ".");
        System.out.println();
        System.out.println(ANSI_RED + "--------------Performing---------------------" + ANSI_STANDARD);
    }
}