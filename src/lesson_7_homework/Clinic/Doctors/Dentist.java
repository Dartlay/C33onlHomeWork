package lesson_7_homework.Clinic.Doctors;

import lesson_7_homework.Clinic.Patient;

public class Dentist extends Doctor {
    public Dentist(String firstName, String lastName, int age, String additionalInfo) {
        super(firstName, lastName, age, "Dentist", additionalInfo);
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println(ANSI_GREEN+ "--------------"+ ANSI_YELLOW +"Dentist"+ANSI_GREEN
                +"---------------------" + ANSI_STANDARD);
        System.out.println();
        System.out.println(ANSI_GREEN +"Dentist " + ANSI_YELLOW +this.getFirstName() + " " + this.getLastName()
               + ANSI_GREEN + " is treating "
              + ANSI_YELLOW + patient.getFirstName() + " " + patient.getLastName() + ANSI_GREEN + " for dental issues.");
        System.out.println();
        System.out.println(ANSI_GREEN+ "--------------"+ ANSI_YELLOW +"Dentist"+ANSI_GREEN
                +"---------------------" + ANSI_STANDARD);
    }
}