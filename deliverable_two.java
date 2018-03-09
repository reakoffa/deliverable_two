package deliverable_two;

import java.util.Calendar; 
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class deliverable_two {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

		System.out.println("Enter a Date:");
		String string1 = scnr.next();
		
		
		System.out.println("Enter another Date:");
		String string2 = scnr.next();
		
		try {

            Date date1 = dateFormat.parse(string1);
            Date date2 = dateFormat.parse(string2);
            
            long diff = date1.getTime() - date2.getTime();
            
          Calendar c = Calendar.getInstance(); 
          
          c.setTimeInMillis(Math.abs(diff)); 
          
          int mYear = c.get(Calendar.YEAR) - 1970;
          int mMonth = c.get(Calendar.MONTH); 
          int mDay = c.get(Calendar.DAY_OF_MONTH) - 1;
          
          System.out.println("The difference is " + mYear + " years, " + mMonth + " months, and " + mDay + " days.");
          
        } catch (ParseException e) {
            e.printStackTrace();
        }
		

	}

}
