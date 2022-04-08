import java.util.*;

class MetroCity {

        String name;
        int metroinaguration;

        MetroCity(String name,int metroinaguration) {

                this.name = name;
                this.metroinaguration = metroinaguration;
        }

        public String toString() {

                return name + " " + metroinaguration;
        }
}

class SortByYear implements Comparator<MetroCity> {

        public int compare (MetroCity city1, MetroCity city2) {

                return city1.metroinaguration - city2.metroinaguration;
        }
}

class Demo {

        public static void main(String[] args) {

                ArrayList<MetroCity> metroCities = new ArrayList<MetroCity> ();
                metroCities.add(new MetroCity("Pune",2020));
                metroCities.add(new MetroCity("Kolkata",1984));
                metroCities.add(new MetroCity("Mumbai",2014));

                System.out.println("Before sorting\n" + metroCities + "\n");

                Collections.sort(metroCities, new SortByYear());

                System.out.println("After sorting\n" + metroCities + "\n");
        }
}
