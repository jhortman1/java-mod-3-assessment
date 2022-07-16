import java.util.*;

public class Hospital {

    private String hospitalName;
    private Map<String, List<Doctor>> specialityDoctors = new HashMap<String, List<Doctor>>();
    private InputValidator inputValidator = new InputValidator();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public String getHospitalName() {
        return hospitalName;
    }
    public void createPatient()
    {
        String[] patientInfo = inputValidator.getPatientInfo();
        String name = patientInfo[0];
        String ailment = patientInfo[1];
        Patient patient = null;
        if(ailment.equals("Skin")) {
            Ailment skin = new Ailment(80,"Skin","Dermatology");
            patient = new Patient(name,skin);
        }
        if(ailment.equals("Brain")){
            Ailment brain = new Ailment(50,"Brain","Neurology");
            patient = new Patient(name,brain);
        }
        if(ailment.equals("Eye")){
            Ailment eye = new Ailment(90,"Eye","Ophthalmology");
            patient = new Patient(name,eye);
        }
        if(ailment.equals("Disease")){
            Ailment disease = new Ailment(60,"Disease","Pathology");
            patient = new Patient(name,disease);
        }
        Doctor d = getSpecialityDoctor(patient.getMyDisease().getAssociatedSpeciality());
        if(d == null){
            System.out.println("Sorry we dont have a doctor to treat you at the moment.");
        }
        else {
            assignPatientToSpecialist(patient,getSpecialityDoctor(patient.getMyDisease().getAssociatedSpeciality()));
        }
    }
    public Doctor getSpecialityDoctor(String speciality)
    {
        Doctor d = null;
        List<Doctor> list = null;
        if(specialityDoctors.containsKey(speciality))
        {
            list = specialityDoctors.get(speciality);
            for (Doctor doctor: list) {
                if(doctor.getPatientListSize()==0)
                {
                    return doctor;
                }
            }
        }
        else{
            return null;
        }
        return list.get(0);
    }

    public void createDoctor ()
    {
        String[] doctorInfo = inputValidator.getDoctorInfo();
        String name = doctorInfo[0];
        String speciality = doctorInfo[1];
        int healingPower = Integer.parseInt(doctorInfo[2]);

        Doctor doctor = new Doctor(name,speciality,healingPower);
        assignDoctorToSpeciality(doctor,doctor.getMySpeciality());

    }
    public void assignDoctorToSpeciality(Doctor doctor, String speciality)
    {
        if(!specialityDoctors.containsKey(speciality))
        {
            specialityDoctors.put(speciality, new ArrayList<Doctor>());
        }
        specialityDoctors.get(speciality).add(doctor);
    }
    public void assignPatientToSpecialist(Patient patient, Doctor doctor)
    {
        doctor.addParentToList(patient);
    }
}
