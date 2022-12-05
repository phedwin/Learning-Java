import java.awt.*;
public class AWTExample {
    AWTExample() {
        Frame fr1=new Frame();
        Label la = new Label("Welcome to the java graphics GEEKSFORGEEKS");
        fr1.add(la);
        fr1.setSize(20, 20);
        fr1.setVisible(true);
    }
    public static void main(String args[])
    {
        AWTExample tw = new AWTExample();
    }
}

