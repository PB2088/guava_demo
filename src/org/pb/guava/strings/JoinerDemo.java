package org.pb.guava.strings;

import java.util.Arrays;

import com.google.common.base.Joiner;

import static org.pb.guava.util.PrintUtil.*;

/**
 * 
 *<p>
 *description:连接器[Joiner]
 *</p>
 * @author ex_pengbo
 * @since 2016-1-14
 * @see
 */
public class JoinerDemo {
	public static void main(String[] args) {
		//使用skipNulls()方法是直接忽略null
		String join = Joiner.on(",").skipNulls().join("Harry", null, "Ron", "Hermione");
		println(join);
		
		//使用useForNull(String)方法可以给定某个字符串来替换null
		String joinForNull = Joiner.on(",").useForNull("aa").join("Harry", null, "Ron", "Hermione");
		println(joinForNull);
		
		println(Joiner.on(",").join(Arrays.asList(1,3,5,7)));
		
		StringBuilder appendTo = Joiner.on(",").appendTo(new StringBuilder(), Arrays.asList(2,4,6,8));
		println(appendTo);
		
		/**
			警告：joiner实例总是不可变的。用来定义joiner目标语义的配置方法总会返回一个新的joiner实例。
				这使得joiner实例都是线程安全的，你可以将其定义为static final常量。
		 */
	}
}
