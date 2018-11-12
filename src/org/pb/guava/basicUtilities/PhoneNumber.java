package org.pb.guava.basicUtilities;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public final class PhoneNumber {
        private final short areaCode;
        private final short prefix;
        private final short lineNumber;

        public PhoneNumber(int areaCode, int prefix, int lineNumber) {
                rangeCheck(areaCode, 999, "area code");
                rangeCheck(prefix, 999, "prefix");
                rangeCheck(lineNumber, 9999, "line number");
                this.areaCode = (short) areaCode;
                this.prefix = (short) prefix;
                this.lineNumber = (short) lineNumber;
        }

        private static void rangeCheck(int arg, int max, String name) {
                if (arg < 0 || arg > max)
                        throw new IllegalArgumentException(name + ": " + arg);
        }

        @Override
        public boolean equals(Object o) {
                if (o == this)
                        return true;
                if (!(o instanceof PhoneNumber))
                        return false;
                PhoneNumber pn = (PhoneNumber) o;
                return pn.lineNumber == lineNumber && pn.prefix == prefix
                                && pn.areaCode == areaCode;
        }

		public int compareTo(PhoneNumber that) {
			return ComparisonChain.start()
					.compare(this.areaCode, that.areaCode)
					.compare(this.prefix, that.prefix)
					.compare(this.lineNumber, that.lineNumber,Ordering.natural().nullsLast()).result();
		}

        
        @Override
        public int hashCode() {
        	return Objects.hashCode(areaCode,prefix,lineNumber);
            
        }

    //Effective Java原有的toString方法
        /*
         * @Override public String toString() { return
         * String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber); }
         */

        /**
         * 采用Guava实现的toString
         *
         */
        @SuppressWarnings("deprecation")
		@Override
        public String toString() {
                return Objects.toStringHelper(this)
                                .addValue(String.format("(%03d) %03d-%04d", areaCode, prefix,lineNumber))
                                .add("areaCode", areaCode)
                                .add("prefix", prefix)
                                .add("lineNumber", lineNumber)
                                .toString();
        }

        public static void main(String[] args) {
                Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
                m.put(new PhoneNumber(707, 867, 5309), "Jenny");

                System.out.println(m);
                
                PhoneNumber pn1 = new PhoneNumber(707, 867, 5309);
                PhoneNumber pn2 = new PhoneNumber(707, 867, 5309);
                System.out.println(pn1.compareTo(pn2));
                System.out.println(pn1.hashCode());//1218060
        }
}