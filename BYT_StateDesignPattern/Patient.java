package BYT_StateDesignPattern;

public class Patient implements PatientState{
    public PatientState patientState;

    public PatientState getPatientState(){
        return patientState;
    }

    public void setPatientState(PatientState patientState){
        this.patientState = patientState;
    }

    @Override
    public void changeState(){
        System.out.println("Current state of patient: " + patientState.getClass().getName() );
        patientState.changeState();
    }
}
