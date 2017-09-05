import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class SearchBrand extends JFrame{
    private JTextField brand;
    private JButton OKButton;
    private JPanel searchBrandPanel;

    public SearchBrand() {

        setContentPane(searchBrandPanel);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewJFrame.sBrand = brand.getText();

                    dispose();
            }
        });
    }
}
