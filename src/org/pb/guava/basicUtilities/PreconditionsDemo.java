package org.pb.guava.basicUtilities;

import static com.google.common.base.Preconditions.*;

import java.util.Arrays;
import java.util.List;

import static org.pb.guava.util.PrintUtil.*;

/**
 * 
 *<p>
 *description:(ǰ������)�÷����е�����������
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
		//�����������ĳЩ״̬�����ʧ��ʱ�׳����쳣:IllegalStateException
		checkState(true,"״̬����ȷ!");
		
		println("-------------checkNotNull------------");
		//���value�Ƿ�Ϊnull���÷���ֱ�ӷ���value����˿�����Ƕʹ��checkNotNull��
		System.out.println(checkNotNull("aaa","����Ϊ��"));//aaa
		
		println("-------------checkElementIndex------------");
		//���index��Ϊ����ֵ��ĳ���б��ַ����������Ƿ���Ч��index>=0 && index<size,
		//�÷������ص�ǰ����ֵ
		System.out.println(checkElementIndex(0, 1));//0
		
		println("-------------checkPositionIndex------------");
		//���index��Ϊλ��ֵ��ĳ���б��ַ����������Ƿ���Ч��index>=0 && index<=size
		//�÷������ص�ǰ����ֵ
		System.out.println(checkPositionIndex(2, 2));
		checkPositionIndexes(2, 3, 5);
		
	}
	
	
	
	static void checkNonnegative(int i) {
		//���boolean�Ƿ�Ϊtrue��������鴫�ݸ������Ĳ�����
		checkArgument(i >= 0,"Argument was %s but expected nonnegative",i);
	}
	
	static <T> void checkListIsEmpty(List<T> list) {
		checkArgument(list != null && !list.isEmpty(), "����Ϊ��!");
	}
}
