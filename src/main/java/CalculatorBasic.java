public class CalculatorBasic {


    public int add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public long add(long... a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public double add(double... a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public int substract(int... a) {
        int sub = a[0];
        for (int i = 1; i < a.length; i++) {
            sub = sub - a[i];
        }
        return sub;
    }

    public long substract(long... a) {
        long sub = a[0];
        for (int i = 1; i < a.length; i++) {
            sub = sub - a[i];
        }
        return sub;
    }

    public double substract(double... a) {
        double sub = a[0];
        for (int i = 1; i < a.length; i++) {
            sub = sub - a[i];
        }
        return sub;
    }

    public int multiply(int... a) {
        int m = 1;
        for (int i = 0; i < a.length; i++) {
            m = m * a[i];
        }
        return m;
    }

    public long multiply(long... a) {
        long m = 1;
        for (int i = 0; i < a.length; i++) {
            m = m * a[i];
        }
        return m;
    }

    public double multiply(double... a) {
        double m = 1;
        for (int i = 0; i < a.length; i++) {
            m = m * a[i];
        }
        return m;
    }


    public int divide(int... a) {
        int d = a[0];
        for (int i = 1; i < a.length; i++) {
            d = d / a[i];
        }
        return d;
    }

    public long divide(long... a) {
        long d = a[0];
        for (int i = 1; i < a.length; i++) {
            d = d / a[i];
        }
        return d;
    }

    public double divide(double... a) {
        double d = a[0];
        for (int i = 1; i < a.length; i++) {
            d = d / a[i];
        }
        return d;
    }
}
