import domain.Calc;
import domain.Numbers;
import uitl.SplitNumString;


import java.util.Scanner;

public class Calculator {

    public void run() {
        SplitNumString splitNumString = new SplitNumString(new Scanner(System.in));

        Numbers numbers = new Numbers(splitNumString.splitNum());
        System.out.println("numbers.getNumbers() = " + numbers.getNumbers());

        Calc calc = new Calc(splitNumString.splitCalc());
        System.out.println("calc.getCalcs() = " + calc.getCalcs());


    }

}
