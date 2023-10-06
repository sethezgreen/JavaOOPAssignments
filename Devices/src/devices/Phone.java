package devices;

public class Phone extends Device{
	
	public Phone() {
		super();
	}
	
	public void makeCall() {
		if (this.battery > 10) {
			this.battery -= 5;
			System.out.println("\n You made a call! \n Remaining Battery: " + this.battery);
		}
		this.batteryCheck();
	}
	
	public void playGame() {
		if (this.battery > 25) {
			this.battery -= 20;
			System.out.println("\n You played a game! \n Remaining Battery: " + this.battery);
		}
		this.batteryCheck();
	}
	
	public void charge() {
		this.battery += 50;
		System.out.println("\n You charged up! \n Remaining Battery: " + this.battery);
		this.batteryCheck();
	}
	
	public void batteryCheck() {
		if (this.battery < 10) {
			System.out.println("Battery Critial!");
		}
	}
}
