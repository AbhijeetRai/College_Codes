import java.util.ArrayList;

// This is how an 'idea of Subject' looks like 
interface Subject {

    void addObserver(Observer o); 
    void removeObserver(Observer o); 
    void notifyObservers();
}


// This is the actual Subject 
// If subject changes, other dependent objects will be notified
class LiveCricketMatch implements Subject {


    // The subject will keep track of all of its observers 
    // by storing them in an ArrayList and will notify them one by one
    ArrayList<Observer> observers = new ArrayList<Observer> ();
    
    int runs; 
    double over; 
    double runRate; 

    // A single instance of an 'Observer type' will be passed to this method 
    // that single instance will be added in the array list of all the observers 
    // The subject is responsible to add an observer when required
    public void addObserver(Observer observer) {

        observers.add(observer);
    }


    // A single instance of an 'Observer type' will be passed to this method. 
    // Index of that particular instance will be found and that instance 
    // will be removed from the array list of all the observers. 
    // The subject is responsible to remove an observer when required
    public void removeObserver(Observer observer) {

        observers.remove(observers.indexOf(observer));
    }


    public void notifyObservers() {

        // from the arraylist of all the observers, 
        // get one 'Observer (type)' and update or inform 
        // that observer about the change 
        for(Observer observer : observers)
            observer.update(runs, over, runRate);
    }


    //set the new score
    public void setScore(int runs, double over, double runRate) {

        this.runs = runs; 
        this.over = over; 
        this.runRate = runRate; 

        //once the scoore is updated, time to notify all the observers
        notifyObservers();
    } 
}


// This is how an idea of Observer looks like
interface Observer {

    // accomodate the changes 
    // or newly set score in the concrete Observer, whenever needed 
    void update(int runs, double over, double runRate);
}


class HotStar implements Observer {

    int runs; 
    double over; 
    double runRate; 
    LiveCricketMatch broadCast; //reference to SUBJECT  


    // an instance of Subject LiveCricketMatch will be passed 
    // to the HotStar object, whenever HotStar object is created  
    HotStar(LiveCricketMatch broadCast) {

        // Store subject reference in instance variable of 'this object or observer' 
        // rather than local variable of the method. If 'this object or observer' 
        // has address of subject LiveCricketMatch. 'this object' can register 
        // or unregister itself as an observer, whenever it wants to.
        this.broadCast = broadCast;

        /* 
         * 'this object' says, 
         * "Hey subject of type LiveCricketMatch(variable broadCast)
         * "please add me(this in Java) as your observer"
        */ 
        broadCast.addObserver(this);    
    }

    // The subject LiveCricketMatch will notify this observer, using update method 
    public void update(int runs, double over, double runRate) {

        this.runs = runs; 
        this.over = over; 
        this.runRate = runRate;

        //Once the observer is notified, display the change
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
    LiveCricketMatch broadCast; //reference to SUBJECT  


    // an instance of Subject LiveCricketMatch will be passed 
    // to the CriccBuzz object, whenever CriccBuzz object is created  
    CriccBuzz(LiveCricketMatch broadCast) {

        // Store subject reference in instance variable of 'this object or observer' 
        // rather than local variable of the method. If 'this object or observer' 
        // has address of subject LiveCricketMatch. 'this object' can register 
        // or unregister itself as an observer, whenever it wants to.
        this.broadCast = broadCast;

        /* 
         * 'this object' says, 
         * "Hey subject of type LiveCricketMatch(variable broadCast)
         * "please add me(this in Java) as your observer"
        */ 
        broadCast.addObserver(this);    
    }

    // The subject LiveCricketMatch will notify this observer, using update method 
    public void update(int runs, double over, double runRate) {

        this.runs = runs; 
        this.over = over; 
        this.runRate = runRate;

        //Once the observer is notified, display the change
        display();
    } 

    void display() {

		System.out.println("CriccBuzz --> \n" + "Runs = " + runs + "\nOvers = " + over + "\nRun Rate = " + runRate + "\n");
	}
}


/**
 * Main class has somehow power to make changes in subject LiveCricketMatch 
 * Main class is responsible to change score in LiveCricketMatch 
 * @author Abhijeet Rai
 */
class Main {

	public static void main(String[] args) {

		LiveCricketMatch broadCast = new LiveCricketMatch();

		HotStar hotStar = new HotStar(broadCast);
		CriccBuzz criccBuzz = new CriccBuzz(broadCast);

		broadCast.setScore(120, 6, 20);
	}
}