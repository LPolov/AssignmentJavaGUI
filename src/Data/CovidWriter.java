package Data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Business.CovidCase;

public class CovidWriter {
	public void writeCovidData(CovidCase c) {
		
		File file = new File("src/covidData.txt");
		
		try(FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			bw.write(c.getDate() + " " + c.getCity() + " " + c.getCases() + " " + c.getDeaths() + " " 
			+ c.getRecoveries() + "\n");
			
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
