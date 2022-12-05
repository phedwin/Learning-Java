import java.io.IOException;
//1
class OuterClass {
    int x = 1320;

    class InnerClass {
        int y = 25;
    }
}

public class access {
    public static void main(String[] args)  throws IOException {
        OuterClass outer =  new OuterClass();
        OuterClass.InnerClass inside = outer.new InnerClass();

        System.out.println(outer.x+ inside.y);
    }
}