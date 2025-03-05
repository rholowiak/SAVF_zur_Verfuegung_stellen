import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SAVF_zur_Verfuegung_stellen {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Input Text into Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JLabel
        JLabel label = new JLabel("Enter text below:");

        // Create a JTextField
        JTextField textField = new JTextField(20);

        // Create a JButton
        JButton button = new JButton("Submit");

        // Create a JLabel for validation messages
        JLabel validationLabel = new JLabel();

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();

                /*
                //Define the regex pattern for the specific formats "ZRHOLOWIAK/OL009966|ZRHOLOWIAK/OL009966H1|BDVISAVH1/SL78442|BDVISAVH1/SL79172H1|BDVISAVH1/SL78442new"
                //String patternString = "^[A-Za-z]{10}+/[A-Za-z]{2}+[0-9]{6}|[A-Za-z]{10}+/[A-Za-z]{2}+[0-9]{6}+[A-Za-z]{1}+[0-9]{1}|[A-Za-z]{8}+[0-9]{1}+/[A-Za-z]{2}+[0-9]{5}|[A-Za-z]{8}+[0-9]{1}+/[A-Za-z]{2}+[0-9]{5}+[A-Za-z]{1}+[0-9]{1}|[A-Za-z]{8}+[0-9]{1}+/[A-Za-z]{2}+[0-9]{5}+[A-Za-z]{3}+$";
                //Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
                //Matcher matcher = pattern.matcher(inputText);
                //poniżej używam klasy RegexSample
                */
                boolean patternString = RegexSample.useRegex(inputText);

                // Check if the input text matches the pattern
                if (patternString) {
                    label.setText(inputText);
                    validationLabel.setText("Valid input.");
                } else {
                    validationLabel.setText("Invalid input. Please try again.");
                }
            }
        });

        // Create a JPanel and add components to it
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(validationLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}