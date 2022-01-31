package application;

public class App {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1);

		//can also use subtype polymorphism - we can create
		//an object of a subclass type wherever an object of
		//the parent class type is expected
		Animal a2 = new Cat();
		System.out.println(a2);
		
		Cat c1 = new Cat();
		Animal a3 = c1;
		System.out.println(a3);
		/* Upcasting.  The c1 variable refers to a Cat and
		 * the a3 variable refers to an Animal.  a3 = a1 is 
		 * upcasting, where the cat object refers to the animal 
		 * variable.
		 * Animal a3 = (Animal)c1 is explicit upcasting. Not used
		 * much in Java due to subtype polymorphism.
		 * Upcasting because we are casting from the sub class to
		 * the super class.
		 * Casting applies to variables, not to objects.
		 * In this case there is only one object (c1).  a3 is
		 * the same object.
		 */
	}

}
