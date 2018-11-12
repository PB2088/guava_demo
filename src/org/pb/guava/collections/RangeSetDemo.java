package org.pb.guava.collections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

import static org.pb.guava.util.PrintUtil.*;

public class RangeSetDemo {
	public static void main(String[] args) {
		RangeSet<Integer> rangeSet = TreeRangeSet.create();
		rangeSet.add(Range.closed(1, 10)); // {[1,10]}
		
		println(rangeSet);

		rangeSet.add(Range.closedOpen(11, 15));//不相连区间:{[1,10], [11,15)}
		
		println(rangeSet);
		
		rangeSet.add(Range.closedOpen(15, 20)); //相连区间; {[1,10], [11,20)}
		rangeSet.add(Range.openClosed(0, 0)); //空区间; {[1,10], [11,20)}
		rangeSet.remove(Range.open(5, 10)); //分割[1, 10]; {[1,5], [10,10], [11,20)}
	}

}
