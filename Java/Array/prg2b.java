import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the number of elements in array");
                int n = Integer.parseInt(br.readLine());

                int arr[] = new int[n];

                System.out.println("The size of array is " + arr.length);
                //\arr.length = 1;                               //length is final variable

                System.out.println("Start putting elements in the array");
                for(int i = 0; i < arr.length; i++)
                        arr[i] = Integer.parseInt(br.readLine());

                System.out.println("The elements are");
                for(int i = 0; i < arr.length; i++)
                        System.out.print(arr[i] + " ");

                System.out.println();
        }
}
