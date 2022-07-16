import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;

    private List<Patient> patientList = new ArrayList<>();
    private String mySpeciality;
    private int healingPower;

    public Doctor(String name, String mySpeciality, int healingPower) {
        this.name = name;
        this.mySpeciality = mySpeciality;
        this.healingPower = healingPower;
    }
    private int getHealingPower()
    {
        return this.healingPower;
    }
    public void treatPatient(Patient patient)
    {
        if(patientList.contains(patient))
        {
            patient.receiveTreatment(getHealingPower());
        }
        else {
            System.out.println("Sorry that is not one of my patients");
        }

    }
    public void removePatient(Patient patient)
    {
        if(patientList.contains(patient))
        {
            patientList.remove(patient);
        }
    }
    public void addParentToList(Patient patient)
    {
        patientList.add(patient);
    }
    public String getMySpeciality() {
        return mySpeciality;
    }
    public List<Patient> getPatientList() {
        return patientList;
    }
    public int getPatientListSize()
    {
        return patientList.size();
    }
}
