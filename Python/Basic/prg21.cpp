#include<iostream>

class Core2Web {

        private:
                int x = 30;
                int y = 20;

        public:
                Core2Web() {

                        std :: cout   << "In default" << std :: endl;
                }

                Core2Web(int x) {

                        this -> x = x;
                }

                void display(int x = 50) {

                        std :: cout   << x << std :: endl;
                        std :: cout   << this -> x << std :: endl;
                }
};

int main() {

        Core2Web c;
        Core2Web c2 = 10;
        c2.display();
}
