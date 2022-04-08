#include<iostream>

class Parent {

        int x = 10;
        public:
                int y = 20;

                Parent() {

                        std :: cout   << "In parent constructor " << std :: endl;
                }

                void display() {

                        std :: cout << "In display";
                        std :: cout << x << std :: endl;
                        std :: cout << y << std :: endl;
                }
};

class Child : public Parent {

        int a = 10;
        public:
                int b = 20;

                Child() {

                        std :: cout   << "In child constructor " << std :: endl;
                }

                void print() {

                        std :: cout << "In print";
                        std :: cout << a << std :: endl;
                        std :: cout << b << std :: endl;
                }
};

int main() {

        Parent obj1;
        Child obj2;
}
