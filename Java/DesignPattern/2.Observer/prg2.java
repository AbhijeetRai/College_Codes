// Implementation of Observer design pattern at Core2Web Technologies

import java.util.LinkedList;
interface Subject {

	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

class Portion implements Subject {

	private LinkedList<Observer> observers = new LinkedList<Observer> ();
	private String recentTopic;
	private int totalTopicsTaught;

	public void addObserver(Observer o) {

		observers.add(o);
	}

	public void removeObserver(Observer o) {

		observers.remove(observers.indexOf(o));
	}

	public void notifyObservers() {

		for(Observer o : observers) {

			o.update(recentTopic, totalTopicsTaught);
		}
	}

	void setPortion(String recentTopic, int totalTopicsTaught) {

		this.recentTopic = recentTopic;
		this.totalTopicsTaught = totalTopicsTaught;

		notifyObservers();
	}
}

interface Observer {

	void update(String recentTopic, int totalTopicsTaught);
}

class Aditya_Kashid implements Observer {

	private Portion monitor;
	private String recentTopic;
	private int totalTopicsTaught;

	Aditya_Kashid(Portion monitor) {

		this.monitor = monitor;
		monitor.addObserver(this);
	}

	public void update(String recentTopic, int totalTopicsTaught) {

		this.recentTopic = recentTopic;
		this.totalTopicsTaught = totalTopicsTaught;

		display();
	}

	void display() {

			System.out.println(this.getClass() + " says total " + totalTopicsTaught + " topics have been taught");
			System.out.println("Recent topic was " + recentTopic + "\n");
	}
}

class Sachin_Patil implements Observer {

	private Portion monitor;
	private String recentTopic;
	private int totalTopicsTaught;

	Sachin_Patil(Portion monitor) {

		this.monitor = monitor;
		monitor.addObserver(this);
	}

	public void update(String recentTopic, int totalTopicsTaught) {

		this.recentTopic = recentTopic;
		this.totalTopicsTaught = totalTopicsTaught;

		display();
	}

	void display() {

			System.out.println(this.getClass() + " says total " + totalTopicsTaught + " topics have been taught");
			System.out.println("Recent topic was " + recentTopic + "\n");
	}
}

class Main {

	public static void main(String[] args) {
		
		Portion teach = new Portion();

		Aditya_Kashid aditya_Kashid = new Aditya_Kashid(teach);
		Sachin_Patil sachin_Patil = new Sachin_Patil(teach); 

		teach.setPortion("Inheritace", 6);

		teach.removeObserver(sachin_Patil);

		teach.setPortion("Abstract class", 9);
	}
}