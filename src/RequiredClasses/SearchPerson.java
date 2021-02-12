package RequiredClasses;

import FileLoader.LoadData;

public class SearchPerson {
    private LoadData dataset=new LoadData();
    public Families familiesMap;
    public Families familiesIDMap;
    /**
     * @param dnaData this will take DNA from user and then search it into familiesList and if the person
     *                is found it will also search and show his/her family members that are registered in record
     */
    public Families suspectSearchDNA(String dnaData)
    {
        String familyID="";
        boolean flag=false;
        /*this first for loop search person by taking DNA and if person is found then records its familyID to map Family Members*/
        for (int count = 0; count < dataset.familiesList.size(); count++){
            if(dnaData.hashCode()==dataset.familiesList.get(count).getDNA().hashCode())
            {
                System.out.println(dataset.familiesList.get(count).getFamilyID()+" "+dataset.familiesList.get(count).getPersonName()+" "+
                        dataset.familiesList.get(count).getPersonCNIC()+" "+ dataset.familiesList.get(count).getPersonAddress()+" "+
                        dataset.familiesList.get(count).getPersonCriminalRecord());
                familyID=dataset.familiesList.get(count).getFamilyID();
                flag=true;
                familiesMap=dataset.familiesList.get(count);
                return dataset.familiesList.get(count);
            }
            else if(!flag && count==dataset.familiesList.size()-1)
            {

               return null;
            }
        }

        return null;
    }//-----------------------------------------------------------------------------------------------------------------

    /**
     * @param cNIC this will take CNIC "format(0123400000001) without dashes" then search the person in existing Database
     */
    public String searchCNIC(String cNIC)
    {
        String data="";
        for(int count=0; count<dataset.familiesList.size();count++){
            if(cNIC.hashCode()==dataset.familiesList.get(count).getPersonCNIC().hashCode()){
                return data=dataset.familiesList.get(count).getPersonCNIC()
                        +",\t"+dataset.familiesList.get(count).getFamilyID()
                        +",\t"+dataset.familiesList.get(count).getPersonAddress()
                        +",\t"+dataset.familiesList.get(count).getPersonName()
                        +",\t"+dataset.familiesList.get(count).getPersonCriminalRecord();
            }
        }
        return null;
    }//-----------------------------------------------------------------------------------------------------------------

    /**
     * @param crimeType this will take crime type and will search it into existing data base
     */
    public void searchSuspectCrimeType(String crimeType) {
        for (int count = 0; count < dataset.criminalsList.size(); count++) {
            if (crimeType.equalsIgnoreCase(dataset.criminalsList.get(count).getTypeOfCrime())) {
                System.out.println(dataset.criminalsList.get(count).getFamilyID()
                +" "+ dataset.criminalsList.get(count).getPersonName()
                +" "+ dataset.criminalsList.get(count).getPersonCNIC()
                +" "+ dataset.criminalsList.get(count).getPersonAddress()
                +" "+ dataset.criminalsList.get(count).getPersonCriminalRecord());
            }
        }
    }//-----------------------------------------------------------------------------------------------------------------
    public boolean searchLogin(String userName,String userPassword)
    {
        for (int count = 0; count < dataset.userLoginsList.size(); count++) {
            if(userName.hashCode()==dataset.userLoginsList.get(count).getUsername().hashCode()
               && userPassword.hashCode()==dataset.userLoginsList.get(count).getPassward().hashCode())
            {
                System.out.println(dataset.userLoginsList.get(count).getUsername());
                return true;
            }
        }
        return false;
    }
    //-----------------------------------------------------------------------------------------------------------------
    public void searchFamilyID(String familyID)
    {
        for (int count = 0; count < dataset.familiesList.size(); count++){
            if(familyID.hashCode()==dataset.familiesList.get(count).getFamilyID().hashCode())
            {
                System.out.println(dataset.familiesList.get(count).getFamilyID()+" "+dataset.familiesList.get(count).getPersonName()+" "+
                        dataset.familiesList.get(count).getPersonCNIC()+" "+ dataset.familiesList.get(count).getPersonAddress()+" "+
                        dataset.familiesList.get(count).getPersonCriminalRecord());
                familiesIDMap=dataset.familiesList.get(count);
            }
        }
    }
    //-----------------------------------------------------------------------------------------------------------------

}
