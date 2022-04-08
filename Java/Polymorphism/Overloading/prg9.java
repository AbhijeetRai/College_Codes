import java.io.*;
class Demo {

        void fun(int a) {

        }
        //method signature is same for both, which is, fun(int) & fun(int)
        //as return type is not part of method signature
        int fun(int c) {

                return 1;
        }

        void gun(char c) throws IOException {

        }
        //method signature is both for same that is gun(char c), because thrown exception is not part of method signature
        void gun(char c) {

        }

        void run() throws ArithmeticException {

        }
        //method signature is same, that is 'run()'. Thrown exception not part of method signature, thus not part of method table
        void run() throws IndexOutOfBoundsException {

        }
}
