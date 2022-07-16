public class Ailment {
    private int startingHealthIndex;
    private String name;
    private String associatedSpeciality;

    public Ailment(int startingHealthIndex, String name, String associatedSpecality) {
        this.startingHealthIndex = startingHealthIndex;
        this.name = name;
        this.associatedSpeciality = associatedSpecality;
    }
    public int getStartingHealthIndex() {
        return startingHealthIndex;
    }

    public String getName() {
        return name;
    }

    public String getAssociatedSpeciality() {
        return associatedSpeciality;
    }

}
