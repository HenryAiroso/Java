package ui;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;
import static java.awt.Font.PLAIN;

public class TextPanel extends JPanel
{

    private final           JTextField txtNumber;

    public TextPanel()
    {
        setLayout           (new FlowLayout());
        setBackground       (gray);

        txtNumber=          new JTextField(15);
        txtNumber.          setForeground(black);
        txtNumber.          setHorizontalAlignment(JTextField.RIGHT);
        txtNumber.          setEnabled(false);
        txtNumber.          setFont(new Font("Arial",PLAIN,30));
        txtNumber.          setBackground(lightGray);

        add(txtNumber);

    }

    public JTextField getTxtNumber()
    {
        return txtNumber;
    }

}
