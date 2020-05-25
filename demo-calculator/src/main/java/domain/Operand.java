package domain;

import java.util.List;

public class Operand {

    private List<Long> operands;

    public Operand(List<Long> operands) {
        this.operands = operands;
    }

    public Long getNextOperand() {
        if (isEmpty(operands))
            return 0L;

        return operands.remove(0);
    }

    public boolean isEmpty(List<Long> numbers) {
        return numbers.isEmpty();
    }
}
