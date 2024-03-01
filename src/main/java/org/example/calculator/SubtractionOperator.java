package org.example.calculator;

public class SubtractionOperator implements NewArithemeticOperator{
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculates(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() - operand2.toInt();
    }
}
