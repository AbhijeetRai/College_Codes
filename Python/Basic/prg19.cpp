#include<iostream>

class MacD {

        private:
                int x = 10;

        public:
                MacD() {

                        std :: cout << "In Constructor" << std :: endl;
                }

                MacD(int a) {

                        std :: cout << "In Para" << std :: endl;
                }

                MacD(MacD& cpy) {

                        std :: cout << "In Copy" << std :: endl;
                }

                int y = 20;

                void display() {

                        std :: cout << "In display" << std :: endl;
                        std :: cout << "X = " << x << std :: endl;
                        std :: cout << "Y = " << y << std :: endl;
                }
};

int main() {

        MacD Obj1;
        MacD Obj2(20);
        MacD Obj3 = Obj1;
}
