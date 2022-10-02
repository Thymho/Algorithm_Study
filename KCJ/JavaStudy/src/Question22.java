public class Question22 {
	
	String color;
	int gear, speed, fuel;
		
	public String toString() {
		return "Car [color="+color+", speed="+speed+", gear="+gear+", ¿¬ºñ= "+fuel+"]";
	}
	
	void gearChage(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed = speed+10; 
	}
	
	void speedDown() {
		speed = speed-10;
	}
	
	int fuelDistance(int dis) { //Challenger9
		fuel = 7;
		fuel = dis/fuel;
		
		return fuel;
	}
	
	public static void main(String[] args) {
		Question22 car = new Question22();
		
		car.color = "red";
		car.gear = 2;
		car.speed = 80;
		
		car.gearChage(1);
		car.speedUp();
		car.fuelDistance(80);
		
		System.out.println(car);
	}
}