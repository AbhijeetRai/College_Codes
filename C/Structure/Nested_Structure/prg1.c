#include <stdio.h>

struct frontend {
	
	int teamsize;
	char tech[20];
};

struct backend {
	
	int teamsize;
	char tech[20];
};

struct devops {
	
	int teamsize;
	char service[20];
};


struct company {
	
	struct frontend fend;
	struct backend bend;
	struct devops dops;
}BiEncaps;

int main(int argc, char *argv[]) {
		
	printf("Enter teamsize of frontend and technology\n");
	scanf("%d %s", &BiEncaps.fend.teamsize, BiEncaps.fend.tech);
	printf("%d %s\n", BiEncaps.fend.teamsize, BiEncaps.fend.tech);
	
	printf("Enter teamsize of backend and technology\n");
	scanf("%d %s", &BiEncaps.bend.teamsize, BiEncaps.bend.tech);
	printf("%d %s\n", BiEncaps.bend.teamsize, BiEncaps.bend.tech);

	printf("Enter teamsize of devops and service provider\n");
	scanf("%d %s", &BiEncaps.dops.teamsize, BiEncaps.dops.service);
	printf("%d %s\n", BiEncaps.dops.teamsize, BiEncaps.dops.service);

	return 0;
}
