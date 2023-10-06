package devices;

public class DeviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone iPhone = new Phone();
		
		// Call Test
		iPhone.makeCall();
		iPhone.makeCall();
		iPhone.makeCall();
		
		// Game Test
		iPhone.playGame();
		iPhone.playGame();
		
		// Charge Test
		iPhone.charge();
		
		// Battery Critical Test
		iPhone.playGame();
		iPhone.playGame();
		iPhone.playGame();
		iPhone.playGame();
		iPhone.makeCall();
		iPhone.makeCall();
		
		// Game minimum battery test
		iPhone.playGame();
	}

}
