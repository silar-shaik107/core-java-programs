/*Data abstraction is the process of hiding certain details and showing only essential 
 information to the user.
   Abstraction can be achieved with either abstract classes or interfaces
    
   Abstract class: is a restricted class that cannot be used to create objects
   
   Abstract method: can only be used in an abstract class, and it does not have a body.
   
   An abstract class can have both abstract and regular methods:
 */

package abstarction;

public abstract class Animal {
	
	//Abstract Method
	public abstract void animalSound(); 
    
	//Regular method
	public void sleep() {
		System.out.println("Zzzzzzz");
	}
}
//sub class(inherit from Animal class)
class Pig extends Animal {

	// the body of animalSound() is provided here
	public void animalSound() {
		System.out.println("The pig says : wee wee");

	}
}
class Main{
	public static void main(String[] args) {
		Pig myPig=new Pig();//create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}