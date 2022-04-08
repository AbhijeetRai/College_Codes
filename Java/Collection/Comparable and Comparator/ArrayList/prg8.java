import java.io.*;
import java.util.*;

class Demo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken().trim();
        int score = Integer.parseInt(st.nextToken().trim());

        System.out.println(name + " " + score);
    }
}