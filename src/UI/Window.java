package UI;
import Back.BtnCopy;
import Back.Check;
import Back.Logica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Window extends JFrame implements ActionListener{

    //COMPONENTES DE LA VENTANA
    private JFrame frame = new JFrame();
    private static JLabel title = new JLabel();
    private static JLabel dateLabel = new JLabel();
    private static JComboBox list1;
    private static JComboBox list2;
    private static JTextField input = new JTextField();
    private static JTextField output = new JTextField();
    protected static JButton btn = new JButton("Convertir");
    private static JButton btnCopy = new JButton("Copy");
    //valor de los comboBox / list1 y list2
    public final String monedas[] = {" * Seleccione una opción * ", "$ - Peso Colombiano", "$ - Dolar Estadounidense", "€ - Euro", "£ - Libra Esterlina", "¥ - Yen Japones", "¥ - Yuan Chino", "₩ - Won Koreano", "₽ - Rublo Ruso"};

    /*constructor*/
    public Window() {
    //ESTILOS DE LOS COMPONENTES

        /*titulo*/
        title.setText("CONVERSOR DE MONEDA");
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.LEFT);
        title.setBounds(5,5, 300, 15);
        title.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        /*label*/
        dateLabel.setText("Bienvenido...");
        dateLabel.setVerticalAlignment(JLabel.CENTER);
        dateLabel.setHorizontalAlignment(JLabel.LEFT);
        dateLabel.setBounds(15, 25,400,15);
        dateLabel.setFont(new Font("Times New Roman", Font.ITALIC, 15));

        /*comboBox 1 */
        list1 = new JComboBox(monedas);
        list1.setBounds(15, 45, 160, 25 );

        /*comboBox 2 */
        list2 = new JComboBox(monedas);
        list2.setBounds(15, 75, 160, 25 );

        /*input*/
        input.setName("input");
        input.setText("0");
        input.setBounds(180, 45, 150, 25);

        /*output*/
        output.setName("output");
        output.setEditable(false);
        output.setText("0000");
        output.setBounds(180, 75, 150, 25);
        /*botón convertir*/
        btn.addActionListener(this);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btn.setBounds(15,115,160,30);

        /*botón copiar*/
        btnCopy.addActionListener(this);
        btnCopy.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnCopy.setBounds(180,115,150,30);

        /*frame*/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360, 200);
        this.setTitle("");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

    //ADICIÓN DE COMPONENTES
        this.add(title);
        this.add(dateLabel);
        this.add(list1);
        this.add(list2);
        this.add(input);
        this.add(output);
        this.add(btn);
        this.add(btnCopy);
    }
    //METODO actionPerformed
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnCopy) {
            BtnCopy.copy(output.getText());
        }
        if(e.getSource() == btn) {
            boolean a = Check.ValidarCBox(list1.getSelectedIndex(), list2.getSelectedIndex());//Validacion DE CheckBox
            boolean b = Check.ValidarInput(getInputValue());//Validacion del Input

            if(a && b){
                BigDecimal salida =  Logica.convercion(list1.getSelectedIndex(), list2.getSelectedIndex(), Double.parseDouble(input.getText()));//Convercion
                output.setText(String.valueOf(salida));//Mostrando salida
            }

        }
    };

    //MÉTODOS GET
    public int getList1Value() {
        return list1.getSelectedIndex();
    }

    public int getList2Value() {
        return list2.getSelectedIndex();
    }

    public String getInputValue() {
        return input.getText();
    }

    public static String getOutputValue() {
        return output.getText();
    }

    //MÉTODOS SET
    public static void setDateLabelText(String text) {
        dateLabel.setText(text);
    }

    public static void  setOutputValue(BigDecimal outputValue){
        output.setText(String.valueOf(outputValue));
    }

}
