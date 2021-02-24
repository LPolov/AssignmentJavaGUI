package Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CovidUpdater {
	
	String row = "";
	private static final String FILE_PATH = "src/covidData.txt";
	List<String> lines = new ArrayList<>();
	String[] extractedCityAndDate;
	
	public void extractData(String date, String city, int cases, int deaths, int recoveries) {
		
		try (FileReader fr = new FileReader(FILE_PATH);
			 BufferedReader br = new BufferedReader(fr)) {
			
			while((row = br.readLine()) != null) {
				extractedCityAndDate = getDataFromRow(row);
				
				lines.add(row);
			}
			
		} catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
//		Scanner scanner = new Scanner(FILE_PATH);
//		String[] rowFromFile;
//		
//		while (scanner.hasNext()) {
//			row = scanner.nextLine();
//			rowFromFile = getDataFromRow(row);
//			
//			if (rowFromFile[0].equals(date) && rowFromFile[1].equals(city)) 
//			{
//				
//			}
//		}
	}
	
	public static String[] getDataFromRow(String row) {
		String[] data = {"", "", "", "", ""};
		int index = 0;
		
		for (char c : row.toCharArray()) {
			if (c != ' ')
			{
				data[index] += c;
			}
			else
			{
				index++;
			}
		}
		return data;
	}
}
