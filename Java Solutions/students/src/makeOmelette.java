import java.io.IOException;
import java.util.Scanner;

public class makeOmelette   {

    public void variables() throws IOException {
        Scanner scanner = new Scanner(System.in);

        boolean yes = true;

//        scanner.nextBoolean();
        enum spices {
            ONION, TOMATOES/*, OIL, VINEGAR*/
        }

        if(scanner.nextBoolean() == yes)  {

            System.out.println("cooking with " + spices.ONION +" and " + spices.TOMATOES);

        }else  {
            System.out.println("you can\t cook");
        }
    }

    public static void main(String[] args) throws IOException {
        makeOmelette callFun =  new makeOmelette();
        callFun.variables();
    }

}
