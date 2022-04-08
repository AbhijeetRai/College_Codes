class FrenchRevolution {

        void name() throws ArrayIndexOutOfBoundsException {

        }
}
/**
 * Although child method cannot throw, larger class than, what parent method has thrown.
 * But in this case IndexOutOfBoundsException is unchecked exception, so compiler is not aware of
 * IndexOutOfBoundsException being larger, as it is unchecked
 */
class HaitianRevolution extends FrenchRevolution {

        void name() throws IndexOutOfBoundsException {

        }
}
