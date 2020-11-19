package BYT_StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        PatientState currentPatient = new CurrentPatient();
        PatientState formerPatient = new FormerPatient();
         patient.setPatientState(currentPatient);
         patient.changeState();

         patient.setPatientState(formerPatient);
         patient.changeState();
    }
}
