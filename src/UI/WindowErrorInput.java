package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowErrorInput extends JFrame {

    public WindowErrorInput(){

        System.out.println("WindowErrorInput called");

        JFrame frame = new JFrame();
        JLabel text = new JLabel();
        JLabel subText = new JLabel();

        text.setText(" ¡ Valor INGRESADO NO VALIDO ! ");
        text.setFont(new Font("consolas", Font.BOLD,13));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setVerticalAlignment(JLabel.CENTER);
        text.setBounds(5,5,365,30);

        subText.setText("no se permiten 'letras' ni 'caracteres especiales' ");
        subText.setFont(new Font("consolas", Font.PLAIN,11));
        subText.setHorizontalAlignment(JLabel.CENTER);
        subText.setVerticalAlignment(JLabel.CENTER);
        subText.setBounds(5,25,365,30);

        frame.setSize(370, 125);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.add(text);
        frame.add(subText);

    }
}
