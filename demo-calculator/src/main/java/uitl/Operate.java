package uitl;

import domain.Numbers;
import domain.Operator;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public enum Operate {
    DIVIDE("/", (a, b) -> a / b),
    MINUS("-", (a, b) -> a - b),
    MULTI("*", (a, b) -> a * b),
    PlUS("+", (a, b) -> a + b);

    private String operator;
    private BiFunction<Long, Long, Long> expression;

    Operate(String operator, BiFunction<Long, Long, Long> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static Long calculate(Operator operator, Numbers numbers) {
        long result = 0;
        while (!operator.getCalcs().isEmpty()) {
            result = getOperate(operator.removeFirstCalc()).expression.apply(numbers.removeFirstNum(), numbers.removeFirstNum());
            numbers.addNumFirst(result);
        }
        return result;
    }

    private static Operate getOperate(String operator) {
        Operate operate = Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
        return operate;
    }


}
