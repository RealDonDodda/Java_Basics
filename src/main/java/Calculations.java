public class Calculations {
    public double multiply(double x, double y) {
        return x * y;
    }

    public int addition(int i, int i1) {
        return i + i1;
    }

    public int subtraction(int i, int i1) {
        return i1 - i;
    }

    public int divide(int i, int i1) {
        if (i1 == 0 || i == 0 ){
            throw new ArithmeticException("CANNOT DIVIDE BY ZERO");

        } return i1 / i;
    }

//   Math -

}
