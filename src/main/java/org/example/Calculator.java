package org.example;

import org.example.calculator.*;

import java.util.List;


//public class Calculator {
//    public static int calculate(int operand1, String operator, int operand2) {
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
//    }
//}


public class Calculator {
    private static final List<NewArithemeticOperator> aritheticOperators = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return aritheticOperators.stream()
                .filter(aritheticOperator -> aritheticOperator.supports(operator))
                .map(aritheticOperator -> aritheticOperator.calculates(operand1,operand2))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}