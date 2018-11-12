package org.pb.guava.collections;

import java.util.Arrays;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

import static org.pb.guava.util.PrintUtil.*;

public class MultisetDemo {
	public static void main(String[] args) {
		String str = "success is getting what you want happiness is wanting what you get";
		
		Multiset<String> hashMultiset = HashMultiset.create();
		hashMultiset.addAll(Arrays.asList(str.split("\\b")));
		
		println("HashMultiset: "+hashMultiset);
		
		TreeMultiset<String> treeMultiset = TreeMultiset.create();
		treeMultiset.addAll(Arrays.asList(str.split(" ")));
		
		println("TreeMultiset: "+treeMultiset);
		
		LinkedHashMultiset<String> linkedHashMultiset = LinkedHashMultiset.create();
		linkedHashMultiset.addAll(Arrays.asList(str.split(" ")));
		println("LinkedHashMultiset: "+linkedHashMultiset);
		
	}
}
