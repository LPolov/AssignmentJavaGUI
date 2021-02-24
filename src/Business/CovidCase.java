package Business;

import java.util.Date;
import java.util.HashSet;

public class CovidCase {
	private String date;
	private String city;
	private int cases;
	private int deaths;
	private int recoveries;
	
	
	public CovidCase(String date, String city, int cases, int deaths, int recoveries) {
		this.date = date;
		this.city = city;
		this.cases = cases;
		this.deaths = deaths;
		this.recoveries = recoveries;
	}
	public boolean checkDate() {
		
		if (date.equals("") || date == null) 
		{
			return false;
		}
		
		if (date.charAt(2) != '/' || date.charAt(5) != '/' || date.length() != 10) 
		{
			return false;
		}
		
		if (!this.isValidNumeric(date)) 
		{
			return false;
		}

		return true;
	}
	
	private boolean isValidNumeric(String date) {
		String month = date.substring(0, 2);
		String day = date.substring(3, 5);
		String year = date.substring(6, date.length());
		String[] wholeDate = {day, month, year};
		
		//Checking if date contains digits only
		for (String str : wholeDate) {
			for (int i = 0; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) 
				{
					return false;
				}
			}
		}
		
		//Checking if month is correct
		if (Integer.parseInt(month) > 12 || Integer.parseInt(month) < 1) {
			return false;
		} 
		else 
		{
			//Checking if day of a month is correct
			if (!this.isValidDay(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year))) 
			{
				return false;
			}
		}
		
		//Checking if year is correct
		if (Integer.parseInt(year) < 0 || Integer.parseInt(year) > 2021) {
			return false;
		}
		return true;
	}
	
	//Checking if day of a month is correct
	public boolean isValidDay(Integer day, Integer month, Integer year) {
		
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) &&
				(day > 31 || day < 1)) 
		{
			return false;
		} 
		else if (month == 2 && this.isLeapYear(year) && (day > 29 || day < 1))
		{
			return false;
		} 
		else if (month == 2 && !this.isLeapYear(year) && (day > 28 || day < 1)) {
			return false;
		}
		else
		{
			if (day > 30 || day < 1) 
			{
				return false;
			}
			else 
			{
				return true;
			} 
		}
	}
	
	//Checking if year is leap
	public boolean isLeapYear(Integer year) {
		if (year % 4 == 0) 
		{
			if (year % 100 == 0) 
			{
				if (year % 400 == 0) 
				{
					return true;
				} 
				else 
				{
					return false;
				}
			}
			else 
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String str = "11/01/12";
		
	}
}
