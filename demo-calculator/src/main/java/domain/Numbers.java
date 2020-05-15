package domain;

import java.util.List;


public class Numbers {
    private List<Long> numbers;

    public Numbers(List<Long> numbers) {
        this.numbers = numbers;
    }
    public List<Long> getNumbers() {
        return numbers;
    }
    public Long removeFirstNum(){
        return numbers.remove(0);
    }

    public void addNumFirst(Long num){
         numbers.add(0,num);
    }

}
