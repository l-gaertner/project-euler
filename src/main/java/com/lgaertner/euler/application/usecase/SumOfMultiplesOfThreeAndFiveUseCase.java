package com.lgaertner.euler.application.usecase;

import java.util.ArrayList;
import java.util.List;

public class SumOfMultiplesOfThreeAndFiveUseCase {
	private final int start;
	private final int end;

	public SumOfMultiplesOfThreeAndFiveUseCase(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public SumOfMultiplesOfThreeAndFiveUseCase(int end) {
		this(1, end);
	}

	public int value () {
		List<Integer> betweenStartAndEnd = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			betweenStartAndEnd.add(i);
		}

		return betweenStartAndEnd.stream().filter(value -> value % 3 == 0 || value % 5 == 0).mapToInt(Integer::intValue).sum();
	}
}
