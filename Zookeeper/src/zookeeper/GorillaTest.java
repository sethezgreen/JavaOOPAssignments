package zookeeper;

public class GorillaTest {
	
	public static void main(String[] args) {
		Gorilla bob = new Gorilla();
		
		bob.throwSomething();
		bob.throwSomething();
		bob.throwSomething();
		
		bob.eatBananas();
		bob.eatBananas();
		
		bob.climb();
		
		System.out.println("Bob's energy level: " + bob.energy);
	}
}
