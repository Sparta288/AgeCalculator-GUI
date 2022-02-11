import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {


    public static class AgeCalculator extends JFrame implements ActionListener {

        TextField textField;
        JLabel label;

        public AgeCalculator(){
            initUI();
        }

        private void initUI() {
            setTitle("Age Calculator");
            setSize(300, 200);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            // controls
            JButton calculateButton = new JButton("Calculate Age");
            calculateButton.addActionListener(this);
            textField = new TextField("Enter your year of birth: ", 10);
            label = new JLabel("");
            // container
            Box box = Box.createVerticalBox();
            box.add(textField);
            box.add(Box.createVerticalStrut(25));
            box.add(calculateButton);
            box.add(Box.createVerticalStrut(25));
            box.add(label);
            getContentPane().add(box, BorderLayout.CENTER);
            getContentPane().setSize(300, 200);
        }

        public static void main(String[] args){
            AgeCalculator calculator = new AgeCalculator();
            calculator.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String data = textField.getText();
            data = data.replace("Enter your year of birth: ", "");
            int year = Integer.valueOf(data);
            label.setText("Your age is: " + (2021 - year));
        }
    }
}
