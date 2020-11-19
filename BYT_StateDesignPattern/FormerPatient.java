package BYT_StateDesignPattern;

public class FormerPatient implements PatientState{
    @Override
    public void changeState(){
        System.out.println("Former patient");
    }
}
