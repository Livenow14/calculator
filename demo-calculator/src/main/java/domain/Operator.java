package domain;

import java.util.List;

public class Operator {

    private List<String> calcs;

    public Operator(List<String> calcs) {
        this.calcs = calcs;
    }

    public String getNextCalc(){
        return calcs.remove(0);
    }

    public boolean isEmpty(){
        return calcs.isEmpty();
    }

}
