class FrenchRevolution {

        void name() throws Exception {

        }
}
/**
 * "Child method 'cannot throw something which is hierarchaly larger'"
 * than what parent method has thrown as an exception

 * Throwable is parent of Exception, it does not work. Throwable is hierarchaly larger
 * It is not possible that child method throws parent and parent method throws child
 */
class HaitianRevolution extends FrenchRevolution {

        void name() throws Throwable {

        }
}
