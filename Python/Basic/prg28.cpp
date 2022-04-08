#include<iostream>
using namespace std;

class Employee {

        public:
                string name;
                Employee() {

                        cout << "In default Emp" << endl;
                }
                Employee(string name) {

                        cout << "name is " << name << endl;
                        this -> name = name;
                }
};

class Company {

        public:
                int id;
                Company() {

                        cout << "In default Cmp" << endl;
                }
                Company(int id) {

                        cout << "barnch is " << id << endl;
                        this -> id = id;
                }

                void info(Employee e) {

                        cout << e.name << endl;
                        cout << id << endl;
                }
};

int main() {

        Employee e("Shardul");
        Company c(1);
        c.info(e);
        return 0;
}
