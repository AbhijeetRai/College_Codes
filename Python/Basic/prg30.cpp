#include<iostream>
using namespace std;

class Company {

        public:
                void project() {

                        cout << "C/C++\n";
                }
};

class Employee : public Company {

        public:
                void project() {

                        cout << "Python\n";
                }
};

int main() {

        Company *obj = new Company();
        Company *obj1 = new Employee();
        Employee *obj2 = new Employee();
        //invalid conversion - Employee *obj3 = new Company();

        obj -> project();
        obj1 -> project();
        obj2 -> project();
}
