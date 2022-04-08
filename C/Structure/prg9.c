typedef struct book {
	
	char name[20];
	int pages;	
	float price;
}book;

void main() {
	
	struct book dp = {"GOF", 500, 625.5};
	book java = {"Head First Java", 400, 600};
}
