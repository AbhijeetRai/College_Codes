import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of row");
                int row = Integer.parseInt(br.readLine());

                System.out.println("Enter number of columns");
                int coloumn = Integer.parseInt(br.readLine());

                int arr[][] = new int[row][coloumn];

                System.out.println("Start putting elements");
                for(int i = 0; i < row; i++) {

                        for(int j = 0; j < coloumn; j++)
                                arr[i][j] = Integer.parseInt(br.readLine());
                }

                System.out.println("The elements are");
                for(int i = 0; i < row; i++) {

                        for(int j = 0; j < coloumn; j++)
                                System.out.print(arr[i][j] + " ");
                        System.out.println();
                }
        }
}
