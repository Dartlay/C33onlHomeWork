package lesson_7_homework.Clinic.Doctors;
import lesson_7_homework.Clinic.Patient;

public class Therapist extends Doctor {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_STANDARD = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public Therapist(String firstName, String lastName, int age, String additionalInfo) {
        super(firstName, lastName, age, "Therapist", additionalInfo);
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println(ANSI_GREEN + "Therapist: " + ANSI_YELLOW + this.getFirstName() +
                " " + ANSI_YELLOW + this.getLastName() + ANSI_GREEN + " is providing therapy for "
                + ANSI_YELLOW + patient.getFirstName() + " " + ANSI_YELLOW + patient.getLastName() + ".");
    }
}
