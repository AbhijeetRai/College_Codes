#include<iostream>
using namespace std;

class Company {
        int b = 20;
public:
        void project() {

                cout << "C/C++\n";
        }
};

class Employee : public Company {
        int a = 10;
public:
        void project() {

                cout << "Python\n";
        }
};

int main() {

        Employee e;
        Company c;
        cout << sizeof(e) << sizeof(c) << endl;

        c.project();
}
