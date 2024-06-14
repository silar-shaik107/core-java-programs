package interfaceExample;

//interface
public interface Animal {

	public void animalSound(); // interface method

	public void sleep(); // interface method

}

class Pig implements Animal {

	@Override
	public void animalSound() {
		System.out.println("The Pig says :weeee weeee");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzzzz");

	}

}

class Main {
	public static void main(String[] args) {
	
	Pig myPig=new Pig();
	myPig.animalSound();
	myPig.sleep();
	}
}