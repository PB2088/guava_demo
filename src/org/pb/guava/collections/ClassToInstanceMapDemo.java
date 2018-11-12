package org.pb.guava.collections;

import java.math.BigDecimal;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

import static org.pb.guava.util.PrintUtil.*;

public class ClassToInstanceMapDemo {
	public static void main(String[] args) {
		ClassToInstanceMap<Number> numberDefault = MutableClassToInstanceMap.create();
		numberDefault.put(Integer.TYPE, Integer.valueOf(0));
		numberDefault.put(Long.TYPE, Long.valueOf(22));
		numberDefault.put(Float.TYPE, Float.valueOf(22.3f));
		numberDefault.put(BigDecimal.class, BigDecimal.TEN);
		numberDefault.put(Double.TYPE, Double.valueOf(33.6));
		
		
		println(numberDefault);
		println("-------------------");
		println(numberDefault.keySet());
		BigDecimal instance = numberDefault.getInstance(BigDecimal.class);
		println(instance);
	}

}
