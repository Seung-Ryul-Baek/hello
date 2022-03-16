package com.okdevtv.tdd.hello;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {
	public static String comma(long input) {
		return NumberFormat.getNumberInstance(Locale.US).format(input);
		
	}	
}
