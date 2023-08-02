//released 2023 june
@FunctionalInterface
public interface ElementComparer<T> {
	 int compareElements(T a, T b);
	 default public int foo() {
		 return 0;
	 }
}
