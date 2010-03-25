package com.todesking.sandbox;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;

import org.junit.Test;

public class RangeTest {
	@Test
	public void range() {
		assertThat(Range.range(0, 5, 1).toList(),is(Arrays.asList(0,1,2,3,4,5)));
	}
}
