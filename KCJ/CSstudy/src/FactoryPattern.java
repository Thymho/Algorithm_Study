//���� Ŭ����(����)
abstract class Coffee {
	public abstract int getPrice();

	@Override
	public String toString() {
		return "Hi this coffee is "+this.getPrice();
	}
}

//ī�� ���� (�Է� ���� ���ڿ��� ������ �Ƹ޸�ī������ �Ǻ�)
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

//ī�� ���忡�� �� �ܸ� �Է¹޾Ҵٸ� ȣ��Ǵ� Ŭ����
class DefaultCoffee extends Coffee {
	private int price;
	
	public DefaultCoffee() {
		this.price = -1;
	}

	public int getPrice() {
		return price;
	}
}

//�� Ŭ���� - ��ü ����1
class Latte extends Coffee {
	private int price;
	
	public Latte(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

//�Ƹ޸�ī�� Ŭ���� - ��ü ����2
class Americano extends Coffee {
	private int price;
	
	public Americano(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

//ȣ�� Ŭ����(����)
public class FactoryPattern {
	public static void main(String[] args) {
		// TODO ���丮 ����
		
		Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
		Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
		System.out.println("Factory latte ::"+latte);
		System.out.println("Factory ame ::"+ame);
	}
}
