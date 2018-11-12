package org.pb.guava.collections;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import static org.pb.guava.util.PrintUtil.*;

public class ListsDemo {
	public static void main(String[] args) {
		List<Integer> countUp = Ints.asList(1, 2, 3, 4, 5);
		List<Integer> countDown = Lists.reverse(countUp);
		
		println(countUp);
		println(countDown);
		println("--------------------------------");
		
		List<List<Integer>> parts = Lists.partition(countUp, 2);
		println(parts);
		
	}
}
