package org.pb.guava.strings;

import static org.pb.guava.util.PrintUtil.*;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;

public class CharMatcherDemo {
	public static void main(String[] args) {
		//inRange('\u0000', '\u001f')
		String str = "AAA  success    is 11 getting  what you want happiness    22 is wanting 334 what you get4 \u001f  BBB";
		
		println("---------ԭʼ�ַ���------------");
		println(str);
		
		//�Ƴ�control�ַ�
		println("---------�Ƴ�control�ַ�------------");
		String noControl = CharMatcher.JAVA_ISO_CONTROL.removeFrom(str);
		println(noControl);
				
		//ֻ���������ַ�
		println("---------ֻ���������ַ�------------");
		String theDigits = CharMatcher.DIGIT.retainFrom(str);
		println(theDigits);
		
		//ȥ�����˵Ŀո񣬲����м�������ո��滻�ɵ����ո�
		println("---------ȥ�����˵Ŀո񣬲����м�������ո��滻�ɵ����ո�------------");
		String spaced = CharMatcher.WHITESPACE.trimAndCollapseFrom(str, ' ');
		println(spaced);
		
		//��*���滻���������ַ�
		println("---------��*���滻���������ַ�------------");
		String noDigits = CharMatcher.JAVA_DIGIT.replaceFrom(str, "*");
		println(noDigits);
		
		//ֻ�������ֺ�Сд��ĸ
		println("---------ֻ�������ֺ�Сд��ĸ------------");
		String lowerAndDigit = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(str);
		println(lowerAndDigit);
		
		println(str.getBytes(Charsets.UTF_8));
	}
}
