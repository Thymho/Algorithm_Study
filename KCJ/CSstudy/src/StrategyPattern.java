import java.text.DecimalFormat;
import java.util.*;

//������ ����
interface PaymentStrategy {
	public void pay(int amount);
}

//���� ��ü ����1
class KAKAOCardStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}
	
	//����1 - ������� Ư�� ���� ����
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using KAKAOCard.");
	}
}

//���� ��ü ����2
class LUNACardStrategy implements PaymentStrategy {
	private String emailId;
	private String password;
	
	public LUNACardStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	
	//����2 - ������� Ư�� ���� ����
	@Override
	public void pay(int amount) {
		System.out.println(amount+" paid using LUNACard.");
	}
	
}

class Item {
	private String name;
	private int price;
	
	public Item(String name, int cost) {
		this.name = name;
		this.price = cost;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class ShoppingCart {
	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public int calculateTotal() {
		int sum = 0;
		
		for(Item item : items) {
			sum += item.getPrice();
		}
		
		return sum;
	}
	
	//������� Ư�� �ൿ ����
	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		// ���� ����
		ShoppingCart cart = new ShoppingCart();
		
		Item A = new Item("kundolA", 100);
		Item B = new Item("kundolB", 300);
		
		cart.addItem(A);
		cart.addItem(B);
		
		//pay by LUNACard (���� 1)
		cart.pay(new LUNACardStrategy("kundol@example.com", "pukubababo"));
		
		//pay by KAKAOCard (���� 2)
		cart.pay(new KAKAOCardStrategy("Ju hongchul", "123456789", "123", "12/01"));
	}
}