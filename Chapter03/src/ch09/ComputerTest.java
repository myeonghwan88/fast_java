package ch09;

public class ComputerTest {

	public static void main(String[] args) {

//		abstract 가 들어가있는 클래스는 new 할수 없다.
		Computer desktop = new DeskTop();
		desktop.display();
		
	}

}
