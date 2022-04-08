class FrenchRevolution {

        void name() throws IndexOutOfBoundsException {

        }
}
/**
 * It is okay to throw, (child of), "what parent method has thrown as an exception"
 * as exception in child method.
 * ArrayIndexOutOfBoundsException is child of IndexOutOfBoundsException
 */
class HaitianRevolution extends FrenchRevolution {

        void name() throws ArrayIndexOutOfBoundsException {

        }
}
