import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }

        System.out.println(list);
    }
}
