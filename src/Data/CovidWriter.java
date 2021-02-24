package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Business.CovidCase;

public class CovidWriter {
	
	boolean isCaseFound = false;
	List<String> lines = new ArrayList<>();
	String row = "";
	File file = new File("src/covidData.txt");
	String[] dateAndCity;
	
	public void writeCovidData(CovidCase c) {
		
		
		try(FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			bw.write(c.getDate() + " " + c.getCity() + " " + c.getCases() + " " + c.getDeaths() + " " 
			+ c.getRecoveries() + "\n");
			
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	//Checks is this case is already stored in a file.
	public boolean isCaseAlreadyStored(CovidCase c) {
		
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)) {
				
				
				while((row = br.readLine()) != null)
				{
					dateAndCity = CovidUpdater.getDataFromRow(row);
					
					if (c.getDate().equals(dateAndCity[0]) && c.getCity().equals(dateAndCity[1])) 
					{
						return true;
					}
				}
				return false;
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		return false;
	}
}
