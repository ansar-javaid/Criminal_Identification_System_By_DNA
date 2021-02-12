package FileLoader;

import java.io.*;

public class SearchFile {
    private LoadData dataset=new LoadData();

    public void searchBiologicalDNA(String dnaSequence) throws IOException {
        PrintWriter clearContents=new  PrintWriter("Datasets\\SearchResltstemp.csv");
        clearContents.print("");
        clearContents.close();
        FileWriter fileWriter=new FileWriter("Datasets\\SearchResltstemp.csv",true);
        for (int count = 0; count < dataset.familiesList.size(); count++) {
            int map=0;
            for (int countDNA = 1; countDNA < dnaSequence.length(); countDNA++) {
                String dn=dataset.familiesList.get(count).getDNA();

                    if (dnaSequence.charAt(countDNA) == dn.charAt(countDNA)) {
                        map++;
                    }
            }
            float Total = dnaSequence.length();
            float percent = (map / Total) * 100;
            String formatedPercent=String.format("%.0f",percent);
            String searchResults=dataset.familiesList.get(count).getPersonName()+","+dataset.familiesList.get(count).getPersonCNIC()+","+formatedPercent+"\n";
            //System.out.println(searchResults);
            fileWriter.write(searchResults);
        }
        fileWriter.close();
    }

    public String searchFamilyBYDNA() throws IOException {
        FileReader fileReader=new FileReader("Datasets\\SearchResltstemp.csv");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line = "";
        StringBuilder familyRecord= new StringBuilder();
        while ((line=bufferedReader.readLine())!=null)
        {
            String[] separation=line.split(",");
            int high= Integer.parseInt(separation[2]);
            if(high>50)
            {
                familyRecord.append(separation[0]).append(",\t\t").append(separation[1]).append(",\t\t").append(high).append("%\n");
            }

        }
        fileReader.close();
        return familyRecord.toString();
    }
}
