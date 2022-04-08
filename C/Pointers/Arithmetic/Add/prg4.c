extern int printf(const char *, ...);

int main(void) {

    int arr[5] = {1, 2, 3, 4, 5};
    int *ptr = arr;

    for(int i = 0; i < 5; i++)
        printf("%d ", *(ptr + i));
    printf("\n");
    
    return 0;
}