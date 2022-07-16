import java.io.PrintStream;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //The system should create a Hospital with a name property provided by the user.
        final int numberOfDoctors = 3;
        final int numberOfPatients = 5;
        InputValidator inputValidator = new InputValidator();

//        String prompt = "Would you like to restore person list from backup?";
//
//        String yORn="";
//        do{
//            yORn = inputValidator.validateStringInput(prompt);
//        }while(!yORn.equals("y") && !yORn.equals("n"));
//        if(yORn.equalsIgnoreCase("y"))
//        {
//            Hospital hospitalBackup = fileReader.readFromFile("HospitalBackup.json");
//        }
        System.out.println("Welcome to Hospital World!!!");
        System.out.println("----------------------------");
        String hospitalName = inputValidator.validateStringInput("Please enter Hospital name:");
        Hospital hospitalWorld = new Hospital(hospitalName);
        //The system should create 3 doctors, each with a name and specialty provided by the user.
        for(int i = 0; i< numberOfDoctors; i++)
        {
            hospitalWorld.createDoctor();
        }
        //The system should ask the user to create 5 patients and match each patient to a doctor
        for(int i = 0; i< numberOfPatients; i++)
        {
            hospitalWorld.createPatient();
        }
        //ObjectMapper ob = new ObjectMapper();
        //Allow the user to select a patient to go through a round of treatment
        //Update the patient's health index when they go through a round of treatment
        Doctor d = hospitalWorld.getSpecialityDoctor("Dermatology");
        d.treatPatient();




    }
}
