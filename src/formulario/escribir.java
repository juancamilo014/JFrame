
import javax.swing.*;
import java.awt.event.*;

public class escribir extends JFrame implements ActionListener, KeyListener {

    protected JTextField JTextField1 , JTextField2;//Atributos
    protected JLabel label1, label2, label3;
    protected JButton boton1;

    public escribir() {//constructor
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
        JTextField1.addKeyListener(this);//coloca la condicion del caracter a evaluar
        this.JTextField2 = new JTextField();
        this.JTextField2.setBounds(120, 40, 150, 20);
        add(JTextField2);
        JTextField2.addKeyListener(this);//coloca la condicion del caracter a evaluar

        boton1 = new JButton("sumar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);//evento para dar click y mostrar resultado

    }

    public void actionPerformed(ActionEvent evt) {

        if (evt.getSource() == boton1) {
            int valor1 = 0, valor2 = 0, resultado = 0;
            valor1 = Integer.parseInt(JTextField1.getText());
            valor2 = Integer.parseInt(JTextField2.getText());
            resultado = valor1 + valor2;
            label3.setText("Resultado:" + resultado);

        }

    }

    @Override
    public void keyTyped(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo Numero");
        }
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public static void main(String[] args) {
        escribir formulario1 = new escribir();
        formulario1.setBounds(0, 0, 300, 150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}
