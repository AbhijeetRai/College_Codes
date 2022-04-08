#include <iostream>
using namespace std;

class Ghar {

	int tv = 200;

	public :

	Ghar(int tv) {

		cout << "One argument" << endl;
		cout << tv << endl;
		cout << this -> tv << endl;
	}

	void print() {

		cout << tv << endl;
	}
};

int main() {

	Ghar obj(5000);
	obj.print();
}