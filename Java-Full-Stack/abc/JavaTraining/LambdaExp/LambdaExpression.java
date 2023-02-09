package LambdaExp;

interface Sensor{
	void on();
	void off();
}

class TVSensor implements Sensor{
	
	@Override
	public void on() {
		
	}
	
	@Override
	public void off() {
		
		
	}
}
public class LambdaExpression {

	public static void main(String[] args) {
		
//		Here we are creating an object of class and not the object
//		Java allows reference of parent, then parent can be static, interface, it doesn't matter
//		Sensor is just an reference of object
		Sensor s = new TVSensor();
		s.on();
		s.off();
	
	}	

}
