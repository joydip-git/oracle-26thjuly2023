@FunctionalInterface
public interface Sample {
	String sayHello(String name);

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();

	@Override
	String toString();	
}
