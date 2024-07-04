import java.util.Arrays;
public class Passing_Function {
    public static void main(String[] args){
        int[] nums ={1,3,423,4,43};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99; //  mutable behaviour : original value will be changed
    }
  //  String are immutable in java
    //  Arrays is mutable in java , mutable : u can change the object
}
