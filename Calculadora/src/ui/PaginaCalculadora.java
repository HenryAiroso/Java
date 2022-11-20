package ui;

import javax.swing.*;
import java.awt.*;

import static javax.swing.UIManager.setLookAndFeel;

public class PaginaCalculadora extends JFrame{

    public PaginaCalculadora() throws Exception {
        super("Calculator");

        setLookAndFeel                  ("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        setDefaultCloseOperation        (EXIT_ON_CLOSE);
        setSize                         (400,550);
        setLocation                     (400,200);

        setLayout                       (new BorderLayout());
        TextPanel textPanel =           new TextPanel();
        add                             (BorderLayout.NORTH, textPanel);

        JPanel digitsPanel =            new JPanel();
        digitsPanel.setLayout           (new BorderLayout());

        digitsPanel.add                 (BorderLayout.CENTER, new PainelNumeros(textPanel.getTxtNumber()));
        digitsPanel.add                 (BorderLayout.EAST, new PainelDeOperacoes(textPanel.getTxtNumber()));


        add                             (BorderLayout.CENTER, digitsPanel);

        setVisible(true);
    }

}
