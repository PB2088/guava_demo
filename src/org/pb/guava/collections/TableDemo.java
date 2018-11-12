package org.pb.guava.collections;

import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

import static org.pb.guava.util.PrintUtil.*;

public class TableDemo {
	public static void main(String[] args) {
		Table<String, String, Integer> score = HashBasedTable.create();
		score.put("pengbo", "JavaEE", 92);
		score.put("pengbo", "Oracle", 95);
		score.put("pengbo", "ASP.NET", 88);
		score.put("pengbo", "C++", 99);
		
		score.put("zhangsan", "JavaEE", 85);
		score.put("zhangsan", "Oracle", 90);
		score.put("zhangsan", "ASP.NET", 80);
		score.put("zhangsan", "C++", 90);
		
		score.put("wangyx", "JavaEE", 90);
		score.put("wangyx", "Oracle", 87);
		score.put("wangyx", "ASP.NET", 75);
		score.put("wangyx", "C++", 83);
		
		println(score.columnKeySet());
		println(score.rowKeySet());
		
		println("-----------------");
		
		Set<Cell<String, String, Integer>> cellSet = score.cellSet();
		for (Cell<String, String, Integer> cell : cellSet) {
			System.out.println(cell.getRowKey() + "---------" + cell.getColumnKey() + "---------" + cell.getValue());
		}
	}
}
