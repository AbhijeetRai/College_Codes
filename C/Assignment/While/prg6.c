/*
 * Formula to find sum of n terms is n / 2 * (a + l) where,
 * n = total number of terms
 * a = first term
 * l = last term
 */
#include<stdio.h>

void main() {
	
	float n;

	printf("Enter upper limit of range\n");
	scanf("%f", &n);

	printf("%.0f\n", n / 2 * (1 + n));
}
