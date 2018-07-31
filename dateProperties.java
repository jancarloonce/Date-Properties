import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dayProperties {

	  public static void main(String[] args) throws ParseException {
	    
		System.out.println("Input date(Must be in this format: \"MM/DD/YYYY hh:mm:ss\"): ");
		System.out.println("Sample Input: 01/20/1996 12:23:16.25");
		System.out.print("Enter Date: ");
		Scanner scnr = new Scanner(System.in);
		boolean isValid = false;
		String userDate;
		
		while (isValid == false) {
			try {
			userDate = scnr.nextLine();
			showProperties(parser(userDate));
			isValid = true;
			}
			catch (Exception e){
			System.out.println("Must be a valid date and format!");
			System.out.print("Enter Date: ");
			userDate = scnr.nextLine();
			}
			
		}

		
		scnr.close();
		
	  }
	  
	  public static Calendar parser(String string) throws ParseException {
		  	SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy hh:mm:ss.SSS");
			Date date1 = formatter.parse(string);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date1);
			
			return cal;
	  }
	  
	  
	  public static void showProperties(Calendar cal) {
		    int day = cal.get(Calendar.DATE);
		    int month = cal.get(Calendar.MONTH) + 1;
		    int year = cal.get(Calendar.YEAR);
		    int minute = cal.get(Calendar.MINUTE);
		    int second = cal.get(Calendar.SECOND);
		    int millis = cal.get(Calendar.MILLISECOND);

		    System.out.println("Year: " + year);
		    System.out.println("Month: " + month);
		    System.out.println("Day: " + day);
		    System.out.println("Minutes: " + minute);
		    System.out.println("Seconds: " + second);
		    System.out.println("Miliseconds: " + millis);
	  }
	
}