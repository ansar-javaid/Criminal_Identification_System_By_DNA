package RequiredClasses;

import java.util.List;

public class Criminals extends PersonalDetails   {
    public List<Criminals> criminalsList;
    /**
     * @param familyID
     * @param personName
     * @param personCNIC
     * @param personAddress
     * @param personCriminalRecord
     * @param typeOfCrime
     * @param DNA
     */
    //Constructor-------------------------------------------------------------------------------------------------------
    public Criminals(String familyID, String personName, String personCNIC, String personAddress,String personCriminalRecord, String typeOfCrime, String DNA ) {
        super(familyID, personName, personCNIC, personAddress,personCriminalRecord, typeOfCrime, DNA);
    }

    //==================================================================================================================
}
