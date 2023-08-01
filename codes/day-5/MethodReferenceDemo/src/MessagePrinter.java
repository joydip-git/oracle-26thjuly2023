
@FunctionalInterface
public interface MessagePrinter {
	String invokeMessagePrinterImplementation(String personName);

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();

	@Override
	String toString();	
}
