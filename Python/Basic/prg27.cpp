#include<iostream>
using namespace std;

class Demo {

        public:
        Demo() {

                cout << "Default constructor" << endl;
        }

        Demo(int a) {

                cout << "Para constructor" << endl;
        }

        void fun() {

                cout << "In fun no parameter" << endl;
        }

        void fun(int a) {

                cout << "In fun parameter" << endl;
        }

        void fun(Demo y) {

                cout << "In obejt" << endl;
        }
};

int main() {

        Demo d;
        d.fun();

        Demo d2(10);
        d2.fun(10);
        d2.fun(d);
}
