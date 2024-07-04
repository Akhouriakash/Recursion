import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        //Syntax
       ArrayList<Integer> list = new ArrayList<>(10);
     /*   list.add(65);
        list.add(6523);
        list.add(652);

      //  System.out.println(list.contains(654));
        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);  */

//        input
        for(int j=0;j<5;j++){
            list.add(s.nextInt());
        }

        // get item at any index
        for(int j=0;j<5;j++){
            System.out.println(list.get(j));  // pass index here , list[index] syntax will not here work here
        }
        System.out.println(list);

    }
}
