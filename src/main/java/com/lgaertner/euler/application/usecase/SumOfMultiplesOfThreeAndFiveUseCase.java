package com.lgaertner.euler.application.usecase;

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
		if (end < 3) {
			return 0;
		} else {
			return 3;
		}
	}
}
