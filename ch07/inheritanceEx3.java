package ch07;


class Car3{
	public Car3() {
		super();
	}
	
	void speedUp() {}
} // class Car3

class Taxi3 extends Car3{
	void stop() {}
} // class Taxi3



public class inheritanceEx3 {

	public static void main(String[] args) {
		Object obj =  new Car3();
		
		Car3 c = new Taxi3();
		
		//Taxi3 t = new Car3();
		
		
	}

}
