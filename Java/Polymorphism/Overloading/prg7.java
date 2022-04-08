class Custom1 {

        void fun(int a, int b) {

        }

        void gun(int a, int b) {

        }

        void fun(int a, float f) {

        }

        void fun(int ai, int bi) {

        }
}

/**
 * A method table is prepared for every class, during compilation.

        Custom1                                                 Custom2
        fun(int, int)                                           fun(int, int)
        gun(int, int)
        fun(int, float)
        fun(int, int)                   <-ONLY ISSUE IN PROGRAM

        A method signature consists of name of method, type, sequence and number of parameters.
        A method signature should be "UNIQUE IN CLASS".

        fun(int, int) of Custom1 does not clash with fun(int, int) of Custom2 because they are in different classes.
        fun(int, int) of Custom1 does not clash with gun(int, int) because they have unqiue method signature.
        Even name of method is part of method signature

        But fun(int, int) of Custom1 will clash with fun(int, int) of Custom1. Because of same method signature
 */

class Custom2 {

        void fun(int a, int b) {

        }
}
