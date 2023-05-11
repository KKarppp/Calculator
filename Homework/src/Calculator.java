public class Calculator implements ICalculator{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        if(b == 0){
            throw new IllegalArgumentException("Cant divide by 0!");
        }
        return a/b;
    }

    @Override
    public double percentage(double a, double b) {
        if(b == 0){
            throw new IllegalArgumentException("Cant divide by 0!");
        }
        return a*100/b;
    }

    @Override
    public double factorial(int n) {
        double factorial = 1;
        for (int i = 1; i == n; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}
