import domain.Operator;
import domain.Numbers;
import uitl.OperationType;
import uitl.SplitNumOperator;


import java.util.Scanner;

public class Calculator {

    public void run() {

        SplitNumOperator splitNumOperator = new SplitNumOperator(new Scanner(System.in));

        Numbers numbers = new Numbers(splitNumOperator.splitNum());                                 //숫자 추출
        Operator operator = new Operator(splitNumOperator.splitOperator());                             //사칙연산 추출

        System.out.println( "게산 값 : "+ OperationType.calculate(operator, numbers));                       //결과 값 계산
    }
}
