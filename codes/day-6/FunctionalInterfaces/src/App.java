import java.util.Optional;
import java.util.function.*;

public class App {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> predicate = new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { return t % 2 != 0; }
		 * 
		 * };
		 */
		Predicate<Integer> evenLogic = (t) -> t % 2 != 0;

		/*BiPredicate<Integer, Integer> greaterLogic = new BiPredicate<Integer, Integer>() {

			@Override
			public boolean test(Integer t, Integer u) {
				return t - u > 0;
			}
		};*/
		BiPredicate<Integer, Integer> greaterLogic = (t, u) -> t - u > 0;
		
		Function<Integer, Boolean> logic = new Function<Integer, Boolean>() {
			@Override
			public Boolean apply(Integer t) {
				return t % 2 == 0;
			}
		};
		Function<Integer, Integer> function = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		Consumer<Integer> cosumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);
			}
		};
		BiConsumer<Integer, Integer> addLogic = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t + u);
			}
		};
		BiFunction<Integer, Long, Long> subLogic = new BiFunction<Integer, Long, Long>() {

			@Override
			public Long apply(Integer t, Long u) {
				return u - t;
			}
		};
		BinaryOperator<Integer> multiLogic = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Supplier<Integer> supplier = new Supplier<Integer>() {

			@Override
			public Integer get() {
				Optional<Integer> opt = Optional.of(12);
				return opt.get();
			}
		};
		UnaryOperator<Integer> unary = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t++;
			}
		};
	}
}
