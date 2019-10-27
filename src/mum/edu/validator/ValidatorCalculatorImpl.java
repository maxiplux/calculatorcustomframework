package mum.edu.validator;

import mum.edu.domain.Calculator;

import java.util.ArrayList;
import java.util.List;


public class ValidatorCalculatorImpl implements ValidatorCalculator {
	
	public List<String> validate(Object  object ) {
		List<String> errors = new ArrayList<String>();

		Calculator calculator = (Calculator) object;

		if (calculator.getAdd1() == null) {
			errors.add("Calculator must have a add1");
		}
		if (calculator.getAdd2() == null) {
			errors.add("Calculator must have a add2");
		}


		if (calculator.getMult1() == null) {
			errors.add("Calculator must have a getMult1");
		}
		if (calculator.getMult2() == null) {
			errors.add("Calculator must have a getMult2");
		}


		return errors;
	}
}
