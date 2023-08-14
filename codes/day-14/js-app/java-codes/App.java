import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        // 1.
        Implementation impl = new Implementation();
        Contract isEvenLogic = impl::isEven;
        boolean status = isEvenLogic.apply(12);
        System.out.println(status);

        // 2.
        Contract isOddLogic = new Contract() {
            @Override
            public Boolean apply(Integer num) {
                return num % 2 != 0;
            }
        };
        System.out.println(isOddLogic.apply(13));

        // 3.
        Contract isGreaterLogic = (num) -> num > 2;
        isGreaterLogic.apply(12);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);

        // Predicate<Integer> isEvenLogicFn = (a) -> a % 2 == 0;
        // numbers.stream().filter(isEvenLogicFn);

        numbers.stream().sorted((a, b) -> a - b);
        numbers.stream().filter((a) -> a % 2 == 0);
    }
}
