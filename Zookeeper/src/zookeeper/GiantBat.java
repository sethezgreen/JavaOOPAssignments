package zookeeper;

public class GiantBat extends Mammal {

	public GiantBat() {
		// TODO Auto-generated constructor stub
		this.energy = 300;
	}
	
	public void fly() {
		this.energy -= 50;
		System.out.println("Is it a bird, is it a plane...");
	}
	
	public void eatHumans() {
		this.energy += 25;
		System.out.println("The bat has had a terrifying meal, and is rather satisfied.");
	}
	
	public void attackTown() {
		this.energy -= 100;
		System.out.println("The bat has wreaked havoc on a town!");
	}
}
