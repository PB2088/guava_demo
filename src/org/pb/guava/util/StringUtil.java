package org.pb.guava.util;

import com.google.common.base.Ascii;

public class StringUtil {
	public static String firstCharOnlyToUpper(String word) {
		return word.isEmpty()
			? word :
			new StringBuilder(word.length())
			.append(Ascii.toUpperCase(word.charAt(0)))
			.append(Ascii.toLowerCase(word.substring(1)))
			.toString();
	}
}
