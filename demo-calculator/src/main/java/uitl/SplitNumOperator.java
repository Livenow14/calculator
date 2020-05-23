package uitl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitNumOperator {

    private List<String> str;

    public SplitNumOperator(Scanner scanner) {
        String inputValue = scanner.nextLine();
        checkEmpty(inputValue);
        str = Arrays.asList(inputValue.split(" "));
    }

    private void checkEmpty(String str) {
        if (str.isEmpty()) {
            throw new NullPointerException("아무런 계산이 들어오지 않았습니다.");
        }
    }

    public List<Long> splitNum() {
        List<Long> operands = new ArrayList<>();
        for (int idx = 0; idx < str.size(); idx += 2) {
            String operand = str.get(idx);
            checkWrongNum(operand);
            operands.add(Long.parseLong(operand));
        }
        return operands;
    }

    private void checkWrongNum(String operand) {
        try {
            Long.parseLong(operand);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("숫자가 아닌 문자가 입력되었습니다.");
        }
    }

    public List<String> splitOperator() {
        List<String> operators = new ArrayList<>();
        for (int idx = 1; idx < str.size(); idx += 2) {
            String operator = str.get(idx);
            operators.add(operator);
        }
        return operators;
    }


}

