class FrenchRevolution {

        void name() throws NullPointerException {

        }
}
/**
 * Throwable is hierarchaly larger than NullPointerException.
 * And throwable is checked exception
 * SO compiler gives error
 */
class HaitianRevolution extends FrenchRevolution {

        void name() throws Throwable {

        }
}
