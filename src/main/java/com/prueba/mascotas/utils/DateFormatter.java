package com.prueba.mascotas.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	
	private static String pattern = "dd-MM-yyyy";
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	public static Date addDate(String date) throws ParseException {
		Date dateFormatted = simpleDateFormat.parse(date);
		return dateFormatted;
	}

}
