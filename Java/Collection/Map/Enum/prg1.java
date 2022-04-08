import java.util.*;

enum Colors {

	Red,
	Blue,
	Yellow,
	Green
}


class Demo {

	public static void main(String[] args) {
		
		//takes .class file as parameter
		EnumMap m = new EnumMap(Colors.class);

		m.put(Colors.Red,"Laal");
		m.put(Colors.Blue,"Neela");
		m.put(Colors.Yellow,"Peela");
		m.put(Colors.Green,"Hara");

		System.out.println(m.containsKey(Colors.Red));
		System.out.println(m.containsKey("Red"));
		System.out.println(m.containsValue("Red"));
		System.out.println("Laal rang hai ? " + m.containsValue("Laal"));

		System.out.println(m + "\n The size is " + m.size());
	}
}