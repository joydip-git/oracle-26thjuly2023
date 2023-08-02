import java.util.HashSet;
import java.util.Set;

//was released 2021
public class ElementList<T> implements ElementCollection<T> {

	private Set<T> elements;

	public ElementList() {
		this.elements = new HashSet<T>();
	}

	@Override
	public void addElement(T element) {
		elements.add(element);
	}

	@Override
	public T deleteElement(T element) {
		return elements.remove(element) ? element : null;
	}	
}
