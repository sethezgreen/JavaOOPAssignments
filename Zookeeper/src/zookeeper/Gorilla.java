package zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void throwSomething() {
		this.energy -= 5;
		System.out.println("Gorilla has thrown something!");
	}
	
	public void eatBananas() {
		this.energy += 10;
		System.out.println("The gorilla ate a banana and is very satisfied.");
	}
	
	public void climb() {
		this.energy -= 10;
		System.out.println("The gorilla climbed a tree!");
	}
}
