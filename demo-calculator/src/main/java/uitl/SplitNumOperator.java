package uitl;

import domain.Numbers;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class SplitNumOperator {

    private String [] str;

    public SplitNumOperator(Scanner scanner) {
        str = scanner.nextLine().split(" ");
    }

/*    public List<Long> splitNum() {
        List<Long> tmp = new ArrayList<>();
        Stream.iterate(0, n->n+2).limit(str.length/2 + 1 ).forEach(t -> tmp.add( Long.parseLong(str[t])));
        return tmp;
    }

    public List<String> splitOperator() {
        List<String> tmp = new ArrayList<>();
        Stream.iterate(1, n->n+2).limit(str.length/2).forEach(t -> tmp.add(str[t]));
        return tmp;
    }*/
    public List<Long> splitNum() {
        List<Long> tmp = new ArrayList<>();
        Stream.iterate(0, n->n+2).limit(str.length/2 +1 ).forEach(t -> tmp.add( Long.parseLong(str[t])));
        return tmp;
    }

    public List<String> splitOperator() {
        List<String> tmp = new ArrayList<>();
        Stream.iterate(1, n->n+2).limit(str.length/2).forEach(t -> tmp.add(str[t]));
        return tmp;
    }

/*    public void addExceptionChk (int num) {

        try {

        } catch () {

        }
    }*/



    public interface ExceptionFunction<T, R> {
        R apply(T r) throws Exception;
        public static <T, R> Function<T, R> wrap(ExceptionFunction<T, R> f) {
            return (T r) -> {
                try {
                    return f.apply(r);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            };
        }
    }



}

