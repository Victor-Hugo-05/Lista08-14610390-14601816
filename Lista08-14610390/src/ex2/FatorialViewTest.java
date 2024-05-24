package ex2;
import javax.swing.*;


public class FatorialViewTest {
    
    public static void main(String [] args){
        FatorialView fatorialView = new FatorialView();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                fatorialView.show();
            }
        });
    }
}
