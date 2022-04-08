#include<iostream>

class GoldMine {

        private:
                int gold = 10000;

        public:

                std :: string place = "SonBhadra";

                GoldMine() {

                        std :: cout << "In Constructor" << std :: endl;
                }

                GoldMine(int a) {

                        std :: cout << "In Para" << std :: endl;
                }

                GoldMine(GoldMine& cpy) {

                        std :: cout << "In Copy" << std :: endl;
                }
};

int main() {

        GoldMine Obj1;
        //Error - GoldMine Obj2 = 20;
        GoldMine obj2(29);
        GoldMine Obj3 = Obj1;
}
