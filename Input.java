import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        // arrays of primitive
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=25;
        arr[2]=22;
        arr[3]=35;
        arr[4]=322;
        //[23,25,22,35,322]
        System.out.println(arr[3]);

        // input using for loops
//        System.out.println("Enter the element of array: ");
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i] = s.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        /*
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
        for(int j : arr ){  // for every element in array , print the element
            System.out.print(j+" ");// here j represents element of the array

            System.out.println(arr[5]); // index out of bound error
        }   */


        // array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++)
        {
            str[i] = s.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1]="kunal"; // changing the original object

        System.out.println(Arrays.toString(str));
     }
}
