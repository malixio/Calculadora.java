import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultadoField;
    private JComboBox<String> operacionesCombo;

    public Calculadora() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Componentes
        JLabel num1Label = new JLabel("Número 1:");
        num1Field = new JTextField();
        JLabel num2Label = new JLabel("Número 2:");
        num2Field = new JTextField();
        JLabel operacionLabel = new JLabel("Operación:");
        String[] operaciones = {"Suma", "Resta", "Multiplicación", "División",
                "Módulo", "Potencia", "Raíz Cuadrada", "Factorial"};
        operacionesCombo = new JComboBox<>(operaciones);
        JButton calcularButton = new JButton("Calcular");
        JButton limpiarButton = new JButton("Limpiar");
        JLabel resultadoLabel = new JLabel("Resultado:");
        resultadoField = new JTextField();
        resultadoField.setEditable(false);

        // Listeners
        calcularButton.addActionListener(this);
        limpiarButton.addActionListener(e -> {
            num1Field.setText("");
            num2Field.setText("");
            resultadoField.setText("");
        });

        // Añadir componentes a la ventana
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(operacionLabel);
        add(operacionesCombo);
        add(calcularButton);
        add(limpiarButton);
        add(resultadoLabel);
        add(resultadoField);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = 0;
            if (operacionesCombo.getSelectedIndex() != 6 && operacionesCombo.getSelectedIndex() != 7) {
                num2 = Double.parseDouble(num2Field.getText());
            }

            int operacion = operacionesCombo.getSelectedIndex();
            double resultado = 0;

            switch (operacion) {
                case 0: // Suma
                    resultado = num1 + num2;
                    break;
                case 1: // Resta
                    resultado = num1 - num2;
                    break;
                case 2: // Multiplicación
                    resultado = num1 * num2;
                    break;
                case 3: // División
                    if (num2 == 0) throw new ArithmeticException();
                    resultado = num1 / num2;
                    break;
                case 4: // Módulo
                    resultado = (int) num1 % (int) num2;
                    break;
                case 5: // Potencia
                    resultado = Math.pow(num1, num2);
                    break;
                case 6: // Raíz Cuadrada
                    if (num1 < 0) throw new ArithmeticException();
                    resultado = Math.sqrt(num1);
                    break;
                case 7: // Factorial
                    if (num1 < 0) throw new ArithmeticException();
                    resultado = factorial((int) num1);
                    break;
            }

            resultadoField.setText(String.valueOf(resultado));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Entrada inválida", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Operación imposible", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private long factorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}