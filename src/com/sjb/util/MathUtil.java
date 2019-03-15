package com.sjb.util;

import java.text.DecimalFormat;

public class MathUtil {

	public static String format1(Double f, int numSize, int size) {
		DecimalFormat df = null;
		String str = ".";
		for (int i = 0; i < size; i++) {
			str += "0";
		}
		for (int i = 0; i < numSize; i++) {
			str = "0" + str;
		}
		if (numSize == 0 || size == 0) {
			str = str.replace(".", "");
		}
		df = new DecimalFormat(str);
        return df.format(f);
	}
	
	
	public static String calNext(Double result, int numSize, int size, int length) {
		Double add = length + -5 + Math.random()*10;
		return format1(result - add, numSize, size);
	}
}
