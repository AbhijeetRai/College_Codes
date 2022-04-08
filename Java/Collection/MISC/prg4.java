import java.util.*;
import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                Properties p = new Properties();
                FileInputStream fis = new FileInputStream("ABC.Properties");
                p.load(fis);
                System.out.println(p);

                String s = p.getProperty("Vivek");
                System.out.println(s);

                p.setProperty("Yogesg","1234");
                FileOutputStream fos = new FileOutputStream("ABC.Properties");
                p.store(fos,"Stoeed by Abhjeet");
        }
}
