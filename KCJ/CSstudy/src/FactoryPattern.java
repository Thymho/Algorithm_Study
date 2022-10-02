//상위 클래스(뼈대)
abstract class Coffee {
	public abstract int getPrice();

	@Override
	public String toString() {
		return "Hi this coffee is "+this.getPrice();
	}
}

//카페 공장 (입력 받은 문자열이 라떼인지 아메리카노인지 판별)
class CoffeeFactory {
	public static Coffee getCoffee(String type, int price) {
		if("Latte".equalsIgnoreCase(type)) {
			return new Latte(price);
		} else if("Americano".equalsIgnoreCase(type)) {
			return new Americano(price);
		} else {
			return new DefaultCoffee();
		}
	}
}

//카페 공장에서 그 외를 입력받았다면 호출되는 클래스
class DefaultCoffee extends Coffee {
	private int price;
	
	public DefaultCoffee() {
		this.price = -1;
	}

	public int getPrice() {
		return price;
	}
}

//라떼 클래스 - 객체 생성1
class Latte extends Coffee {
	private int price;
	
	public Latte(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

//아메리카노 클래스 - 객체 생성2
class Americano extends Coffee {
	private int price;
	
	public Americano(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

//호출 클래스(메인)
public class FactoryPattern {
	public static void main(String[] args) {
		// TODO 팩토리 패턴
		
		Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
		Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
		System.out.println("Factory latte ::"+latte);
		System.out.println("Factory ame ::"+ame);
	}
}
