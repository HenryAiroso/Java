package ui;

import modelo.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelDeOperacoes extends JPanel implements ActionListener
{

    Calculadora calculadora =           new Calculadora();

    protected JTextField                txtText;

    protected char                      operacao;
    protected double                    operador1;
    protected double                    operador2;

    protected JButton                   btnAdicao;
    protected JButton                   btnSubtracao;
    protected JButton                   btnMultiplicacao;
    protected JButton                   btnDivisao;
    protected JButton                   btnResultado;
    protected JButton                   btnLimpar;

    public PainelDeOperacoes(JTextField txtText)
    {

        this.txtText =                  txtText;

        setLayout                       (new GridLayout(3,2));
        setBackground                   (Color.gray);

        btnAdicao =                     new JButton("+");
        btnAdicao.                      addActionListener(this);
        add                             (btnAdicao);

        btnSubtracao =                  new JButton("-");
        btnSubtracao.                   addActionListener(this);
        add                             (btnSubtracao);

        btnMultiplicacao =              new JButton("*");
        btnMultiplicacao.               addActionListener(this);
        add                             (btnMultiplicacao);

        btnDivisao =                    new JButton("/");
        btnDivisao.                     addActionListener(this);
        add                             (btnDivisao);

        btnResultado =                  new JButton("=");
        btnResultado.                   addActionListener(this);
        add                             (btnResultado);

        btnLimpar =                     new JButton("C");
        btnLimpar.                      addActionListener(this);
        add                             (btnLimpar);

        btnAdicao.                      setBackground(Color.LIGHT_GRAY);
        btnSubtracao.                   setBackground(Color.LIGHT_GRAY);
        btnDivisao.                     setBackground(Color.LIGHT_GRAY);
        btnMultiplicacao.               setBackground(Color.LIGHT_GRAY);
        btnResultado.                   setBackground(Color.LIGHT_GRAY);
        btnLimpar.                      setBackground(Color.LIGHT_GRAY);


    }

    @Override
    public void actionPerformed(ActionEvent PassandoInformacoesParaCalculadora)
    {

        if(txtText.getText().isEmpty()){
            return;
        }

        JButton btn =                   (JButton) PassandoInformacoesParaCalculadora.getSource();

        if (btn == btnLimpar)
        {
            operacao =                  '\u0000';
            txtText.                    setText("");

        }
        else if(btn == btnResultado)
        {
            operador2 =                 Double.parseDouble(txtText.getText());

            calculadora.                setOperador1(operador1);
            calculadora.                setOperador2(operador2);
            calculadora.                setOperacao(Calculadora.OPERACAO.getOperacaoEscolhidaParaChar(operacao));

            double resultado =          calculadora.calcular();

            txtText.                    setText(String.valueOf(resultado));
            operacao =                  '\u0000';
            operador1 =                 resultado;
            operador2 =                 0;

        }
        else
        {
            operacao =                  btn.getText().charAt(0);
            operador1 =                 Double.parseDouble(txtText.getText());
            txtText.                    setText("");
        }

    }
}