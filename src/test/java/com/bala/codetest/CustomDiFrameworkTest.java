package com.bala.codetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bala.codetest.di.CustomDi;
import com.bala.codetest.di.CustomDiFramework;
import com.bala.codetest.di.dependency.impl.AbstractDependency;

public class CustomDiFrameworkTest {


	@Test
	public void shouldInjectPrettyTextFormatterAndAdditionCalculatorViaFieldInjection() throws Exception {
		CustomDiFramework usdDI = CustomDi.getFramework(new DependencyInjectionConfigExample1());
		FieldInjectionExample example = (FieldInjectionExample) usdDI.inject(FieldInjectionExample.class);

		int processNumbers = example.processNumbers(3, 2);

		assertEquals("Pretty text: <5>", processNumbers);
	}
	
	private class DependencyInjectionConfigExample1 extends AbstractDependency {


	private class DependencyInjectionConfigExample2 extends AbstractDependency {
		
		@Override
		public void configure() {
			createMapping(CalculatorService.class, AddService.class);
		}
	}

	private class DependencyInjectionConfigExample3 extends AbstractDependency {
		
		@Override
		public void configure() {
			createMapping(CalculatorService.class, SubService.class);
		}
	}

	@Override
	public void configure() {
		// TODO Auto-generated method stub
		
	}

	}
}
