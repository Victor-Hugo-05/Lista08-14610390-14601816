package ex1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FatorialView {
    private JFrame frame;
    private JTextField numeroField;
    private JLabel resultadoLabel;
    private FatorialController controller;

    public FatorialView(FatorialController controller) {
        this.controller = controller;
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Calculadora de Fatorial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(null);

        JLabel numeroLabel = new JLabel("Digite um número:");
        numeroLabel.setBounds(10, 20, 120, 25);
        frame.add(numeroLabel);

        numeroField = new JTextField();
        numeroField.setBounds(150, 20, 100, 25);
        frame.add(numeroField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 60, 240, 25);
        frame.add(calcularButton);

        resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(10, 100, 240, 25);
        frame.add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFatorial();
            }
        });

        frame.setVisible(true);
    }

    private void calcularFatorial() {
        try {
            int numero = Integer.parseInt(numeroField.getText());
            long resultado = controller.calcularFatorial(numero);
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Por favor, digite um número inteiro válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        FatorialController controller = new FatorialController();
        new FatorialView(controller);
    }
}
