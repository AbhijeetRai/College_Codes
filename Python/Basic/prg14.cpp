#include<iostream>
using namespace std;

class IPL {

	int numTeam = 0;

	public :
		IPL(int numTeam) {

			cout << "Constructor" << endl;
			cout << numTeam << endl;

			cout << this -> numTeam << endl;
			this -> numTeam = numTeam;

			cout << this -> numTeam << endl;
		}
};

int main() {

	IPL year2k20(8);
}