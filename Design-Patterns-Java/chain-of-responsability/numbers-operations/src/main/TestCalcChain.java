package main;

public class TestCalcChain {

    public static void main(String[] args){

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers numbers1 = new Numbers(1, 2, "add");
        Numbers numbers2 = new Numbers(1, 2, "sub");
        Numbers numbers3 = new Numbers(1, 2, "mult");
        Numbers numbers4 = new Numbers(1, 2, "div");
        Numbers numbers5 = new Numbers(1, 2, "expelliarmus");

        chainCalc1.calculate(numbers1);
        chainCalc1.calculate(numbers2);
        chainCalc1.calculate(numbers3);
        chainCalc1.calculate(numbers4);
        chainCalc1.calculate(numbers5);

    }

}
