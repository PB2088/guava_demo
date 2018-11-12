package org.pb.guava.basicUtilities;

import static org.pb.guava.util.PrintUtil.println;

import com.google.common.base.Objects;

@SuppressWarnings("unused")
public class ObjectMethodDemo {
	public static void main(String[] args) {
		
		//注意：JDK7引入的Objects类提供了一样的方法Objects.equals
		println("-------------equal------------");
		println(Objects.equal("a", "a")); 				// returns true
		println(Objects.equal(null, "a")); 				// returns false
		println(Objects.equal("a", null)); 				// returns false
		println(Objects.equal(null, null)); 			// returns true
		println(Objects.equal(new String("a"), "a")); 	// returns true
		println(Objects.equal("a", new String("a")));	// returns true
		println("-------------equal end------------");
		
		println("-------------hashCode------------");
		//hashCode 底层调用了Arrays中的hashCode进行计算hashCode值
		//注意：JDK7引入的Objects类提供了一样的方法Objects.hash(Object...)
		println(Objects.hashCode("akdjfk"));
		println("-------------hashCode end------------");
		
		println("-------------toString------------");
		println("详见PhoneNumber.java");
		println("-------------toString end------------");
		
		
	}
}
