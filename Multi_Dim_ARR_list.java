import java.util.Scanner;
import java.util.ArrayList;
public class Multi_Dim_ARR_list {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // initialisation
    for(int i=0;i<3;i++){
        list.add(new ArrayList<>());
    }

    // add element
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(s.nextInt());
            }
        }

        System.out.println(list);

    }

}
