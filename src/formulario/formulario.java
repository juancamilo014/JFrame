import javax.swing.*;
import java.awt.event.*;

public class formulario extends JFrame implements ActionListener {

    private JTextField num1, num2;
    private JLabel label1, label2, label3;
    private JButton boton1;

    public formulario() {
        setLayout(null);
        label1 = new JLabel("Num1:");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Num2:");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado: ");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

        num1 = new JTextField();
        num1.setBounds(120, 10, 150, 20);
        add(num1);

        num2 = new JTextField();
        num2.setBounds(120, 40, 150, 20);
        add(num2);

        boton1 = new JButton("SUMAR");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbox1KeyTyped(evt);
            }
        });

    }

    private void tbox1KeyTyped(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Solo numeros.");

        }
    }

//Creamos un nuevo envento:
    public void actionPerformed(ActionEvent ev) {
        if(num1.getText().length()==(0) || num2.getText().length() == (0)){
            JOptionPane.showMessageDialog(null, "Ingrese el numero");
        }
        else
        if (ev.getSource() == boton1) {
            int n1 = 0, n2 = 0, r = 0;
            n1 = Integer.parseInt(num1.getText());
            n2 = Integer.parseInt(num1.getText());
            r = n1 + n2;
            label3.setText("Resultado: " + r);

        }
    }

    public static void main(String[] args) {
        formulario suma2 = new formulario();
        suma2.setBounds(0, 0, 300, 160);
        suma2.setVisible(true);
        suma2.setResizable(false);
        suma2.setLocationRelativeTo(null);
    }

}
