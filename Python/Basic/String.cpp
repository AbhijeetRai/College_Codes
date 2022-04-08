#include<iostream>
//using namespace std;

class Event {

	public :

	std :: string name = "Abhijeet";

	void fun() {

		std :: string work;
		std :: cout << name << "\n";
		std :: cout << "Enter the profession\n";
		std :: cin >> work;
		std :: cout << "The profession is :" << work << "\n"; 

	}
};

int main() {

	Event e;
	e.fun();
}