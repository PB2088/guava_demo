package org.pb.guava.strings;

import static org.pb.guava.util.PrintUtil.*;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;


/**
 * 
 *<p>
 *description:�����[Splitter]
 *</p>
 * @author ex_pengbo
 * @since 2016-1-14
 * @see
 */
public class SplitterDemo {
	public static void main(String[] args) {
		String str = "success is getting what you want happiness is wanting what you get";
		//JDK�ڽ����ַ�����ֹ�����һЩ�Źֵ����ԡ����磬String.split���Ķ�����β���ķָ�����
		println(",a,,b,".split(",").length);//"", "a", "", "b"
		
		println(Splitter.on(",").trimResults().omitEmptyStrings().split("foo,bar,,   qux"));
		
		//���ַ�ƥ�������
		Iterable<String> charMatcher = Splitter.on(CharMatcher.INVISIBLE).split(str);
		println(charMatcher);
		
		//��������ʽ���
		Iterable<String> onPattern = Splitter.onPattern("\\s").split(str);
		println(onPattern);
		
		//���̶����Ȳ�֣����һ�ο��ܱȸ������ȶ̣�������Ϊ�ա�
		Iterable<String> fixedLength = Splitter.fixedLength(7).split(str);
		println(fixedLength);
		
		/**
			�������Ҫ���������List��ֻҪʹ��Lists.newArrayList(splitter.split(string))�����Ʒ����� 
			���棺splitterʵ�����ǲ��ɱ�ġ���������splitterĿ����������÷����ܻ᷵��һ���µ�splitterʵ����
			��ʹ��splitterʵ�������̰߳�ȫ�ģ�����Խ��䶨��Ϊstatic final������
		 */
	}
}
