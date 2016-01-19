
public class Animal {

	AnimalStrategy a;
	
	public Animal(AnimalStrategy a) {
		this.a=a;
	}
	
	public void print(){
		a.makeSound();
	}
}
