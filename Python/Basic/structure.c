#include<stdio.h>

struct Employee {

        char * cName;
        char * eName;
        int eId;
        int sal;
}obj1 = {"BiEncaps","Shashi",5,50000};

void main() {

        struct Employee obj2 = {"BiEncaps","Pramod Sir",3,1000};

        printf("%s\n",obj1.cName);
        printf("%s\n",obj1.eName);
        printf("%d\n",obj1.eId);
        printf("%d\n",obj1.sal);

        fun(&obj2);
}

void fun(struct Employee *a) {

	    printf("%s\n",a->cName);
        printf("%s\n",a->eName);
        printf("%d\n",a->eId);
        printf("%d\n",a->sal);
}
