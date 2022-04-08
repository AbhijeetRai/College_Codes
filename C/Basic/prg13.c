void main() {

        int age = 21;
        char gender = 'M';
        float height = 6.1;
        double weight = 75.5;

        int cnt1 = printf("SIZE of int %ld\n",sizeof(age));
        int cnt2 = printf("SIZE of char %ld\n",sizeof(gender));
        int cnt3 = printf("SIZE of float %ld\n",sizeof(height));
        int cnt4 = printf("SIZE of double %ld\n",sizeof(weight));

        printf("\n");

        int a = printf("%d\n",cnt1);
        printf("%d\n",cnt2);
        printf("%d\n",cnt3);
        printf("%d\n",cnt4);


        printf("\n");

        printf("%d\n",age);
        printf("%c\n",gender);
        printf("%.1f\n",height);
        printf("%.1lf\n",weight);
}
