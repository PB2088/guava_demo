package org.pb.guava.basicUtilities;

import static org.pb.guava.util.PrintUtil.println;

import com.google.common.base.Objects;

@SuppressWarnings("unused")
public class ObjectMethodDemo {
	public static void main(String[] args) {
		
		//ע�⣺JDK7�����Objects���ṩ��һ���ķ���Objects.equals
		println("-------------equal------------");
		println(Objects.equal("a", "a")); 				// returns true
		println(Objects.equal(null, "a")); 				// returns false
		println(Objects.equal("a", null)); 				// returns false
		println(Objects.equal(null, null)); 			// returns true
		println(Objects.equal(new String("a"), "a")); 	// returns true
		println(Objects.equal("a", new String("a")));	// returns true
		println("-------------equal end------------");
		
		println("-------------hashCode------------");
		//hashCode �ײ������Arrays�е�hashCode���м���hashCodeֵ
		//ע�⣺JDK7�����Objects���ṩ��һ���ķ���Objects.hash(Object...)
		println(Objects.hashCode("akdjfk"));
		println("-------------hashCode end------------");
		
		println("-------------toString------------");
		println("���PhoneNumber.java");
		println("-------------toString end------------");
		
		
	}
}
