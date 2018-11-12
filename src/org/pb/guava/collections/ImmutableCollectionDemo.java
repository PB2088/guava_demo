package org.pb.guava.collections;

import java.util.Arrays;
import java.util.Collection;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import static org.pb.guava.util.PrintUtil.*;

public class ImmutableCollectionDemo {
	static ImmutableSet<String> COLOR_NAMES = ImmutableSet.of("red","orange","yellow","green","blue","purple");
	
	public static void main(String[] args) {
		ImmutableSet<String> copyOf = ImmutableSet.copyOf(Arrays.asList("A,B,C,D,E,F".split(",")));
		
		println(copyOf);
		
		//copyOf.add("Y"); //UnsupportedOperationException
		//copyOf.remove("E");//UnsupportedOperationException
		
		ImmutableSet<String> foobar = ImmutableSet.of("foo", "bar", "baz");
		thingamajig(foobar);
	}
	
	static <T> void thingamajig(Collection<T> collection) {
	    ImmutableList<T> defensiveCopy = ImmutableList.copyOf(collection);
	    println(defensiveCopy);
	}
}
