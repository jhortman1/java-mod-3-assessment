import java.util.Scanner;

public class InputValidator {
    private Scanner sc = new Scanner(System.in);
    //Call out places where user input correction is needed
    public String validateStringInput(String prompt)
    {
        System.out.print(prompt);
        String validated = sc.nextLine();
        if(validated.isBlank())
        {
            return validateStringInput(prompt);
        }
        return validated;
    }
    //Call out places where user input correction is needed
    public int validateIntInput(int upper, int lower, String prompt)
    {
        int validated = 0;
        System.out.print(prompt);
        try{
            validated = Integer.parseInt(sc.nextLine());
        }catch (Exception e)
        {
            System.out.println("Invalid Value, Please try again.");
            return validateIntInput(upper,lower, prompt);
        }
        if(validated < lower && validated > upper)
        {
            System.out.println("Please Enter Value within bounds:");
            return validateIntInput(upper,lower, prompt);
        }

        return validated;
    }
    public String[] getDoctorInfo()
    {
        String[] doctor = new String[3];
        final int upper = 4;
        final int lower = 1;
        doctor[0] = validateStringInput("Please enter Doctors Name:");
        String specialityPrompt = "Please choose from the following specialities: \n" +
                                    "Enter \n" +
                                    "(1) Dermatology \n" +
                                    "(2) Neurology \n" +
                                    "(3) Ophthalmology \n" +
                                    "(4) Pathology \n" +
                                    "->";
        int specialityNumber = validateIntInput(upper,lower,specialityPrompt);
        switch(specialityNumber)
        {
            case 1:
                doctor[1]= "Dermatology";
                doctor[2]= "5";
                break;
            case 2:
                doctor[1]= "Neurology";
                doctor[2]= "25";
                break;
            case 3:
                doctor[1]= "Ophthalmology";
                doctor[2]= "10";
                break;
            case 4:
                doctor[1]= "Pathology";
                doctor[2]= "5";
                break;
        }
        return doctor;
    }
    public String[] getPatientInfo()
    {
        String [] patientInfo = new String[2];
        final int upper = 4;
        final int lower = 1;
        patientInfo[0] = validateStringInput("Please enter patient name:");
        String prompt = "Please choose from the list of ailments below: \n" +
                        "Enter\n" +
                        "(1) Skin Issues\n" +
                        "(2) Brain Issues\n" +
                        "(3) Eyes Issues\n" +
                        "(4) Disease\n" +
                        "->";
        int ailment = validateIntInput(upper,lower,prompt);
        switch(ailment)
        {
            case 1:
                patientInfo[1]= "Skin";
                break;
            case 2:
                patientInfo[1]= "Brain";
                break;
            case 3:
                patientInfo[1]= "Eye";
                break;
            case 4:
                patientInfo[1]= "Disease";
                break;
        }


        return  patientInfo;
    }
}
