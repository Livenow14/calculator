package domain;

import java.util.List;

public class Operator {

    private List<String> operators;

    public Operator(List<String> operators) {
        this.operators = operators;
    }

    public String getNextCalc(){
        return operators.remove(0);
    }

    public boolean isEmpty(){
        return operators.isEmpty();
    }
}