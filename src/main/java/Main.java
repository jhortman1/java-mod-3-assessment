import java.io.PrintStream;

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
        for(int i = 0; i< numberOfDoctors; i++)
        {
            hospitalWorld.createDoctor();
        }
        for(int i = 0; i< numberOfPatients; i++)
        {
            hospitalWorld.createPatient();
        }
        int treatPatient = inputValidator.validateIntInput(4,0,"Choose");



    }
}
