package main;

public class CalculatorModel {

    private int calculationValue;

    public int getCalculationValue() { return calculationValue; }

    public void addTwoNumbers(int firstNumber, int secondNumber){

        calculationValue = firstNumber + secondNumber;
    }

}
