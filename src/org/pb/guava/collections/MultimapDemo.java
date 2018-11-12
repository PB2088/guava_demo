package org.pb.guava.collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;

import static org.pb.guava.util.PrintUtil.*;

@SuppressWarnings("unused")
public class MultimapDemo {
	public static void main(String[] args) {
		//HashMultimap<String, String> multimap = HashMultimap.create();
		//ArrayListMultimap<String, String> multimap = ArrayListMultimap.create();
		//LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
		LinkedListMultimap<String, String> multimap = LinkedListMultimap.create();
		
		multimap.put("Fruits", "Bannana");  
		multimap.put("Fruits", "Apple");  
		multimap.put("Fruits", "Pear");  
		multimap.put("Vegetables", "Carrot");
		multimap.put("Vegetables", "Potato");
		multimap.put("Vegetables", "Pumpkin");
		
		println(multimap);
		
		//用Multiset表示Multimap中的所有键
		println(multimap.keys());
		
		//用Set表示Multimap中所有不同的键
		println(multimap.keySet());
		
		//用一个"扁平"的Collection<V>包含Multimap中的所有值。
		println(multimap.values());
		//按键区分开的Collection<V>包含Multimap中的所有值。
		println(multimap.asMap().values());
		//用Collection<Map.Entry<K, V>>返回Multimap中所有"键-单个值映射"——包括重复键。(对SetMultimap，返回的是Set)
		println(multimap.entries());
	}
}
