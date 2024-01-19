/*
*   Traditionally, pass the object that contains the specific implementation of print() method
*   printThing(cat)
*
*   In Lambdas we directly pass the implementation of the print() method.
*   printThing(()-> System.out.println("Meow"));
*
*   Case when there is parameters in declaration of print() method.
*   printThing(s-> System.out.println("Meow"));
*   Multiple Parameters
*
*
* */
public class Main {
	public static void main(String[] args) {

		// traditional way of calling printThing function -
		// create a Object of class implementing Printable interface
		Printable cat = new Cat();
		// pass it to printThing
		printThing(cat);

		// ---------------------
		// using lambdas --
		printThing(
				(prefix,suffix) -> {System.out.println(prefix+"Meow"+suffix);}
		);
		// or writing it without {}
		printThing((p,s)-> System.out.println(p+"Meow"+s));



	}

	static void printThing(Printable object){

		object.print("sound is: ","!");
	}

	static void returnPrintThing(Printable object){


	}
}
