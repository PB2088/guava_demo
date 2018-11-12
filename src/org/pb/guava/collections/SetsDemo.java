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
		// intersection ����[two, three, seven] (����)
		SetView<String> intersection = Sets.intersection(primes,wordsWithPrimeLength);
		
		//union ����[two, three, five, seven, one, six, eight] (����)
		SetView<String> union = Sets.union(primes, wordsWithPrimeLength);
		
		//difference ���� [five] (�)
		SetView<String> difference = Sets.difference(primes, wordsWithPrimeLength);
		
		//symmetricDifference ����[one, six, eight, five] (����)
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
