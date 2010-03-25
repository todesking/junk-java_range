package com.todesking.sandbox;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RangeTest {
	@Test
	public void range() {
		assertThat(Range.range(0, 5, 1).toList(),is(list(0,1,2,3,4,5)));
		assertThat(Range.range(0, -5, -1).toList(),is(list(0,-1,-2,-3,-4,-5)));
		assertThat(Range.range(0, 6, 2).toList(),is(list(0,2,4,6)));
	}

	private List<Integer> list(Integer... args) {
		return Arrays.asList(args);
	}
}
