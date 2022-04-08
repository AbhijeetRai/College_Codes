/**
 * A program demonstrating enum
 */

 #include<stdio.h>

 void main() {

         enum week {Mon,Tue,Wed,Thu,Fri,Sat,Sun};

         enum week day;

         day = Sun;

         printf("%d\n",day);
         printf("%d\n",Sun);

         for(int i = Wed; i <= Fri; i++) {

                 printf("%d\n",i);
         }
 }
