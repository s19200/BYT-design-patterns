package BYT_StateDesignPattern;

public class CurrentPatient implements PatientState {
    @Override
    public void changeState(){
        System.out.println("Current patient");
    }
}
