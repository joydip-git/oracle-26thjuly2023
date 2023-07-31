import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// int x = null;
		// Optional<String> str = null;

		Optional<Integer> x = Optional.of(10);
		//Integer i = null;
		
		if (x.isPresent()) {
			System.out.println(x.get());
		} else {
			System.out.println("empty");
		}
		Category laptop = new Category(1, "laptop", null);
		Category mobile = new Category(2, "mobile", null);

		Product dell = new Product(1, "dell xps", 100000, "new 15 inch latop from dell", laptop, null);
		Product hp = new Product(2, "hp probook", 700000, "new 13 inch latop from hp", laptop, null);
		Product iphone = new Product(3, "iphone 14", 150000, "new powerful mobile from apple", mobile, null);
		Product galaxy = new Product(4, "galaxy tab", 120000, "new powerful tab from samsung", mobile, null);
		
		Set<Product> laptops = new HashSet<Product>();
		laptops.add(dell);
		laptops.add(hp);
		
		laptop.setProducts(laptops);
		
		Set<Product> mobiles = new HashSet<Product>();
		mobiles.add(iphone);
		mobiles.add(galaxy);
		
		mobile.setProducts(mobiles);

		System.out.println(dell.getName() + " belongs to category: " + dell.getCategoryInfo().getName());
		
		System.out.println("products from "+laptop.getName());
		for (Product p : laptop.getProducts()) {
			System.out.println(p.getName());
		}
		
		//select p.pname from categories c join products p on c.cid == p.cid where c.cid = 1
	}

}
