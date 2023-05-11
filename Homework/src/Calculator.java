public class Calculator implements ICalculator{

    public double add (double a, double b){
        return a+b;
    }
    public double subtract (double a, double b){
        return a-b;
    }
    public double multiply (double a, double b){
        return a*b;
    }
    public double divide (double a, double b) {
        if (b==0){
            throw new IllegalArgumentException("Cant divide by 0!");
        }
        return a/b;
    }
    public double percentage (double a, double b) {
        if(b==0){
          throw new IllegalArgumentException("Cant divide by 0!");
    }
        return a*100/b;
    }
    public int factorial (int n){
 int factorial = 1;
        for (int i =0; 0 == n;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}
