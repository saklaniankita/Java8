 package java8.lambdafunction;

 /**
 * NEW WAY
 * @author Ankita
 *
 */
public class MyNewClass {
	public static void main(String[] args) {
		MyInterface myInterface = (str) -> {
			return "Hello "+str;
		};
		System.out.println(myInterface.sayHello("Ankita"));
	}
}
