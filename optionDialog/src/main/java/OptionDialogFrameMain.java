import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/21.
 */
public class OptionDialogFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new OptionDialogFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Option Dialog Frame Main");
            frame.setVisible(true);
        });
    }
}
