package RequiredClasses;

abstract public class CriminalAndBiologicalDetails {
    private String personCriminalRecord,typeOfCrime,DNA;
    //Constructors------------------------------------------------------------------------------------------------------
    /**
     * Super Constructor for Criminal type. Total 3 Parameters
     * @param personCriminalRecord 1
     * @param typeOfCrime 2
     * @param DNA 3
     */
    public CriminalAndBiologicalDetails(String personCriminalRecord, String typeOfCrime, String DNA) {
        this.personCriminalRecord = personCriminalRecord;
        this.typeOfCrime = typeOfCrime;
        this.DNA = DNA;
    }

    /**
     * Super Constructor for Families type. Total 2 Parameters
     * @param personCriminalRecord
     * @param DNA
     */
    public CriminalAndBiologicalDetails(String personCriminalRecord, String DNA) {
        this.personCriminalRecord = personCriminalRecord;
        this.DNA = DNA;
    }

    //==================================================================================================================
    public String getPersonCriminalRecord() { return personCriminalRecord; }
    public String getTypeOfCrime() { return typeOfCrime; }
    public String getDNA() { return DNA; }
}
