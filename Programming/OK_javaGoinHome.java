import 		org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import 		org.opentutorials.iot.Security;


public class OK_javaGoinHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
	
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();
		
		
		
	}

}


// Resume : 디버깅을 할 때, 더블클릭으로 체크해 놓은 곳까지 프로그램을 쭉 실행시킨다
// Terminate : 디버깅 종료
// Step Into(/return) : 해당 코드 라인의 메소드가 어떻게 작동하는지 보다 구체적으로 볼 수 있다
// Step Over : 코드를 한 줄씩 실행시킨다
// Debug : 디버그를 실행하며, 디버그에 용이한 구성으로 창의 모양이 바뀐다
