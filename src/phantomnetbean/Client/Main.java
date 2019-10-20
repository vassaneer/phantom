package phantomnetbean.Client;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGui().setVisible(true);
            }
        });
    }
}
