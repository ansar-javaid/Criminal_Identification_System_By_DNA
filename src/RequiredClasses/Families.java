package RequiredClasses;

import java.util.List;

public class Families extends PersonalDetails {
    /**
     * @param familyID
     * @param personName
     * @param personCNIC
     * @param personAddress
     * @param personCriminalRecord
     * @param DNA
     */
    //Constructor-------------------------------------------------------------------------------------------------------
    public Families(String familyID, String personName, String personCNIC, String personAddress, String personCriminalRecord,String DNA) {
        super(familyID, personName, personCNIC, personAddress, personCriminalRecord,DNA);
    }


    //==================================================================================================================

}
