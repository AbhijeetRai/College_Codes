#include <stdio.h>

struct company {
	
	struct frontend {
		
		int size;
		char tech[20];
	}fend;

	struct backend {
		
		int size;
		char tech[20];
	}bend;

	struct devops {
		
		int size;
		char tech[20];
	}dops;

}BiEncaps;

int main(int argc, char *argv[]) {

	printf("Enter size and technology of front end team\n");
	scanf("%d %s", &BiEncaps.fend.size, BiEncaps.fend.tech);
	printf("%d %s\n", BiEncaps.fend.size, BiEncaps.fend.tech);

	printf("Enter size and technology of back end team\n");
	scanf("%d %s", &BiEncaps.bend.size, BiEncaps.bend.tech);
	printf("%d %s\n", BiEncaps.bend.size, BiEncaps.bend.tech);

	printf("Enter size and service provider for devops team\n");
	scanf("%d %s", &BiEncaps.dops.size, BiEncaps.dops.tech);
	printf("%d %s\n", BiEncaps.dops.size, BiEncaps.dops.tech);

	return 0;
}
