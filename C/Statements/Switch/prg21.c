#include<stdio.h>

void main() {

    int floorNo;

    printf("Enter the floor number whether 1 or 2\n");
    scanf("%d", &floorNo);

    switch(floorNo) {

        case 1 :
            printf("Welcome to first floor\n");

            int bedRoom;

            printf("Enter Bed room number whether 1 or 2\n");
            scanf("%d", &bedRoom);

            switch(bedRoom) {

                case 1 :
                    printf("Welcome to bedRoom 1\n");
                    break;

                case 2 :
                    printf("Welcome to bedRoom 2\n");
                    break;

                default :
                    printf("No such bedroom\n");
                    break;
            }
            break;

        case 2 :
            printf("Welcome to second floor\n");

            //int bedRoom;

            printf("Enter Bed room number whether 1 or 2\n");
            scanf("%d", &bedRoom);

            switch(bedRoom) {

                case 1 :
                    printf("Welcome to bedRoom 1\n");
                    break;

                case 2 :
                    printf("Welcome to bedRoom 2\n");
                    break;

                default :
                    printf("No such bedroom\n");
                    break;
                }
            break;


        default :
            printf("No such floor\n");
            break;
    }
}
