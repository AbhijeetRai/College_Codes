#include<iostream>
using namespace std;

class BritishMonarchy {

        public:
        BritishMonarchy() {

                cout << "BritishMonarchy default\n";
        }

        BritishMonarchy(int a) {

                cout << "BritishMonarchy para\n";
        }
};

class BritishConstitution:public BritishMonarchy {

        public:
        BritishConstitution() {

                cout << "BritishConstitution default\n";
        }

        BritishConstitution(int a) {

                cout << "BritishConstitution para\n";
        }
};

class IndianConstitution:public BritishConstitution {

        public:
        IndianConstitution() {

                cout << "IndianConstitution defaut\n";
        }

        IndianConstitution(int a) {

                cout << "IndianConstitution para\n";
        }
};

int main() {

        IndianConstitution c1;
        IndianConstitution c2(10);
}
