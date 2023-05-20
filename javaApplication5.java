import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class javaApplication5 extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JComboBox<String> comboBox;
    private JList<String> list;
    private JTextArea textArea;
    private JProgressBar progressBar;

    public javaApplication5() {
        // Configuración básica de la ventana
        setTitle("Ejemplo de Interfaz Gráfica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 1. JTextField: Campo de texto
        textField = new JTextField(10);
        add(textField);

        // 2. JButton: Botón
        button = new JButton("Aceptar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                JOptionPane.showMessageDialog(null, "Texto ingresado: " + input);
            }
        });
        add(button);

        // 3. JLabel: Etiqueta
        label = new JLabel("Etiqueta");
        add(label);

        // 4. JCheckBox: Casilla de verificación
        checkBox = new JCheckBox("Casilla de verificación");
        add(checkBox);

        // 5. JRadioButton: Botón de opción
        radioButton = new JRadioButton("Opción");
        add(radioButton);

        // 6. JComboBox: Lista desplegable
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        comboBox = new JComboBox<>(opciones);
        add(comboBox);

        // 7. JList: Lista
        String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3"};
        list = new JList<>(elementos);
        add(list);

        // 8. JTextArea: Área de texto
        textArea = new JTextArea(5, 20);
        add(textArea);

        // 9. JProgressBar: Barra de progreso
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        add(progressBar);

        // 10. JOptionPane: Cuadro de diálogo
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Botón presionado!");
            }
        });

        // Configuración final de la ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new javaApplication5();
            }
        });
    }
}