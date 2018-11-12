package org.pb.guava.basicUtilities;

import java.util.Set;

import com.google.common.base.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		//创建指定引用的Optional实例，若引用为null则快速失败
		Optional<Integer> possible = Optional.of(55);
		
		//创建引用缺失的Optional实例
		Optional<Object> absent = Optional.absent();
		
		//创建指定引用的Optional实例，若引用为null则表示缺失
		Optional<Integer> fromNullable = Optional.fromNullable(null);
		
		
		//如果Optional包含非null的引用（引用存在），返回true
		System.out.println(possible.isPresent());		//true
		System.out.println(absent.isPresent());			//false
		System.out.println(fromNullable.isPresent());	//false
		
		System.out.println("-------------------------------");
		
		//返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
		System.out.println(possible.get());
		
		//返回Optional所包含的引用，若引用缺失，返回指定的值
		System.out.println(absent.or(22));//22
		
		//返回Optional所包含的引用，若引用缺失，返回null
		System.out.println(absent.orNull());
		
		//返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。
		Set<Object> set = absent.asSet();
		System.out.println(set);
		
	}
}
