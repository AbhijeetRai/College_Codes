/**
 * Address aur pointer comparison me, pointer k value ya address k value ka itna significance nahi hai. 
 * Bas left hand side aur right hand side ke, pointer aur address ka data type dekhna compare karne ke lie.
 * Value ko ignore kar dena.
 */ 

void main() {

    int a = 10;
    int *ptr1 = &a;

    char b = 'B';
    char *ptr2 = &b;

    //address of int compared with address of char
    &a == &b;

    //integer pointer compared to character pointer
    ptr1 == ptr2;

    ptr2 = &a;
    //bhale hi ptr2 me int ka address hai ab, value k rup me, but hai to wo ptr2 pointer 'char' type ka hi. 
    //char pointer aur int address not comparable, regardless of value
    ptr2 == &a;

    char c = 'C';
    //bhale hi ptr2 int k taraf dekh raha hai. Hai to wo char pointer hi, islie char address se compare ho jaaega.
    ptr2 == &c;
}