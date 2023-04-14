package com.lgaertner.euler.usecase;

import com.lgaertner.euler.application.usecase.SumOfMultiplesOfThreeAndFiveUseCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesOfThreeAndFiveUseCaseTest {

	@Test
	public void shouldFindSumOfMultiplesOfThreeAndFiveBetweenOneAndTwo() {
		//when
		SumOfMultiplesOfThreeAndFiveUseCase useCase = new SumOfMultiplesOfThreeAndFiveUseCase(2);

		//then
		assertEquals(0, useCase.value());
	}

	@Test
	public void shouldFindSumOfMultiplesOfThreeAndFiveBetweenOneAndThree() {
		//when
		SumOfMultiplesOfThreeAndFiveUseCase useCase = new SumOfMultiplesOfThreeAndFiveUseCase(3);

		//then
		assertEquals(3, useCase.value());
	}

}
