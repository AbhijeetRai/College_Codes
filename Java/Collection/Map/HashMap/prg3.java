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

                Set<String> keys = collection.keySet();

                for(String key : keys) {

                        System.out.println(key);
                        HashMap<String,String> entry = collection.get(key);
                        System.out.println(entry.values());
                }
        }
}
