package org.activity08;

// TODO implement basic mathematical operations with int numbers in range
// of [-10..+10] (including)
// Note that:
// 1. input range is checked using assertions (so if they are disabled, inputs can be any int)
// 2. outputs are always checked and exception is thrown if it is outside proper range

public class SimpleCalc {
	
	public static void main(String [] args)  {
		try {
			System.out.println(add(7,8));
		} catch (SimpleCalcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TODO specify that method can throw SimpleCalcException
	public static int add(int a, int b) throws SimpleCalcException {
		// TODO implement adding operation
		validateInput(a,b);
		validateOutput(a,b, "add");
		return a + b;
	}

	// TODO specify that method can throw SimpleCalcException
	public static int subtract(int a, int b) throws SimpleCalcException
			{
		// TODO implement subtract operation
		validateInput(a,b);
		validateOutput(a,b, "subtract");
		return a - b;
	}

	// TODO specify that method can throw SimpleCalcException
	public static int multiply(int a, int b) throws SimpleCalcException
			{
		// TODO implement multiply operation
		validateInput(a,b);
		validateOutput(a,b, "multiply");
		return a * b;
	}

	// TODO specify that method can throw SimpleCalcException
	public static int divide(int a, int b) throws SimpleCalcException
			{
		// TODO implement divide operation
		validateInput(a,b);
		validateOutput(a,b, "divide");
		return a / b;
	}

	// TODO Validate that inputs are in range of -10..+10 using assertions
	// Use following messages for assertion description if values are not in
	// range:
	// "input value a: A is below -10"
	// "input value a: A is above 10"
	// "input value b: B is below -10"
	// "input value b: B is above 10"
	// "input value a: A is below -10 and b: B is below -10"
	// "input value a: A is above 10 and b: B is below -10"
	// "input value a: a is below -10 and b: B is above 10"
	// "input value a: a is above 10 and b: B is above 10"
	//
	// where: A and B are actual values of a and b.
	//
	// hint:
	// note that assert allows only simple boolean expression
	// (i.e. without &, |, () and similar constructs).
	// therefore for more complicated checks use following approach:
	// if (long && complicated || statement)
	// assert false: "message if statement not fulfilled";
	//
	public static void validateInput(int a, int b) throws SimpleCalcException {
		if(a < - 10) {
			if(b < - 10) {
				throw new AssertionError(getAssertionMessage(a, "input value", "a", "below -10") + 
						getAssertionMessage(b, " and", "b", "below -10"));
			}
			else if(b > 10) {
				throw new AssertionError(getAssertionMessage(a, "input value", "a", "below -10") + 
						getAssertionMessage(b, " and", "b", "above 10"));
			}
			throw new AssertionError(getAssertionMessage(a, "input value", "a", "below -10"));
		}
		if(a > 10) {
			if(b > 10) {
				throw new AssertionError(getAssertionMessage(a, "input value", "a", "above 10") + 
						getAssertionMessage(b, " and", "b", "above 10"));
			}
			if(b < -10) {
				throw new AssertionError(getAssertionMessage(a, "input value", "a", "above 10") + 
						getAssertionMessage(b, " and", "b", "below -10"));
			}
			throw new AssertionError(getAssertionMessage(a, "input value", "a", "above 10"));
		}
		if(b < -10) {
			throw new AssertionError(getAssertionMessage(b, "input value", "b", "below -10"));
		}
		if(b > 10) {
			throw new AssertionError(getAssertionMessage(b, "input value", "b", "above 10"));
		}
		
	}
	
	public static String getAssertionMessage(int number, String inputOrAnd, String strNumber, String condition) {
		return inputOrAnd + " " + strNumber + ": " + number + " is " + condition;
	}

	// TODO use this method to validate that result of operation is also in
	// range of -10..+10.
	// If result is not in range, throw SimpleCalcException with message:
	// "output value a oper b = result is above 10"
	// "output value a oper b = result is below -10"
	// where oper is +, -, *, /
	// Hint:
	// If division by zero is performed, catch original exception and create
	// new SimpleCalcException with message "division by zero" and and add
	// original division exception as a cause for it.
	public static void validateOutput (int a, int b, String operation) throws SimpleCalcException
			{
		switch(operation) {
		case "add":
			if(a + b > 10) { 
				throw new SimpleCalcException(getExceptionMessage(a, b, a + b, "+", "above 10"));
			}
			if(a + b < -10) {
				throw new SimpleCalcException(getExceptionMessage(a, b, a+ b,  "+", "below -10"));
			}
			break;
		case "subtract":
			if(a - b > 10) {
				throw new SimpleCalcException(getExceptionMessage(a, b, a-b, "-", "above 10"));
			}
			if(a - b < -10) {
				throw new SimpleCalcException(getExceptionMessage(a, b,a-b, "-", "below -10"));
			}
			break;
		case "multiply":
			if(a * b > 10) {
				throw new SimpleCalcException(getExceptionMessage(a, b,a*b, "*", "above 10"));
			}
			if(a * b < -10) {
				throw new SimpleCalcException(getExceptionMessage(a, b,a*b, "*", "below -10"));
			}
			break;
		case "divide":
			try {
			if(a / b > 10) {
				throw new SimpleCalcException(getExceptionMessage(a, b,a/b, "/", "above 10"));
			}
			if(a / b < -10) {
				throw new SimpleCalcException(getExceptionMessage(a, b,a/b, "/", "below -10"));
			}
			} catch(ArithmeticException e) {
				throw new SimpleCalcException("Can not be divided by 0", e);
			}
			break;
		}
}
	
	public static String getExceptionMessage(int a, int b, int result, String operation, String strResult) {
		return "output value " + a + " " + operation + " " + b + " = " + result + " is " + strResult;
	}
}
