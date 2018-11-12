package org.pb.guava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;

import static org.pb.guava.util.PrintUtil.*;

@SuppressWarnings("unused")
public class BiMapDemo {
	public static void main(String[] args) {
		BiMap<String, String> biMap = HashBiMap.create();
		biMap.put("Fruits", "Bannana");  
		biMap.put("Fruits", "Apple");  
		biMap.put("Fruits", "Pear");
		biMap.put("Vegetables", "Carrot");
		biMap.put("Vegetables", "Potato");
		biMap.put("Vegetables", "Pumpkin");
		
		println(biMap);
		println(biMap.inverse());
		println(biMap.values());
	}
}
