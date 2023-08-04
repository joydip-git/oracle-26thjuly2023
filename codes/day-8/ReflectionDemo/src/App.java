import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

public class App {

	public static void main(String[] args) throws MalformedURLException {

		//Person anil = new Person();
		try {
			File file = new File("D:\\oracle\\oracle-26thjuly2023\\codes\\day-8\\Entities\\bin");
			URI uri = file.toURI();
			URL url = uri.toURL();
			System.out.println(uri.getPort() + ", " + uri.getPath());
			System.out.println(url.getPath());
			ClassLoader loader = new URLClassLoader(new URL[] { url });
			//ClassLoader.getSystemClassLoader().getClass();

			Class classInstanceWithPersonInfo = loader.loadClass("Person");

			// extracted information about a data type (Class) (technique-1)
			// Class<?> classInstanceWithPersonInfo = Class.forName("Person");

			// printing name of the class and whether it is interface or not
			System.out.println("Name: " + classInstanceWithPersonInfo.getName());
			System.out.println("is interface? " + classInstanceWithPersonInfo.isInterface());

			// extracting constructor information from class information (metadata)
			System.out.println("\nConstructos infornmation\n");
			Constructor[] constructors = classInstanceWithPersonInfo.getDeclaredConstructors();

			for (Constructor constructor : constructors) {
				System.out.println(constructor.getName());
				// extracting constructor parameter information (metadata) through ecah
				// constructor metadata
				Parameter[] parameters = constructor.getParameters();
				if (parameters.length == 0) {
					System.out.println("this is default ctor\n");
				} else {
					System.out.println("this is parameterized ctor");
					System.out.println("\nConstructor Parameter infornmation\n");
					for (Parameter p : parameters) {
						System.out.println("Name: " + p.getName() + ", type: " + p.getType().getName());
					}
				}
			}

			// extracting all declared data member information from class metadata
			System.out.println("\nField infornmation\n");
			Field[] fields = classInstanceWithPersonInfo.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.isAccessible() ? "public" : "private/protected");
				System.out.println("Name: " + field.getName() + ", type: " + field.getType().getName());
			}

			// extracting all declared method information from class metadata
			System.out.println("\nMethod infornmation\n");
			Method[] methods = classInstanceWithPersonInfo.getDeclaredMethods();
			for (Method method : methods) {
				System.out
						.println("\nName: " + method.getName() + ", return type: " + method.getReturnType().getName());

				if (method.getParameterCount() == 0)
					System.out.println("No parameters");
				else {
					System.out.println("\nMethod Parameter infornmation\n");
					Parameter[] parameters = method.getParameters();
					for (Parameter p : parameters) {
						System.out.println("Name: " + p.getName() + ", type: " + p.getType().getName());
					}
				}
			}

			// creating instance of a class using class metadata and newInstance() method of
			// Class class
			// the newInstance() method of Class<T> class calls the default constructor
			// Person anilPerson = (Person) classInstanceWithPersonInfo.newInstance();

			// creating instance of a class using newInstance() method of Constructor class.
			// Constructor[] allConstructors =
			// classInstanceWithPersonInfo.getConstructors();
			// Constructor parameterizedCtorInfo = null;
			/*
			 * for (Constructor constructor : allConstructors) {
			 * if(constructor.getParameterCount() == 2) { parameterizedCtorInfo =
			 * constructor; break; } }
			 */

			// extracting information of a type using <type-name>.class property
			// (technique-2)
			Constructor parameterizedCtorInfo = classInstanceWithPersonInfo
					.getDeclaredConstructor(new Class[] { String.class, int.class });

			// dynamically invoking constructor using constructor information (metadata)
			// down-casting to Person type
			// Person anilPerson = (Person) parameterizedCtorInfo.newInstance(new Object[] {
			// "Anil", 1 });
			// System.out.println("Name: " + anilPerson.getName());

			// no down-casting and passing parameters for parameterized constructor by
			// creating Object type array
			// Object anilPerson = parameterizedCtorInfo.newInstance(new Object[] { "Anil",
			// 1 });

			// no down-casting and passing parameters for parameterized constructor directly
			Object anilPerson = parameterizedCtorInfo.newInstance("Anil", 1);

			if (anilPerson != null) {
				// extract information of a data type using getClass() method from Object class
				// (technique-3)

				// Class<? extends Person> clsInfo = anilPerson.getClass();
				// Class<?> clsInfo = anilPerson.getClass();
				// System.out.println(clsInfo.getName());

				// extracting a particular method information from class metadata
				// pass method name and all parameter class information to the getMethod()
				// method
				Method setNameMethodInfo = classInstanceWithPersonInfo.getMethod("setName", String.class);
				setNameMethodInfo.invoke(anilPerson, "Anil Kumar");

				Method getNameMethodInfo = classInstanceWithPersonInfo.getMethod("getName");
				Object nameValue = getNameMethodInfo.invoke(anilPerson);
				
				System.out.println("Name: " + nameValue);
			} else {
				System.out.println("no instance");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
