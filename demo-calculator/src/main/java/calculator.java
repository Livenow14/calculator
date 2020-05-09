import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class calculator {

    private static List<Long> numbers = new ArrayList<>();
    private static List<String> calc = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String kb = sc.nextLine();
        
        String [] splits= kb.split(" ");
        List<String> num = Arrays.stream(splits).collect(Collectors.toList());

        SplitNumString(num, num.size());

        System.out.println("numbers = " + numbers);
        System.out.println("calc = " + calc);

    }

    private static int SplitNumString(List<String> num, int count) {

        if(count<0)
            return 0;

        if((count-1) %2==0) {
            numbers.add(0, Long.parseLong(num.get(count-1)));

        }
        if((count-1)%2==1){
            calc.add(0,num.get(count-1));
        }

       return SplitNumString(num, count - 1);
    }
}
