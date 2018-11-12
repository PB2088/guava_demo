package org.pb.guava.strings;

import static org.pb.guava.util.PrintUtil.*;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;

public class CharMatcherDemo {
	public static void main(String[] args) {
		//inRange('\u0000', '\u001f')
		String str = "AAA  success    is 11 getting  what you want happiness    22 is wanting 334 what you get4 \u001f  BBB";
		
		println("---------原始字符串------------");
		println(str);
		
		//移除control字符
		println("---------移除control字符------------");
		String noControl = CharMatcher.JAVA_ISO_CONTROL.removeFrom(str);
		println(noControl);
				
		//只保留数字字符
		println("---------只保留数字字符------------");
		String theDigits = CharMatcher.DIGIT.retainFrom(str);
		println(theDigits);
		
		//去除两端的空格，并把中间的连续空格替换成单个空格
		println("---------去除两端的空格，并把中间的连续空格替换成单个空格------------");
		String spaced = CharMatcher.WHITESPACE.trimAndCollapseFrom(str, ' ');
		println(spaced);
		
		//用*号替换所有数字字符
		println("---------用*号替换所有数字字符------------");
		String noDigits = CharMatcher.JAVA_DIGIT.replaceFrom(str, "*");
		println(noDigits);
		
		//只保留数字和小写字母
		println("---------只保留数字和小写字母------------");
		String lowerAndDigit = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(str);
		println(lowerAndDigit);
		
		println(str.getBytes(Charsets.UTF_8));
	}
}
