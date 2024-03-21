import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SimpleFrame extends Frame {
    SimpleFrame(String s){
        super(s);
        setSize(400, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SimpleFrame("Моя программа");
    }

}
