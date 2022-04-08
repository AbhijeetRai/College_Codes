import java.io.*;

class FrenchRevolution {

        void name() throws EOFException {

        }
}
/**
 * Although RuntimeException is hierachly larger than EOFException, compiler is not aware of.
 * As runtime exception is unchecked
 */
class HaitianRevolution extends FrenchRevolution {

        void name() throws RuntimeException {

        }
}
