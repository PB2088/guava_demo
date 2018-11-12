package org.pb.guava.basicUtilities;

import static com.google.common.base.Preconditions.*;

import java.util.Arrays;
import java.util.List;

import static org.pb.guava.util.PrintUtil.*;

/**
 * 
 *<p>
 *description:(前置条件)让方法中的条件检查更简单
 *</p>
 * @author ex_pengbo
 * @since 2016-1-6
 * @see
 */
public class PreconditionsDemo {
	public static void main(String[] args) {
		checkNonnegative(10);
		checkListIsEmpty(Arrays.asList("a","b","c"));
		
		println("-------------checkState------------");
		//用来检查对象的某些状态。检查失败时抛出的异常:IllegalStateException
		checkState(true,"状态不正确!");
		
		println("-------------checkNotNull------------");
		//检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。
		System.out.println(checkNotNull("aaa","对象为空"));//aaa
		
		println("-------------checkElementIndex------------");
		//检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size,
		//该方法返回当前索引值
		System.out.println(checkElementIndex(0, 1));//0
		
		println("-------------checkPositionIndex------------");
		//检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size
		//该方法返回当前索引值
		System.out.println(checkPositionIndex(2, 2));
		checkPositionIndexes(2, 3, 5);
		
	}
	
	
	
	static void checkNonnegative(int i) {
		//检查boolean是否为true，用来检查传递给方法的参数。
		checkArgument(i >= 0,"Argument was %s but expected nonnegative",i);
	}
	
	static <T> void checkListIsEmpty(List<T> list) {
		checkArgument(list != null && !list.isEmpty(), "集合为空!");
	}
}
