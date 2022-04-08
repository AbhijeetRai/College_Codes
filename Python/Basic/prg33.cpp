#include<iostream>

class StaticDemo {

        public:
        int x = 10;

        //In class intialisation of static variable is not allowed,
        //either declare it constant or intialise it outside the class
        static int y;

        void m1() {

                std :: cout << x << std :: endl;
                std :: cout << y << std :: endl;
        }
};

int StaticDemo :: y = 20;

int main() {

        StaticDemo obj1;
        StaticDemo obj2;

        obj1.x++;
        obj1.y++;

        std :: cout << obj2.x << std :: endl;
        std :: cout << obj2.y << std :: endl;
}
