package org.pb.guava.collections;

import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

import static org.pb.guava.util.PrintUtil.*;

public class SetsDemo {
	public static void main(String[] args) {
		Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
		Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
		// intersection 包含[two, three, seven] (交集)
		SetView<String> intersection = Sets.intersection(primes,wordsWithPrimeLength);
		
		//union 包含[two, three, five, seven, one, six, eight] (并集)
		SetView<String> union = Sets.union(primes, wordsWithPrimeLength);
		
		//difference 包含 [five] (差集)
		SetView<String> difference = Sets.difference(primes, wordsWithPrimeLength);
		
		//symmetricDifference 包含[one, six, eight, five] (补集)
		SetView<String> symmetricDifference = Sets.symmetricDifference(wordsWithPrimeLength, primes);
		
		println(intersection);
		println(union);
		println(difference);
		println(symmetricDifference);
		
		println("---------------------------------------------");
		Set<String> animals = ImmutableSet.of("gerbil", "hamster");
		Set<String> fruits = ImmutableSet.of("apple", "orange", "banana");
		
		Set<List<String>> product = Sets.cartesianProduct(animals,fruits);
		
		println(product);
		
	}
}
