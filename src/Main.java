import javax.swing.*;

/**
 * Created by asmalouski on 31.5.15.
 */


public class Main {

    public static void main(String args[]){
        Reader r = new Reader("Title");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setResizable(false);
        r.setSize(200, 200);
        r.setLocationRelativeTo(null);
    }


}
