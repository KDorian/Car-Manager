import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame{

    static List list = new List("List of cars");
    static String sBrand;
    static int numOfNode;

    private JButton insertCarButton;
    private JButton printListButton;
    private JButton searchBrandButton;
    private JButton printBrandButton;
    private JButton printNumberOfCarsButton;
    private JButton deleteAllButton;
    private JTextArea TextArea;
    private JPanel panel;
    private JButton setNumberOfNodeButton;
    private JButton printNodeButton;
    private JButton deleteNodeButton;

    public NewJFrame() {
        setContentPane(panel);

        insertCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InsertCar obj = new InsertCar();
                obj.setVisible(true);
                obj.setSize(650,360);
                obj.setResizable(false);
            }
        });

        printListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextArea.setText(list.print().toString());
            }
        });

        searchBrandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchBrand obj = new SearchBrand();
                obj.setVisible(true);
                obj.setResizable(false);
            }
        });

        printBrandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextArea.setText(list.searchBrand(sBrand));
            }
        });

        printNumberOfCarsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = list.numOfCars();
                TextArea.setText(str);
            }
        });

        deleteAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.removeAll();
            }
        });

        setNumberOfNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetNode obj = new SetNode();
                obj.setVisible(true);
                obj.setResizable(false);
            }
        });

        printNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextArea.setText(list.printNode(numOfNode));
            }
        });

        deleteNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.deleteNode(numOfNode)){

                    TextArea.setText("OK!");
                } else {
                    TextArea.setText(("Empty List"));
                }
            }
        });
    }
}
