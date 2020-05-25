import domain.Operator;
import domain.Operand;
import input.InputView;
import uitl.OperationType;
import uitl.SplitOperandOperator;


import java.util.Scanner;
public class Calculator {
    public void run() {

        final InputView inputView = new InputView(new Scanner(System.in));

        String inputValue = inputView.inputStringValues();
        SplitOperandOperator splitOperandOperator = new SplitOperandOperator(inputValue);

        Operand operand = new Operand(splitOperandOperator.splitOperand());                                 //숫자 추출
        Operator operator = new Operator(splitOperandOperator.splitOperator());                             //사칙연산 추출

        System.out.println( "게산 값 : "+ OperationType.calculate(operator, operand));                       //결과 값 계산
    }
}
