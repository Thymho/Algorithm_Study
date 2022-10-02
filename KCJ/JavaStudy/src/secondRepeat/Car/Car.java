package secondRepeat.Car;

public class Car {
//	String color = "red";
//	int gear = 2, speed = 80;
//	
//	int changeGear(){
//		gear = 3;
//		return gear;
//	}
//	
//	int speedUp() {
//		speed += 10;
//		return speed;
//	}
//	
//	int speedDown() {
//		speed -= 10;
//		return speed;
//	}
//	
//	@Override
//	public String toString() {
//		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
//	}
	
	
	
//	String color; //차량의 색이 null값으로 나오기 때문에 수정
	String color = "red";
	int speed, gear;
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
}
