package FileLoader;

import RequiredClasses.Criminals;
import RequiredClasses.Families;
import RequiredClasses.UserLogins;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadData {
    public List<Families> familiesList=new ArrayList<>();//List for family data store
    public List<Criminals> criminalsList=new ArrayList<>();//List for criminal data store
    public List<UserLogins> userLoginsList=new ArrayList<>();//List for Username And Passwards

    public LoadData(){
        try {
            LoadFamilyData();
        }
        catch (IOException ignored){}
        try {
            LoadCriminalData();
        }
        catch (IOException ignored){}
        try {
            LoadUsernameAndPasswords();
        }
        catch (IOException ignored){}
    }
    //========================================================================================================================================================
    private void LoadFamilyData() throws IOException {
        FileReader readFamily = new FileReader("Datasets\\Families Dataset.csv");
        BufferedReader bufferedFamily = new BufferedReader(readFamily);
        String line = "";
        while ((line=bufferedFamily.readLine())!=null)
        {
            String[] separationCSV=line.split(",");
            familiesList.add(new Families(separationCSV[0],separationCSV[1],separationCSV[2],separationCSV[3],separationCSV[4],separationCSV[5]));
        }
        readFamily.close();
    }
    //=========================================================================================================================================================
    private void LoadCriminalData() throws IOException {
        FileReader readCriminal = new FileReader("Datasets\\Criminal Dataset.csv");
        BufferedReader bufferedCriminal = new BufferedReader(readCriminal);
        String line = "";
        while ((line=bufferedCriminal.readLine())!=null)
        {
            String[] separation=line.split(",");
            criminalsList.add(new Criminals(separation[0],separation[1],separation[2],separation[3],separation[4],separation[5],separation[6]));
        }
        readCriminal.close();
    }
    //==================================================================================================================
    public void LoadUsernameAndPasswords() throws IOException {
        FileReader readUsernameAndPassword = new FileReader("Datasets\\UserLogins.csv");
        BufferedReader bufferedpassword =new BufferedReader(readUsernameAndPassword);
        String line = "";

        while ((line=bufferedpassword.readLine())!=null)
        {
            String[] separation=line.split(",");
            userLoginsList.add(new UserLogins(separation[0],separation[1]));
        }
        readUsernameAndPassword.close();
    }
}
