import java.io.*;

public class App {

	static void divide() throws ArithmeticException {
		int res = 0;
		try {
			int a = 10;
			int b = 0;
			res = a / b;	
			//open database connection
			//fetching data from database			
		} catch (ArithmeticException ex) {
			throw ex;
		}finally {
			System.out.println(res);
			//close the data base connection
		}
	}

	static void printArr(int[] arr) throws ArrayIndexOutOfBoundsException, NullPointerException {
		try {
			if (arr != null) {
				for (int i = 0; i < arr.length + 1; i++) {
					System.out.println(arr[i]);
				}
			} else {
				NullPointerException nullEx = new NullPointerException("array is null");
				throw nullEx;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		} catch (NullPointerException e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			divide();
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
		int[] arr = new int[] { 1, 2, 3 };
		try {
			printArr(arr);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
