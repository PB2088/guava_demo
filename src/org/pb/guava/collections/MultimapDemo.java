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
		
		//��Multiset��ʾMultimap�е����м�
		println(multimap.keys());
		
		//��Set��ʾMultimap�����в�ͬ�ļ�
		println(multimap.keySet());
		
		//��һ��"��ƽ"��Collection<V>����Multimap�е�����ֵ��
		println(multimap.values());
		//�������ֿ���Collection<V>����Multimap�е�����ֵ��
		println(multimap.asMap().values());
		//��Collection<Map.Entry<K, V>>����Multimap������"��-����ֵӳ��"���������ظ�����(��SetMultimap�����ص���Set)
		println(multimap.entries());
	}
}
