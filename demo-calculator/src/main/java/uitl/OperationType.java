package uitl;

import domain.Operand;
import domain.Operator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum OperationType {

    DIVIDE("/", (a, b) -> a / b),
    MINUS("-", (a, b) -> a - b),
    MULTI("*", (a, b) -> a * b),
    PlUS("+", (a, b) -> a + b);

    private String operator;
    private BiFunction<Long, Long, Long> expression;

    OperationType(String operator, BiFunction<Long, Long, Long> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static Long calculate(Operator operator, Operand operand) {
        long result = operand.getNextOperand();
        while (!operator.isEmpty()) {
            result = getOperate(operator.getNextCalc())
                    .expression
                    .apply(result, operand.getNextOperand());
        }
        return result;
    }

    private static OperationType getOperate(String operator) {
        OperationType operationType = Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
        return operationType;
    }
}
