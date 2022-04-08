import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Input {

        public static void main(String[] args) {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input = null;
                System.out.println("Please enter name, roll and the city");

                try {

                        input = br.readLine();
                }catch(IOException ioexception) {

                        System.out.println("IOException has occured");
                }

                StringTokenizer tokenizerobject = new StringTokenizer(input);
                String name = tokenizerobject.nextToken();
                String roll = tokenizerobject.nextToken();
                String city = tokenizerobject.nextToken();

                name = name.trim();
                roll = roll.trim();
                city = city.trim();

                int rollno = Integer.parseInt(roll);

                System.out.println(name + " " + roll + " " + city);
        }
}
