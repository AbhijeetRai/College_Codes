#include<iostream>

class Parent {

        int x = 10;
        public:
                int y = 20;
                void display() {

                        std :: cout << "In display";
                }
};

class Child : public Parent {

        int a = 10;
        public:
                int b = 20;
                void print() {

                        std :: cout << "In print";
                }
};

int main() {

        Child obj1;
        Parent obj2;
        obj1.print();
        obj2.display();
        // obj1.x Error - private within this context;
}
