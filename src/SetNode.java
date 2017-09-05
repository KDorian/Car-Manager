import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class SetNode extends JFrame {


    private JTextField number;
    private JButton OKButton;
    private JPanel setNodePanel;


    public SetNode() {

        setContentPane(setNodePanel);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(number.getText().equals("")){

                    NewJFrame.numOfNode = 0;
                } else {

                    NewJFrame.numOfNode = Integer.parseInt(number.getText());
                }

                dispose();
            }
        });
    }
}
