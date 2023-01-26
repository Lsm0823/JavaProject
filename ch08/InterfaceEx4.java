package ch08;

abstract class Tv{
	
	String color;
	boolean power;
	int ch;
	
	void PowerOnOff(){
		power =! power;
	}
	
	void upCh() {
		ch++;
	}
	
	void downCh() {
		ch--;
	}
	abstract void setModel();
}

class SMTv extends Tv implements RemoteControl{
	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
}


class LGTv extends Tv implements RemoteControl{
	@Override
	void setModel() {
	}

	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}
}

interface RemoteControl{
	
	void turnOn();
	void turnOff();
	
}


public class InterfaceEx4 {

	public static void main(String[] args) {

	}

}
