package lesson_7_homework.Clinic;
import lesson_7_homework.Clinic.Doctors.Dentist;
import lesson_7_homework.Clinic.Doctors.*;


public class Clinic {
    private Patient[] patients;
    private Doctor[] doctors;
    public Clinic() {
        this.patients = new Patient[]{
                new Patient("Alice", "Johnson", 28,
                        "Flu", "Medication and rest"),
                new Patient("Bob", "Smith", 34,
                        "Broken leg", "Cast and physical therapy"),
                new Patient("Charlie", "Brown", 45,
                        "Diabetes", "Insulin and dietary changes"),
                new Patient("David", "Lee", 25,
                        "Headache", "Pain medication and rest"),
                new Patient("Emily", "Davis", 42,
                        "High blood pressure", "Lifestyle changes and medication"),
                new Patient("Frank", "Wilson", 51,
                        "Arthritis", "Physical therapy and anti-inflammatory medication"),
                new Patient("Grace", "Taylor", 30,
                        "Toothache", "Pain relief and dental checkup")
        };
        this.doctors = new Doctor[]{
                new Dentist("John", "Doe", 30,
                        "Specializes in orthodontics"),
                new Surgeon("Jane", "Smith", 45,
                        "Expert in cardiac surgery"),
                new Therapist("Emily", "Johnson", 40,
                        "Focuses on cognitive therapy"),
                new Dentist("Sarah", "Lee", 35,
                        "Specializes in pediatric dentistry"),
                new Surgeon("Michael", "Brown", 52,
                        "Expert in orthopedic surgery"),
                new Therapist("David", "Wilson", 38,
                        "Focuses on family therapy")
        };
    }

    public void assignDoctorsToPatients() {
        for (Patient patient : patients) {
            assignDoctor(patient, doctors);
            patient.displayCard();
        }
    }

    public static void assignDoctor(Patient patient, Doctor... doctors) {
        for (Doctor doctor : doctors) {
            if (patient.getDiagnosis().toLowerCase().contains("flu") && doctor instanceof Therapist) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            } else if (patient.getDiagnosis().toLowerCase().contains("broken leg") && doctor instanceof Surgeon) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            } else if (patient.getDiagnosis().toLowerCase().contains("diabetes") && doctor instanceof Therapist) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            } else if (patient.getDiagnosis().toLowerCase().contains("headache") && doctor instanceof Therapist) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            } else if (patient.getDiagnosis().toLowerCase().contains("high blood pressure")
                    && doctor instanceof Therapist) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            } else if (patient.getDiagnosis().toLowerCase().contains("arthritis") && doctor instanceof Therapist) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            } else if (patient.getDiagnosis().toLowerCase().contains("tooth") && doctor instanceof Dentist) {
                patient.setPersonalDoctor(doctor);
                doctor.treatPatient(patient);
                return;
            }
        }
        System.out.println("No suitable doctor found for " + patient.getFirstName() + " " + patient.getLastName() + "." );
    }
}