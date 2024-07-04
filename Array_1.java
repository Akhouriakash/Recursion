public class Array_1 {
        public static void main(String[] args){

            // syntax
            // datatype[] var_name = new datatype[size];
            // store a roll numbers;
            //   int[] rnos = new int[5];
            // or directly
            //  int[] rnos2 = {23,34,3,12,343};

            int[] ros; // declaration of array ros is getting defined in stack
            ros = new int[5];  // intialisation : actually here object is being created in heap

            System.out.println(ros[0]);

            String[] arr = new String[4];
            System.out.println(arr[0]);

            //    String str= null;  // we can only assign to primitive(strored in stack memory)
            //     int num = null;// we cannot assign to non primitive

            for(String element : arr){
                System.out.println(element);
            }
        }
    }

