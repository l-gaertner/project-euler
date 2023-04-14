package com.lgaertner.euler.usecase;

import com.lgaertner.euler.application.usecase.SumOfMultiplesOfThreeAndFiveUseCase;
import org.junit.Test;

public class MultiplesOfThreeAndFiveUseCaseTest {

	@Test
	public void shouldFindSumOfMultiplesOfThreeAndFiveBetweenOneAndTwo() {
		SumOfMultiplesOfThreeAndFiveUseCase useCase = new SumOfMultiplesOfThreeAndFiveUseCase(1, 2);
		int sum = useCase.value();
		assert sum == 0;
	}

}
