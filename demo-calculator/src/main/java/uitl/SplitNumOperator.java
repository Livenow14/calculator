package uitl;

import domain.Numbers;

import java.util.*;
import java.util.stream.Stream;

public class SplitNumOperator {

    private Scanner scanner;
    private String [] str;

    public SplitNumOperator(Scanner scanner) {
        this.scanner = scanner;
        str = scanner.nextLine().split(" ");
    }

    public List<Long> splitNum() {
        List<Long> tmp = new ArrayList<>();
        Stream.iterate(0, n->n+2).limit(str.length/2 + 1 ).forEach(t-> tmp.add( Long.parseLong(str[t])));
        return tmp;
    }

    public List<String> splitOperator() {
        List<String> tmp = new ArrayList<>();
        Stream.iterate(1, n->n+2).limit(str.length/2).forEach(t -> tmp.add(str[t]));
        return tmp;


    }


}
