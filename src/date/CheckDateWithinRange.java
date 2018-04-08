package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckDateWithinRange {
	
	public static void main(String[] args) {
		//stem.out.println(isThisDateWithin3MonthsRange("31/01/2018", "dd/MM/yyyy"));
		
		System.out.println(isThisDateBefore6monthsOfCurrentDate("2017-10-04T10:50:54", "yyyy-MM-dd'T'HH:mm:ss"));

	}

	private static boolean isThisDateBefore6monthsOfCurrentDate(String dateToValidate,
			String dateFormat) {
		SimpleDateFormat sdf =  new SimpleDateFormat( dateFormat);
		sdf.setLenient(false);
		
		try{
			
			Date date = sdf.parse(dateToValidate);
			Calendar currentDateBefore6Months =  Calendar.getInstance();
			currentDateBefore6Months.add(Calendar.MONTH, -6 );
			
			System.out.println("\n\ncurrentDate : "
					+ Calendar.getInstance().getTime());
			System.out.println("currentDateBefore3Months : "
					+ currentDateBefore6Months.getTime());
			System.out.println("dateToValidate : " + dateToValidate);
			
			if ( date.after(currentDateBefore6Months.getTime())) 
				return true;
			return false;
			
		}catch(ParseException e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	public static boolean isThisDateWithin3MonthsRange(String dateToValidate,
			String dateFromat) {

		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false); // https://dzone.com/articles/techtip-use-setlenient-method
		try {

			// if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);

			// current date after 3 months
			Calendar currentDateAfter3Months = Calendar.getInstance();
			currentDateAfter3Months.add(Calendar.MONTH, 3);

			// current date before 3 months
			Calendar currentDateBefore3Months = Calendar.getInstance();
			currentDateBefore3Months.add(Calendar.MONTH, -3);

			/*************** verbose ***********************/
			System.out.println("\n\ncurrentDate : "
					+ Calendar.getInstance().getTime());
			System.out.println("currentDateAfter3Months : "
					+ currentDateAfter3Months.getTime());
			System.out.println("currentDateBefore3Months : "
					+ currentDateBefore3Months.getTime());
			System.out.println("dateToValidate : " + dateToValidate);
			/************************************************/

			if (date.before(currentDateAfter3Months.getTime())
					&& date.after(currentDateBefore3Months.getTime())) {

				// ok everything is fine, date in range
				return true;

			} else {

				return false;

			}

		} catch (ParseException e) {

			e.printStackTrace();
			return false;
		}

	}

}
