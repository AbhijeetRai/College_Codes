import java.io.*;

class Demo {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());
        int arr[][] = new int[row][];

        for(int i = 0; i < arr.length; i++) {

            System.out.println("Enter size of " + i + " th row");
            int size = Integer.parseInt(br.readLine());
            arr[i] = new int[size];
        }
    
    //cannot assign length to final variable
       // arr.length = 2;
       // arr[0].length = 3;

       for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) 
                arr[i][j] = Integer.parseInt(br.readLine());
       }

       for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j] + " ");
            System.out.println();
       }
    }
}