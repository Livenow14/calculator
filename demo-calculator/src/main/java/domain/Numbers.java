package domain;

import java.util.ArrayList;
import java.util.List;


public class Numbers {
    private List<Long> numbers;

    public Numbers(List<Long> numbers) {
        this.numbers = numbers;
    }
    public List<Long> getNumbers() {
        return numbers;
    }
    public Long getFirstNum(){
        return numbers.remove(0);
    }

    public void addFirstNum(Long num){
         numbers.add(0,num);
    }

}
