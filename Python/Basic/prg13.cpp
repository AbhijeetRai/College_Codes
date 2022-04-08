#include<iostream>
using namespace std;

class Samadhan {

	public :
		void fun(int a) {

			cout << "In fun int" << endl;
		}

		void fun(float f) {

			cout << "In fun float" << endl;
		}
};

int main() {

	Samadhan obj;

	obj.fun(10);
	obj.fun(10.5f);
}