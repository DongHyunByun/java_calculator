package org.example.calculator;

public interface NewArithemeticOperator {
    boolean supports(String operator);
    int calculates(PositiveNumber operand1, PositiveNumber operand2);
}
