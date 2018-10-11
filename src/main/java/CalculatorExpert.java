import java.sql.SQLOutput;

public class CalculatorExpert extends CalculatorBasic {

    public int pow(int baz, int exp) {
        int rez = baz;
        for (int i = 1; i < exp; i++) {
            rez = rez * baz;

        }
        return rez;
    }

    public long pow(long baz, long exp) {
        long rez = baz;
        for (int i = 1; i < exp; i++) {
            rez = rez * baz;

        }
        return rez;
    }

    public double pow(double baz, double exp) {
        double rez = baz;
        for (int i = 1; i < exp; i++) {
            rez = rez * baz;

        }
        return rez;
    }

    public float root(int number) {
        float root = 0.0f;
        float square = root;
        while (square < number) {
            root++;
            square = root * root;
        }
        return root;
    }

    public int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public int fact1(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact1(n - 1));
    }

    public double Expresie(String equation) {
        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident = divide(divident,Double.parseDouble(division[i]));
                    }
                    multiplResult = multiply(divident,multiplResult);
                } else {
                    multiplResult = multiply(multiplResult,Double.parseDouble(operand));
                }
            }
            result =add(result,multiplResult);
        }

        return result;
    }
}









