package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.PLAIN;

public class PainelNumeros extends JPanel implements ActionListener
{

    private final JTextField txtText;

    public PainelNumeros(JTextField txtText)
    {
        this.txtText =                  txtText;

        setLayout                       (new GridLayout(4,3));
        setBackground                   (Color.gray);


        JButton btn9 =                  new JButton("7");
        btn9.                           addActionListener(this);
        add                             (btn9);

        JButton btn8 =                  new JButton("8");
        btn8.                           addActionListener(this);
        add                             (btn8);

        JButton btn7 =                  new JButton("9");
        btn7.                           addActionListener(this);
        add                             (btn7);

        JButton btn6 =                  new JButton("4");
        btn6.                           addActionListener(this);
        add                             (btn6);

        JButton btn5 =                  new JButton("5");
        btn5.                           addActionListener(this);
        add                             (btn5);

        JButton btn4 =                  new JButton("6");
        btn4.                           addActionListener(this);
        add                             (btn4);

        JButton btn3 =                  new JButton("1");
        btn3.                           addActionListener(this);
        add                             (btn3);

        JButton btn2 =                  new JButton("2");
        btn2.                           addActionListener(this);
        add                             (btn2);

        JButton btn1 =                  new JButton("3");
        btn1.                           addActionListener(this);
        add                             (btn1);

        JButton btnVazio =              new JButton();
        btnVazio.                       setEnabled(false);
        add                             (btnVazio);

        JButton btn0 =                  new JButton("0");
        btn0.                           addActionListener(this);
        add                             (btn0);

        JButton btnPonto =              new JButton(".");
        btnPonto.                       addActionListener(this);
        add                             (btnPonto);

        btn9.                               setFont(new Font("Arial",PLAIN,20));
        btn8.                               setFont(new Font("Arial",PLAIN,20));
        btn7.                               setFont(new Font("Arial",PLAIN,20));
        btn6.                               setFont(new Font("Arial",PLAIN,20));
        btn5.                               setFont(new Font("Arial",PLAIN,20));
        btn4.                               setFont(new Font("Arial",PLAIN,20));
        btn3.                               setFont(new Font("Arial",PLAIN,20));
        btn2.                               setFont(new Font("Arial",PLAIN,20));
        btn1.                               setFont(new Font("Arial",PLAIN,20));
        btn0.                               setFont(new Font("Arial",PLAIN,20));
        btnPonto.                           setFont(new Font("Arial",PLAIN,20));

        btn9.                               setBackground(Color.LIGHT_GRAY);
        btn8.                               setBackground(Color.LIGHT_GRAY);
        btn7.                               setBackground(Color.LIGHT_GRAY);
        btn6.                               setBackground(Color.LIGHT_GRAY);
        btn5.                               setBackground(Color.LIGHT_GRAY);
        btn4.                               setBackground(Color.LIGHT_GRAY);
        btn3.                               setBackground(Color.LIGHT_GRAY);
        btn2.                               setBackground(Color.LIGHT_GRAY);
        btn1.                               setBackground(Color.LIGHT_GRAY);
        btn0.                               setBackground(Color.LIGHT_GRAY);
        btnPonto.                           setBackground(Color.LIGHT_GRAY);
        btnVazio.                           setBackground(Color.LIGHT_GRAY);



    }

    @Override
    public void actionPerformed(ActionEvent EnviarNumerosParaACalculadora)
    {

        if(txtText.getText().length() == 20)
        {
            return;
        }

        JButton btn =                       (JButton) EnviarNumerosParaACalculadora.getSource();
        String number =                     btn.getText();
        txtText.                            setText(txtText.getText() + number);

    }
}
