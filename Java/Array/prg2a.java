import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the number of elements in array");
                int n = Integer.parseInt(br.readLine());

                int arr[] = new int[n];

                System.out.println("Start putting elements");
                for(int i = 0; i < n; i++)
                        arr[i] = Integer.parseInt(br.readLine());

                System.out.println("The elements are");
                for(int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");

                System.out.println();
        }
}
