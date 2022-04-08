import java.util.*;

class HashMapDemo {

        public static void main(String[] args) {

                HashMap<String,HashMap> collection = new HashMap<String,HashMap> ();


                HashMap<String,String> shahJaahan = new HashMap<String,String> ();
                HashMap<String,String> humayun = new HashMap<String,String> ();

                shahJaahan.put("ShahJahan","Mumtaz");
                humayun.put("Akbar","Humayun");

                collection.put("Taj Mahal",shahJaahan);
                collection.put("Humayun ka makabra",humayun);

                Set<Map.Entry<String,HashMap>> entries = collection.entrySet();

                for(Map.Entry<String,HashMap> oneEntry : entries) {

                        System.out.print(oneEntry.getKey() + "  ");
                        HashMap m = oneEntry.getValue();

                        Collection<String> value = m.values();

                        for(String oneValue : value) {

                                System.out.println(oneValue);
                        } 
                }
        }
}
