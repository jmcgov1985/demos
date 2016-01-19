
public class main {

	public static void main(String[] args) {
		System.out.println("hi");
		
		Animal a = new Animal(new Dog());
		
		a.print();
		
		//now make "a" a cat.
		
		a = new Animal(new Cat());
		a.print();

	}

}
