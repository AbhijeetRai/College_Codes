import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter number of rows");
                int rows = Integer.parseInt(br.readLine());

                System.out.println("Enter number of columns");
                int columns = Integer.parseInt(br.readLine());

                int arr[][] = new int[rows][columns];

                //number of rows
                System.out.println("Length of arr " + arr.length);

                for(int i = 0; i < arr.length; i++)
                        //length of each column from each row
                        System.out.println("Length of arr[" + i + "] " + arr[i].length);


                //final variable cannot be changed
                //arr.length = 1;
                //arr[0].length = 2;
                //arr[1].length = 5;

                System.out.println("Start putting elements");
                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++)
                                arr[i][j] = Integer.parseInt(br.readLine());
                }

                System.out.println("Elements are");
                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++)
                                System.out.print(arr[i][j] + " ");
                        System.out.println();
                }
        }
}
