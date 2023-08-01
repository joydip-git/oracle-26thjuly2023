import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Actual<T> implements MessagePrinter{

	private Class<T> objectReference;
	private Method methodRefernce;
	
	
	public Actual(Class<T> objectReference, Method methodRefernce) {
		this.objectReference = objectReference;
		this.methodRefernce = methodRefernce;
	}


	@Override
	public String invokeMessagePrinterImplementation(String personName) {
		//return this.methodRefernce.invoke(this.objectReference, new Object[] {personName});
		//return this.methodRefernce.invoke(null, new Object[] {personName});
		return null;
	}
}
