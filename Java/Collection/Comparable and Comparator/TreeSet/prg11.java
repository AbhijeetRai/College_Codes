import java.util.*;

class ComparatorWalaClass implements Comparator<TeKLaunde> {

        public int compare(TeKLaunde t1, TeKLaunde t2) {

                return t1.name.compareTo(t2.name);
        }
}

class TeKLaunde {

        String name;

        TeKLaunde(String name) {

                this.name = name;
        }

        public String toString() {

                return name;
        }
}

class Demo {

        public static void main(String[] args) {

                TreeSet s = new TreeSet(new ComparatorWalaClass());
                s.add(new TeKLaunde("Ritesh"));
                s.add(new TeKLaunde("Sujay"));
                s.add(new TeKLaunde("Abhijeet"));
                s.add(new TeKLaunde("Divya"));
                s.add(new TeKLaunde("Abhijeet"));

                System.out.println(s);
        }
}
