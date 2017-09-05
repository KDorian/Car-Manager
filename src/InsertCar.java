import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class InsertCar extends JFrame {
    private JPanel insertCarPanel;
    private JTextField brand;
    private JTextField model;
    private JTextField engine;
    private JTextField power;
    private JTextField price;
    private JTextField doors;
    private JTextField seats;
    private JTextField color;
    private JButton addButton;
    private JButton cancelButton;
    private JLabel mess;

    public InsertCar() {

        setContentPane(insertCarPanel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Car car = new Car();
                String brand1;
                String model1;
                String engine1;
                int power1;
                int price1;
                String doors1;
                String seats1;
                String color1;

                brand1 = brand.getText();
                model1 = model.getText();
                engine1 = engine.getText();
                doors1 = doors.getText();
                seats1 = seats.getText();
                color1 = color.getText();

                if(power.getText().equals("")){

                    power1 = 0;
                } else {

                    power1 = Integer.parseInt(power.getText());
                }

                if(price.getText().equals("")){

                    price1 = 0;
                } else {

                    price1 = Integer.parseInt(price.getText());
                }

                car.setCarSpecs(brand1, model1, engine1, power1, price1, doors1, seats1, color1);

                NewJFrame.list.insertAtFront(car);

                mess.setText("Car added to the list!");
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });

    }
}
