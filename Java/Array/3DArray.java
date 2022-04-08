import java.io.*;

class Demo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrays = 0, rows = 0, columns = 0;

        try {

            System.out.println("Enter number of 2D Arrays");
            arrays = Integer.parseInt(br.readLine());

            System.out.println("Enter number of rows in each 2D Array");
            rows = Integer.parseInt(br.readLine());

            System.out.println("Enter number of columns in each 2D Array");
            columns = Integer.parseInt(br.readLine());
        }catch(IOException object) {

            System.out.println("IOException has occured, buddy!");
        }

        int[][][] arr = new int[arrays][rows][columns];

        System.out.println(arr[0][2].length);

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                for(int k = 0; k < arr[i][j].length; k++)
                    arr[i][j][k] = Integer.parseInt(br.readLine());
            }
        }


        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                for(int k = 0; k < arr[i][j].length; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println("\n");
        }
    }
}