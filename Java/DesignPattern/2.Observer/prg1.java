import java.util.ArrayList;

interface Subject {

	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

class LiveCricketMatch implements Subject {

	ArrayList<Observer> observers = new ArrayList<Observer> ();
	int runs;
	double over;
	double runRate;

	public void addObserver(Observer o) {

		observers.add(o);
	}

	public void removeObserver(Observer o) {

		observers.remove(observers.indexOf(o));
	}

	public void notifyObservers() {

		for(Observer o : observers)
			o.update(runs, over, runRate);
	}

	public void setScore(int runs, double over, double runRate) {

		this.runs = runs;
		this.over = over;
		this.runRate = runRate;

		notifyObservers();
	}
}

interface Observer {

	void update(int runs, double over, double runRate);
}

class HotStar implements Observer {

	int runs;
	double over;
	double runRate;
	LiveCricketMatch broadCast;

	HotStar(LiveCricketMatch broadCast) {

		this.broadCast = broadCast;
		broadCast.addObserver(this);
	}

	public void update(int runs, double over, double runRate) {

		this.runs = runs;
		this.over = over;
		this.runRate = runRate;

		display();
	}

	void display() {

		System.out.println("HotStar --> \n" + "Runs = " + runs + "\nOvers = " + over + "\nRun Rate = " + runRate + "\n");
	}
}

class CriccBuzz implements Observer {

	int runs;
	double over;
	double runRate;
	LiveCricketMatch broadCast;

	CriccBuzz(LiveCricketMatch broadCast) {

		this.broadCast = broadCast;
		broadCast.addObserver(this);
	}

	public void update(int runs, double over, double runRate) {

		this.runs = runs;
		this.over = over;
		this.runRate = runRate;

		display();
	}

	void display() {

		System.out.println("CriccBuzz --> \n" + "Runs = " + runs + "\nOvers = " + over + "\nRun Rate = " + runRate + "\n");
	}
}

class Main {

	public static void main(String[] args) {

		LiveCricketMatch broadCast = new LiveCricketMatch();

		HotStar hotStar = new HotStar(broadCast);
		CriccBuzz criccBuzz = new CriccBuzz(broadCast);

		broadCast.setScore(120, 6, 20);
	}
}
