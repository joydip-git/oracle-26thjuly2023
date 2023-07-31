import java.util.Set;

public class Category {
	private int id;
	private String name;
	private Set<Product> products;
	
	public Category() {
		super();
	}
	public Category(int id, String name, Set<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
