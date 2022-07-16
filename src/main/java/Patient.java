public class Patient {
    private String name;
    private int healthIndex;
    private Ailment myDisease;
    final int  FULL_HEALTH = 100;

    public Patient(String name, Ailment myDisease) {
        this.name = name;
        this.healthIndex = myDisease.getStartingHealthIndex();
        this.myDisease = myDisease;
    }
    public Ailment getMyDisease() {
        return myDisease;
    }

    public void setMyDisease(Ailment myDisease) {
        this.myDisease = myDisease;
    }
//Update the patient's health index when they go through a round of treatment
    public void receiveTreatment(int healed)
    {
        int newHealthIndex = getHealthIndex()+healed;
        setHealthIndex(newHealthIndex);
    }
    //Each patient has a health index that indicates how close to full healthy they are
    public int getHealthIndex() {
        return healthIndex;
    }

    private void setHealthIndex(int healthIndex) {
        this.healthIndex = healthIndex;
    }

    public boolean healed()
    {
        return getHealthIndex() >= FULL_HEALTH;
    }
}
