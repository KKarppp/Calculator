public class CalculatorMock implements ICalculator{

    @Override
    public double add(double a, double b) {
        return 0;
    }

    @Override
    public double subtract(double a, double b) {
        return 1;
    }

    @Override
    public double multiply(double a, double b) {
        return 2;
    }

    @Override
    public double divide(double a, double b) {
        return 3;
    }

    @Override
    public double percentage(double a, double b) {
        return 4;
    }

    @Override
    public double factorial(int n) {
        return 5;
    }
}
