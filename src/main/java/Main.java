import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float rez2;
        int rez;
        //double equation;

        CalculatorBasic calcb = new CalculatorBasic();
        CalculatorExpert calcex = new CalculatorExpert();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        rez = calcb.substract(4, 2, 3);
        double rez1 = calcb.divide(1F, 2F, 3F);
        rez2 = calcex.root(2);
        rez = calcex.fact1(10);
        //equation = calcex.Expresie("3+2*2+3-2");

//        System.out.println(df.format(rez1));
//        System.out.println(rez);
//        System.out.println(rez1);
//        System.out.println(rez2);

        System.out.println("Enter your string equation: ");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        System.out.println("Your result is " + calcex.Expresie(equation));
        //System.out.println(equation);
    }
}
