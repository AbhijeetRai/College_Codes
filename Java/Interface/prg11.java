/*
 * In interface we can write
 *
 * default
 * static
 * private
 * private static

 * methods, along with by default public abstract method. But however, be careful to static and no static access rules
 * calls breaking the rules, below, are commented for good.
 */



interface GoodMan {

	default void leadAvengers() {

		returnStones();
		wooSharon();
		wooPeggy();
	}

	static void returnStones() {

		//leadAvengers();
		//wooSharon();
		wooPeggy();
	}

	private void wooSharon() {

		leadAvengers();
		returnStones();
		wooPeggy();
	}

	private static void wooPeggy() {

		leadAvengers();
		returnStones();
		//wooSharon();
	}
}
