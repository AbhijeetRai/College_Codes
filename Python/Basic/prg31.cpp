#include<iostream>

class StaticDemo {

        public:
        int x = 10;

        //In class intialisation of static variable is not allowed,
        //either declare it constant or intialise it outside the class 
        static int y = 20;

        void m1() {

                std :: cout << x << std :: endl;
                std :: cout << y << std :: endl;
        }
};

int main() {

        StaticDemo obj1;
        StaticDemo obj2;

        std :: cout << obj1.x << std :: endl;
        std :: cout << obj1.y << std :: endl;
}
