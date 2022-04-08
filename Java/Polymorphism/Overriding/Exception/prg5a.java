import java.io.*;

class FrenchRevolution {

        void name() throws IOException {

        }
}
/**
 * "throwing 'child of what parent method has thrown'", in child method, is okay.
 * EOFException is child of IOException
 */
class HaitianRevolution extends FrenchRevolution {

        void name() throws EOFException {

        }
}
