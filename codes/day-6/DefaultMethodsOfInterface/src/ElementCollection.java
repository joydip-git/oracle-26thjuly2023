//was released in 2021
public interface ElementCollection<T> {
	public void addElement(T element);

	public T deleteElement(T element);

	default public void sort(ElementComparer<T> comparer) {
		
	}
}
