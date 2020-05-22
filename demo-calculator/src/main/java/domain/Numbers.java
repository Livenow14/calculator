package domain;

import java.util.List;

public class Numbers {

    private List<Long> numbers;

    public Numbers(List<Long> numbers) {
        this.numbers = numbers;
    }

    public Long getNextNum(){
        if(isEmpty(numbers))
        return 0L;

        return numbers.remove(0);
    }

    public boolean isEmpty(List<Long> numbers){
        return numbers.isEmpty();
    }
}
