package org.pb.guava.collections;

import java.util.HashSet;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import static org.pb.guava.util.PrintUtil.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		HashSet<String> copySet = Sets.newHashSet("aa","aa","bb","bb");
		println(copySet);
		
		copySet.add("aaaa");
		println(copySet);
		println("--------------------------");
		
		List<String> theseElements = Lists.newArrayList("alpha", "beta", "gamma");
		println(theseElements);
		theseElements.add("oracle");
		println(theseElements);
	}
}
