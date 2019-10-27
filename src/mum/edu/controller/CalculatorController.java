package mum.edu.controller;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.ValidatorCalculator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@mum.edu.framework.annotation.Controller
public class CalculatorController {

    @AutoWired
    ValidatorCalculator validatorCalculator;
	
	@RequestMapping(value={"/","/calculator"})
	public String inputProduct() {
		return "/WEB-INF/jsp/calculator.jsp";
	}

	@RequestMapping(value={"/sum","/calc"})
	public String saveProduct(Calculator calculator, HttpServletRequest request)
    {
 //        ProductValidator productValidator = new ProductValidator();
        List<String> errors = validatorCalculator.validate(calculator);
        if (errors.isEmpty()) {
             // no validation error, execute action method
            // insert code to save product to the database



            // store product in a scope variable for the view
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/jsp/result.jsp";
        } else {
  
            // store errors and product in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculator);
            return "/WEB-INF/jsp/CalculatorForm.jsp";

        }
 	}
}
