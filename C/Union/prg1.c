#include<stdio.h>

union data1 {

        int val1;
        double val2;
};

int main(int argc, char *argv[]) {

        //in 'union data1', largest type is double.
        //double is of 8 bytes. At a time, we can accomodate
        //int or double both in those 8 bytes. Thus size of union data1 is 8 bytes.
        printf("%ld\n", sizeof(union data1));

        union data2 {

                char arr[10];
                double val2;
        };

        //In union data2, primitve types are single char from array or double.
        //Among which double is largest. Size of double is 8. Then size of union
        //could have been 8 as well. To accomodate double value. But 10 characters won't
        //be accomodated in those 8 bytes. Thus, size is 8 x 2 = 16.
        printf("%ld\n", sizeof(union data2));

        return 0;
}
