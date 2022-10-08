package InterfacesGraficas.MouseTrackerFrame;

import javax.swing.JFrame;
public class RatonTracker {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(800, 600);
        mouseTrackerFrame.setVisible(true);
    }
}
