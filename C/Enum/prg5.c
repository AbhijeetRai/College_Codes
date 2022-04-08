#include <stdio.h>

enum month {

        jan,
        feb,
        march
};

int main(int argc, char *argv[]) {

        enum month april;       //new independent enum var
        enum month may;         //new independent enum var
        printf("%d %d %d %d %d\n", jan, feb, march, april, may);
}
