#include <iostream>
using namespace std;

class Event {

	string eventType = "New Year";
	string loc = "FC Road";
	double budget = 225.00;

	public :

	Event() {

		cout << "No arguments" << endl;
	}

	Event(int a) {

		cout << "Parametrised" << endl;
	}
};

int main() {

	Event obj1;
	Event obj(10);
	Event obj2{10};
}

