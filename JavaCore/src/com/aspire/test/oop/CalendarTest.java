package com.aspire.test.oop;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 日历
 * @author limeng_a
 *
 */

public class CalendarTest {

	public static void main(String[] args) {
		
		GregorianCalendar d= new GregorianCalendar();
		int today=d.get(Calendar.DAY_OF_MONTH);
		int month=d.get(Calendar.MONTH);
		
		

	}

}
