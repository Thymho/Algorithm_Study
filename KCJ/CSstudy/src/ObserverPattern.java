import java.util.List;
import java.util.ArrayList;

interface Subject {
	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObservers();
	public Object getUpdate(Observer obj);
}

interface Observer {
	public void update();
}


//주체이자 객체 (객체인 이유: interface를 재정의해서 구현하기 때문에)
class Topic implements Subject {
	private List<Observer> observers;
	private String message;
	
	public Topic() {
		this.observers = new ArrayList<>();
		this.message = "";
	}

	@Override
	public void register(Observer obj) {
		if(!observers.contains(obj)) {
			observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(Observer::update);
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message sended to Topic: " + msg);
		this.message = msg;
		notifyObservers();
	}
}

//옵저버 코드
class TopicSubscriber implements Observer {
	private String name;
	private Subject topic;
	
	public TopicSubscriber(String name, Subject topic) {
		this.name = name;
		this.topic = topic;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		System.out.println(name+ ":: got message >> "+msg);
	}
}

public class ObserverPattern {
	public static void main(String[] args) {
		// 옵저버 패턴
		
		Topic topic = new Topic();
		Observer a = new TopicSubscriber("a", topic);
		Observer b = new TopicSubscriber("b", topic);
		Observer c = new TopicSubscriber("c", topic);
		
		topic.register(a);
		topic.register(b);
		topic.register(c);
		
		topic.postMessage("amumu is op champion!!");
	}
}