package zookeeper;

public class GiantBatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiantBat henry = new GiantBat();
		
		henry.attackTown();
		henry.attackTown();
		henry.attackTown();

		henry.eatHumans();
		henry.eatHumans();
		
		henry.fly();
		henry.fly();
		
		System.out.println("Henry's energy level: " + henry.energy);
	}

}
