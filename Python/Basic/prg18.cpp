#include<iostream>

class MacD {

        private:
                int x = 10;

        public:
                int y = 20;

        void display() {

                std :: cout << "In Display" << std :: endl;
                std :: cout << "X = " << x << std :: endl;
                std :: cout << "Y = " << y << std :: endl;
        }
};

int main() {

        MacD obj;
        //std :: cout << obj.x << std :: endl;
        std :: cout << obj.y << std :: endl;
        obj.display();
}
