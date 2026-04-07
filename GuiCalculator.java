import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiCalculator {
    // Main method to run the calculator
    private static double firstNumber = 0;
    private static String operator = "";
    private static boolean startNewNumber = true;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("My GUI Calculator");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a panel for the display
        JTextField screen = new JTextField(0);
        screen.setEditable(false); // Make the screen non-editable
        screen.setFont(new Font("Monospaced", Font.BOLD, 35));
        screen.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(screen, BorderLayout.NORTH);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 4 rows, 4 columns, with gaps between buttons

        // Add buttons to the panel
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Set the background color of the button panel
        Color darkGray = new Color(50, 50, 50);
        Color lightGray = new Color(80, 80, 80);
        Color purple = new Color(128, 0, 128);


        // Create and add buttons to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Impact", Font.BOLD, 20));

        //style the buttons based on their type
            if ("0123456789".contains(label)) {
                button.setBackground(lightGray);
                button.setForeground(Color.WHITE);
            } else if ("/*+-" . contains(label)) {
                button.setBackground(purple);
                button.setForeground(Color.WHITE);
            } else { // Clear and equals buttons
                button.setBackground(darkGray);
                button.setForeground(Color.WHITE);
            }

            button.setOpaque(true);
            button.setBorderPainted(false);

        // Add action listeners to the buttons 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if("0123456789".contains(command)) {
                    if (startNewNumber) {
                        screen.setText(command);
                        startNewNumber = false;
                    } else {
                        screen.setText(screen.getText() + command);
                    }
                } else if (command.equals("C")) {
                    screen.setText("0");
                    firstNumber = 0;
                    startNewNumber = true;
                } else if (command.equals("=")) {
                    double secondNumber = Double.parseDouble(screen.getText());
                    double result = calculate(firstNumber, secondNumber, operator);
                    screen.setText(String.valueOf(result));
                    startNewNumber = true;
                } else { // Operator button
                    firstNumber = Double.parseDouble(screen.getText());
                    operator = command;
                    startNewNumber = true;
                }
            }
        });
        buttonPanel.add(button);

    }

        // Add the button panel to the frame
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
}
    
    private static double calculate(double n1, double n2, String operator) {
        switch (operator) {
            case "+" -> { return n1 + n2; }
            case "-" -> { return n1 - n2; }
            case "*" -> { return n1 * n2; }
            case "/" -> { return (n2 != 0) ? n1 / n2 : 0; }
            default -> { return n2; }
        }
    }
}