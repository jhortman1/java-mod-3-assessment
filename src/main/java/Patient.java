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

    public void receiveTreatment(int healed)
    {
        int newHealthIndex = getHealthIndex()+healed;
        setHealthIndex(newHealthIndex);
    }
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
