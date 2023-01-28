import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import 		org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import 		org.opentutorials.iot.Security;


public class OK_javaGoinHomeInput {

	// parameter, 매개변수
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
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
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}

// 10강 디버거 
// 1. 사용자가 이사갈 경우, 그때마다 아파트 아이디값을 바꿔줘야해서 번거로움. 
// 아예 사용자가 입력하도록 하자. 팝업창이 떠서 사용자보고 아이디값을 입력받도록 하자 (검색) 
// => java popup input swing 

// 2. 사용자가 원하는 밝기로 조명을 키고 싶다. 
// 사용자로부터 밝기를 입력받도록 팝업창을 만들자. (위 과정과 동일) 
// 그런데 이 메서드를 쓰려면 받는 변수가 더블 형태의 타입이어야 한다. 
// 그런데 사용자가 입력하는 값은 string값이 되다보니 이 string을 double로 전환시켜야 한다(검색) 
// => java string to double conversion

// 11강 입력과 출력 arguments & parameter
//1. 실행버튼 아래에 Run configuraions의 쓰임: 변수의 값을 지정할 때 사용자로부터 직접 입력받지 않아도 됨. 그냥 configurations에 arguments에 변수의 값을 써 놓으면, 써놓은 순서대로 args 배열에 저장이 됨. 예를 들어, arguments에 "Pusan APT 507", "15.0" 이렇게 쓰고 Apply를 누르면 자동으로 args[0]에는 "Pusan APT 100"이, args[1]에는 "15.0"이 저장된다. 
//
//2. 그럼 이 args는 어떻게 이용할 거냐? 어차피 Public static void main(String[] args)할 때 이 args기 때문에 따로 선언할 필요 없다. 그냥 사용할 변수에 args를 넣어주면 됨. 예를 들어, id 변수와 bright 변수를 사용하고 싶으면, String id = args[0], String bright = args[1] 이렇게만 해주면 됨. 
//
//3. 요약: 사용자로부터 여러 개의 변수 값을 입력받기 귀찮을 때 간단하게 configurations를 이용해서 변수에 값을 지정할 수 있다. 이때 저장된 값은 args 배열에 0번 배열부터 순서대로 저장된다. 사용하고 싶은 변수를 선언하고 args배열을 지정해주면 끝.