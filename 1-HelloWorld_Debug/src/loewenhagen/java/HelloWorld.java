/**
 * 
 */
package loewenhagen.java;

/**
 * @author Kyle Loewenhagen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Kyle";
		
		if(name.isEmpty()){
			System.out.println("Could not say Hello to nobody!");			
		}
		else
		{
			System.out.println("Hello " + name + "!");
		}
	}

}
