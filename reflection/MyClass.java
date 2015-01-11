package reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {  // look up try with resources - will see over and over in design
			System.out.print("A class name: ");
			String cl = sc.next();

			try {
				Class<?> c = Class.forName(cl);
				Object obj = c.newInstance();
				System.out.println(obj);  // this has created an instance of a class (on the fly) - Person for example
				
				/* System.out.println(c);
				Method[] m = c.getDeclaredMethods();  // c.getMethods()

				// review enhanced for loops
				for (Method meth: m)		
					System.out.println(meth);
				 */
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {	
				System.err.println("oh no - all wrong. [" + e + "]");
				e.printStackTrace();
			}
		}
	}
}