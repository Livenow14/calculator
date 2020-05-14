package domain;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    private List<String> calcs;

    public Calc(List<String> calcs) {
        this.calcs = calcs;
    }

    public List<String> getCalcs() {
        return calcs;
    }
}
