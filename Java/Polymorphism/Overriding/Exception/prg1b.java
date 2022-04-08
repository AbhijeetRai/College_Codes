class FrenchRevolution {

        void name() {

        }
}

/**
 * Parent method is not throwing any exception, but child method is throwing Runtime Exception(unchecked).
 * And compiler is not aware of that, thus we got no error
 */

class HaitianRevolution extends FrenchRevolution {

        void name() throws RuntimeException {

        }
}
