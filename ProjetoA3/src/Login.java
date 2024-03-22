import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login {

    public static void main(String[] args){
        JFrame frame = new JFrame(); // Cria o frame
        frame.setTitle("Tela de login"); //Define o titulo do frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Finnaliza o programa ao fechar o frame
        frame.setResizable(false);//evita q o usuario altere o size
        frame.setSize(320,320); // seleciona as dimensões x e y do frame
        frame.setVisible(true); // deixa o frame visivel
        frame.getContentPane().setBackground(new Color(0x123456)); //muda a cor de fundo
        frame.setLocationRelativeTo(null);//centraliza o frame


        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Utilizando o GridBagLayout para mais controle sobre o posicionamento dos componentes
        panel.setBackground(new Color(0x123456)); // Definindo a mesma cor de fundo do JFrame

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0, 0, 25, 0); // Margem de 10 pixels à direita do userLabel

        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setForeground(Color.WHITE); // Define a cor do texto do userLabel
        userLabel.setPreferredSize(new Dimension(100, 30)); // Define a altura e largura preferidas do userLabel

        JTextField userField = new JTextField();
        userField.setPreferredSize(new Dimension(150, 30)); // Definindo o tamanho do userField

        JLabel passLabel = new JLabel("Senha:");
        passLabel.setForeground(Color.WHITE); // Define a cor do texto do userLabel
        passLabel.setPreferredSize(new Dimension(100, 30)); // Define a altura e largura preferidas do userLabel

        JPasswordField passField = new JPasswordField();
        passField.setPreferredSize(new Dimension(150, 30)); // Definindo o tamanho do passField        

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(userLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(userField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passField, constraints);

        frame.add(panel, BorderLayout.CENTER); // Adiciona o painel no centro do frame

        // Botão OK
        JButton okButton = new JButton("OK");
        okButton.setBackground(new Color(255,255,255)); // Definindo a mesma cor de fundo do JFrame
        frame.add(okButton, BorderLayout.SOUTH); // Adiciona o botão na parte inferior do frame

        // Adicionando ActionListener ao botão
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Usuário e senha não podem ficar em branco", "Erro", JOptionPane.ERROR_MESSAGE);
                } else if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else if (!username.equals("admin")) {
                    JOptionPane.showMessageDialog(frame, "Usuário incorreto", "Erro", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Senha incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true); // deixa o frame visivel
    }
}
