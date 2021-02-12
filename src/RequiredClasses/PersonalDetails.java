package RequiredClasses;

abstract public class PersonalDetails extends CriminalAndBiologicalDetails {
    private String familyID,personName,personCNIC;
    private String personAddress;

    /**
     * Super Constructor for Criminal type. Extending CriminalAndBiologicalDetails.java class. Total 7 Parameters
     * @param familyID 1
     * @param personName 2
     * @param personCNIC 3
     * @param personAddress 4
     * @param personCriminalRecord 5
     * @param typeOfCrime 6
     * @param DNA 7
     */
//Constructor-------------------------------------------------------------------------------------------------------
    public PersonalDetails(String familyID, String personName, String personCNIC, String personAddress,String personCriminalRecord, String typeOfCrime, String DNA) {
        super(personCriminalRecord, typeOfCrime, DNA);
        this.familyID = familyID;
        this.personName = personName;
        this.personCNIC = personCNIC;
        this.personAddress = personAddress;
    }

    /**
     * Super Constructor for Families type.Extending CriminalAndBiologicalDetails.java class. Total 6 Parameters
     * @param familyID 1
     * @param personName 2
     * @param personCNIC 3
     * @param personAddress 4
     * @param personCriminalRecord 5
     * @param DNA 6
     */
    public PersonalDetails(String familyID, String personName, String personCNIC, String personAddress,String personCriminalRecord,  String DNA) {
        super(personCriminalRecord, DNA);
        this.familyID = familyID;
        this.personName = personName;
        this.personCNIC = personCNIC;
        this.personAddress = personAddress;
    }


    //==================================================================================================================
    public String getFamilyID() { return familyID; }
    public String getPersonName() { return personName; }
    public String getPersonCNIC() { return personCNIC; }
    public String getPersonAddress() { return personAddress; }
}
