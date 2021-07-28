
import javax.swing.*;
import java.awt.event.*;

public class sumar extends JFrame implements ActionListener {

    private JTextField JTextField1 , JTextField2;
    private JLabel label1, label2, label3;
    private JButton boton1;

    public sumar() {
        setLayout(null);
        this.label1 = new JLabel("num1:");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("num2:");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado:");
        label3.setBounds(120, 80, 100, 30);
        add(label3);
        this.JTextField1 = new JTextField();
        this.JTextField1.setBounds(120, 10, 150, 30);
        add(JTextField1);
        this.JTextField2 = new JTextField();
        this.JTextField2.setBounds(120, 40, 150, 20);
        add(JTextField2);

        boton1 = new JButton("sumar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
            int valor1 = 0, valor2 = 0, resultado = 0;
            valor1 = Integer.parseInt(JTextField1.getText());
            valor2 = Integer.parseInt(JTextField2.getText());
            resultado = valor1 + valor2;
            label3.setText("Resultado:" + resultado);

        }

    }

    public static void main(String[] args) {
        sumar formulario1 = new sumar();
        formulario1.setBounds(0, 0, 300, 150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}
