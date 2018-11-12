package org.pb.guava.strings;

import static org.pb.guava.util.PrintUtil.*;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;


/**
 * 
 *<p>
 *description:拆分器[Splitter]
 *</p>
 * @author ex_pengbo
 * @since 2016-1-14
 * @see
 */
public class SplitterDemo {
	public static void main(String[] args) {
		String str = "success is getting what you want happiness is wanting what you get";
		//JDK内建的字符串拆分工具有一些古怪的特性。比如，String.split悄悄丢弃了尾部的分隔符。
		println(",a,,b,".split(",").length);//"", "a", "", "b"
		
		println(Splitter.on(",").trimResults().omitEmptyStrings().split("foo,bar,,   qux"));
		
		//按字符匹配器拆分
		Iterable<String> charMatcher = Splitter.on(CharMatcher.INVISIBLE).split(str);
		println(charMatcher);
		
		//按正则表达式拆分
		Iterable<String> onPattern = Splitter.onPattern("\\s").split(str);
		println(onPattern);
		
		//按固定长度拆分；最后一段可能比给定长度短，但不会为空。
		Iterable<String> fixedLength = Splitter.fixedLength(7).split(str);
		println(fixedLength);
		
		/**
			如果你想要拆分器返回List，只要使用Lists.newArrayList(splitter.split(string))或类似方法。 
			警告：splitter实例总是不可变的。用来定义splitter目标语义的配置方法总会返回一个新的splitter实例。
			这使得splitter实例都是线程安全的，你可以将其定义为static final常量。
		 */
	}
}
