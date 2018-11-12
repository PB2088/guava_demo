package org.pb.guava.basicUtilities;

import java.util.Set;

import com.google.common.base.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		//����ָ�����õ�Optionalʵ����������Ϊnull�����ʧ��
		Optional<Integer> possible = Optional.of(55);
		
		//��������ȱʧ��Optionalʵ��
		Optional<Object> absent = Optional.absent();
		
		//����ָ�����õ�Optionalʵ����������Ϊnull���ʾȱʧ
		Optional<Integer> fromNullable = Optional.fromNullable(null);
		
		
		//���Optional������null�����ã����ô��ڣ�������true
		System.out.println(possible.isPresent());		//true
		System.out.println(absent.isPresent());			//false
		System.out.println(fromNullable.isPresent());	//false
		
		System.out.println("-------------------------------");
		
		//����Optional�����������ã�������ȱʧ�����׳�java.lang.IllegalStateException
		System.out.println(possible.get());
		
		//����Optional�����������ã�������ȱʧ������ָ����ֵ
		System.out.println(absent.or(22));//22
		
		//����Optional�����������ã�������ȱʧ������null
		System.out.println(absent.orNull());
		
		//����Optional���������õĵ������ɱ伯��������ô��ڣ�����һ��ֻ�е�һԪ�صļ��ϣ��������ȱʧ������һ���ռ��ϡ�
		Set<Object> set = absent.asSet();
		System.out.println(set);
		
	}
}
