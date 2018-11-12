package org.pb.guava.strings;

import java.util.Arrays;

import com.google.common.base.Joiner;

import static org.pb.guava.util.PrintUtil.*;

/**
 * 
 *<p>
 *description:������[Joiner]
 *</p>
 * @author ex_pengbo
 * @since 2016-1-14
 * @see
 */
public class JoinerDemo {
	public static void main(String[] args) {
		//ʹ��skipNulls()������ֱ�Ӻ���null
		String join = Joiner.on(",").skipNulls().join("Harry", null, "Ron", "Hermione");
		println(join);
		
		//ʹ��useForNull(String)�������Ը���ĳ���ַ������滻null
		String joinForNull = Joiner.on(",").useForNull("aa").join("Harry", null, "Ron", "Hermione");
		println(joinForNull);
		
		println(Joiner.on(",").join(Arrays.asList(1,3,5,7)));
		
		StringBuilder appendTo = Joiner.on(",").appendTo(new StringBuilder(), Arrays.asList(2,4,6,8));
		println(appendTo);
		
		/**
			���棺joinerʵ�����ǲ��ɱ�ġ���������joinerĿ����������÷����ܻ᷵��һ���µ�joinerʵ����
				��ʹ��joinerʵ�������̰߳�ȫ�ģ�����Խ��䶨��Ϊstatic final������
		 */
	}
}
