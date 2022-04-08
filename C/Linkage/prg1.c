void fun();

int main(int argc, char const *argv[]) {

        //functions by default have external linkage
        //defining function fun,in prg2.c and calling it
        //from prg1.c. Just compile both programs at once,
        //cc prg1.c prg2.c
        fun();
}
