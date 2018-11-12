package org.pb.guava.strings;

import com.google.common.base.CaseFormat;
import static org.pb.guava.util.PrintUtil.*;

public class CaseFormatDemo {
	public static void main(String[] args) {
		/**
			 	???						????
			LOWER_CAMEL				lowerCamel
			LOWER_HYPHEN			lower-hyphen
			LOWER_UNDERSCORE		lower_underscore
			UPPER_CAMEL				UpperCamel
			UPPER_UNDERSCORE		UPPER_UNDERSCORE
		 */
		println("------------LOWER_CAMEL to LOWER_HYPHEN----------------");
		println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "constantName"));
		println("------------LOWER_CAMEL to LOWER_UNDERSCORE----------------");
		println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "constantName"));
		println("------------LOWER_CAMEL to UPPER_CAMEL----------------");
		println(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, "constantName"));
		println("------------LOWER_CAMEL to UPPER_UNDERSCORE----------------");
		println(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, "constantName"));
		
		println("====================");
		println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "emp_no"));
		
		println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "ename"));
	}

}
