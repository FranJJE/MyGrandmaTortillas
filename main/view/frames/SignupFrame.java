package main.view.frames;

import javax.swing.*;
import java.awt.*;

public class SignupFrame
{
    /*--------------------- SignUp Window ---------------------*/
    public final JFrame signupFrame;
    public final JPanel signupPanel;
    public final JLabel signupTitle;
    public final JLabel signupUserLabel;
    public final JLabel signupPassLabel;
    public final JLabel signupPass2Label;
    public final JTextField signupUserField;
    public final JPasswordField signupPassField;
    public final JPasswordField signupPass2Field;
    public final JButton createUserButton;
    public final JButton cancelButton;

    public SignupFrame()
    {
        signupTitle = new JLabel("User Sign Up");
        signupTitle.setBounds(250-200,0,400,50);
        signupTitle.setFont( new Font( "Monospaced", Font.BOLD,28));
        signupTitle.setVerticalAlignment(JLabel.CENTER);
        signupTitle.setHorizontalAlignment(JLabel.CENTER);

        signupUserLabel = new JLabel("User:");
        signupUserLabel.setBounds(50,75,150,35);
        signupUserLabel.setFont( new Font("Monospaced", Font.BOLD,18));

        signupPassLabel = new JLabel("Pass:");
        signupPassLabel.setBounds(50,125,150,35);
        signupPassLabel.setFont( new Font("Monospaced", Font.BOLD,18));

        signupPass2Label = new JLabel("Confirm pass:");
        signupPass2Label.setBounds(50,175,150,35);
        signupPass2Label.setFont( new Font("Monospaced", Font.BOLD,18));

        /*--------------------- Campo de texto para usuario y contraseña ---------------------*/
        signupUserField = new JTextField();
        signupUserField.setBounds(200, 75, 250, 35);
        signupUserField.setFont( new Font( "Monospaced", Font.BOLD,18));

        signupPassField = new JPasswordField();
        signupPassField.setBounds(200, 125, 250, 35);
        signupPassField.setFont( new Font( "Monospaced", Font.BOLD,18));

        signupPass2Field = new JPasswordField();
        signupPass2Field.setBounds(200, 175, 250, 35);
        signupPass2Field.setFont( new Font( "Monospaced", Font.BOLD,18));

        /*--------------------- Botón para enviar la información ---------------------*/
        createUserButton = new JButton("Create");
        createUserButton.setBounds(50,225,150,50);
        createUserButton.setFont( new Font( "Monospaced", Font.BOLD,18));
        createUserButton.setFocusPainted(false);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(300,225,150,50);
        cancelButton.setFont( new Font( "Monospaced", Font.BOLD,18));
        cancelButton.setFocusPainted(false);

        /*--------------------- Panel registro ---------------------*/
        signupPanel = new JPanel();
        signupPanel.setLayout(null);
        signupPanel.setPreferredSize( new Dimension(500,300));
        signupPanel.add(signupTitle);
        signupPanel.add(signupUserLabel);
        signupPanel.add(signupPassLabel);
        signupPanel.add(signupPass2Label);
        signupPanel.add(signupUserField);
        signupPanel.add(signupPassField);
        signupPanel.add(signupPass2Field);
        signupPanel.add(createUserButton);
        signupPanel.add(cancelButton);

        /*--------------------- Ventana registro ---------------------*/
        signupFrame = new JFrame("Sign Up");
        signupFrame.setResizable(false);
        signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupFrame.add(signupPanel);
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(false);
    }
}
