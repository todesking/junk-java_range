package com.todesking.sandbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Range implements Iterable<Integer> {
	private final int start;
	private final int end;
	private final int step;
	private Range(int start,int end,int step) {
		this.start=start;
		this.end=end;
		this.step=step;
	}
	
	public static Range range(int start,int end,int step) {
		return new Range(start,end,step);
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int cur=start;
			public boolean hasNext() {
				return step<0?cur>=end:cur<=end;
			}
			public Integer next() {
				int old=cur;
				cur+=step;
				return old;
			}
			public void remove() {
				throw new UnsupportedOperationException("java sucks");
			}
		};
	}

	public List<Integer> toList() {
		final List<Integer> result=new ArrayList<Integer>();
		for(int i:this)
			result.add(i);
		return result;
	}
	
}
