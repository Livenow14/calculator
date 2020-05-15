package domain;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<String> calcs;

    public Operator(List<String> calcs) {
        this.calcs = calcs;
    }

    public List<String> getCalcs() {
        return calcs;
    }
    public String  getFirstCalc(){
        return calcs.remove(0);
    }

}
