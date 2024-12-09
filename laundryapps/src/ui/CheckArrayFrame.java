package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CheckArrayFrame extends JFrame {
    private JTextField inputField;
    private JTextField indexField;
    private ArrayList<Integer> data = new ArrayList<>();
    private JLabel lblA; 
    
    public CheckArrayFrame() {
    	getContentPane().setBackground(new Color(204, 204, 255));
    	getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
        setTitle("MainFrame");
        setSize(403, 353);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inputField = new JTextField(20);
        inputField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        inputField.setBounds(48, 71, 181, 28);
        JButton simpanButton = new JButton("Simpan");
        simpanButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        simpanButton.setBounds(237, 73, 90, 23);
        JButton checkButton = new JButton("Check ");
        checkButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        checkButton.setBounds(237, 154, 90, 23);
        indexField = new JTextField(5);
        indexField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        indexField.setBounds(183, 155, 46, 20);
        getContentPane().setLayout(null);
        
        JLabel label = new JLabel("Masukkan Data");
        label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        label.setBounds(48, 46, 118, 14);
        getContentPane().add(label);
        getContentPane().add(inputField);
        getContentPane().add(simpanButton);
        JLabel label_1 = new JLabel("Data:");
        label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        label_1.setBounds(48, 110, 77, 14);
        getContentPane().add(label_1);
        
        lblA = new JLabel(""); 
        lblA.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblA.setBounds(89, 96, 238, 41); 
        getContentPane().add(lblA);
        
        JLabel label_2 = new JLabel("Check array ke-");
        label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        label_2.setBounds(48, 158, 118, 14);
        getContentPane().add(label_2);
        getContentPane().add(indexField);
        getContentPane().add(checkButton);
        
        JLabel lblA_1 = new JLabel("Hasil index ke-");
        lblA_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblA_1.setBounds(48, 194, 231, 14);
        getContentPane().add(lblA_1);
        
        simpanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputText = inputField.getText();
                    String[] numbers = inputText.split(",");
                    for (String num : numbers) {
                        data.add(Integer.parseInt(num.trim()));
                    }
                    lblA.setText(data.toString()); 
                    inputField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CheckArrayFrame.this, "Input tidak valid, pastikan hanya bilangan bulat.");
                }
            }
        });
        
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(indexField.getText());
                    int value = data.get(index); 
                    lblA_1.setText("Hasil index ke-" + index + " adalah " + value);
                } catch (IndexOutOfBoundsException ex) {
                    lblA_1.setText("Exception Caught: Index tidak valid.");
                } catch (NumberFormatException ex) {
                    lblA_1.setText("Input index harus berupa angka.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CheckArrayFrame().setVisible(true);
            }
        });
    }
}
