package InterfacesGraficas.MultipleSelectionFrame;

import javax.swing.JFrame;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350,140);
        multipleSelectionFrame.setVisible(true);
    }
}
