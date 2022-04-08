#include<iostream>
using namespace std;


class Demo {

	string name;
	int roll;
	string city;

	public :

	void acceptDisplay() {

		cout << "Enter name,roll and city" << endl;
		cin >> name >> roll >> city;
		cout << name << roll << city;
	}
};

int main() {

	Demo d;
	d.acceptDisplay();
	return 0;
}