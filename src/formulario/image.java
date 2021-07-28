import javax.swing.*;

public class image {

    public static void main(String[] args) {//para poner una imagen

        JFrame f = new JFrame();
        JLayeredPane lp = new JLayeredPane();
        JPanel jp = new JPanel();
        JLabel l = new JLabel();
        ImageIcon img = new ImageIcon("triggerhora.png");//colocar la ruta de imagen

//Set the basic properties of JFrame
        f.setSize(400, 500);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        l.setIcon(img);

//Set the middle panel
        jp.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        jp.add(l);

//Add jp to lp and set it at the bottom.
        lp.add(jp, JLayeredPane.DEFAULT_LAYER);

        f.setLayeredPane(lp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
