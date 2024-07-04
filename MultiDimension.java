import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args){
        /*
                1,2,3
                4,5,6
                7,8,9
         */
        Scanner s = new Scanner(System.in);

//        int[][] arr = new int[3][]; // number of rows is mandatory , columns not
    /*    int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };  */
//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5},  // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr2D[2] ={6,7,8,9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // input

        for(int row=0;row<arr.length;row++){
            for(int col = 0;col <arr[row].length;col++) {
                arr[row][col] = s.nextInt();
            }
        }

        // output
/*
        for(int row=0;row<arr.length;row++){
            for(int col = 0;col <arr[row].length;col++) {
               System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        */

        // o/p
        /*   for(int row=0;row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        */
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
