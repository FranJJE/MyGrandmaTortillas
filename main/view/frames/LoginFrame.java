package main.view.frames;

import javax.swing.*;
import java.awt.*;

public class LoginFrame
{
    /*--------------------- LogIn Window ---------------------*/
    public JFrame loginFrame;
    public JPanel loginPanel;
    public JLabel loginTitle;
    public JLabel loginUserLabel;
    public JLabel loginPassLabel;
    public JTextField loginUserField;
    public JPasswordField loginPassField;
    public JButton submitButton;
    public JButton signupButton;

    public LoginFrame()
    {
        initLogin();
    }

    public void initLogin()
    {

        /*--------------------- Etiquetas para el titulo y los campos ---------------------*/
        loginTitle = new JLabel("Calculator Log in");
        loginTitle.setBounds(250-200,25,400,50);
        loginTitle.setFont( new Font( "Monospaced", Font.BOLD,28));
        loginTitle.setVerticalAlignment(JLabel.CENTER);
        loginTitle.setHorizontalAlignment(JLabel.CENTER);

        loginUserLabel = new JLabel("User:");
        loginUserLabel.setBounds(50,100,150,35);
        loginUserLabel.setFont( new Font("Monospaced", Font.BOLD,18));

        loginPassLabel = new JLabel("Password:");
        loginPassLabel.setBounds(50,150,150,35);
        loginPassLabel.setFont( new Font("Monospaced", Font.BOLD,18));

        /*--------------------- Campo de texto para usuario y contraseña ---------------------*/
        loginUserField = new JTextField();
        loginUserField.setBounds(200, 100, 250, 35);
        loginUserField.setFont( new Font( "Monospaced", Font.BOLD,18));

        loginPassField = new JPasswordField();
        loginPassField.setBounds(200, 150, 250, 35);
        loginPassField.setFont( new Font( "Monospaced", Font.BOLD,18));


        /*--------------------- Botón para enviar la información ---------------------*/
        submitButton = new JButton("Log in");
        submitButton.setBounds(50,225,150,50);
        submitButton.setFont( new Font( "Monospaced", Font.BOLD,18));
        submitButton.setFocusPainted(false);

        signupButton = new JButton("Sign Up");
        signupButton.setBounds(300,225,150,50);
        signupButton.setFont( new Font( "Monospaced", Font.BOLD,18));
        signupButton.setFocusPainted(false);

        /*--------------------- Panel login ---------------------*/
        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setPreferredSize( new Dimension(500,300));
        loginPanel.add(loginTitle);
        loginPanel.add(loginUserLabel);
        loginPanel.add(loginPassLabel);
        loginPanel.add(loginUserField);
        loginPanel.add(loginPassField);
        loginPanel.add(submitButton);
        loginPanel.add(signupButton);


        /*--------------------- Ventana login ---------------------*/
        loginFrame = new JFrame("Log in");
        loginFrame.setResizable(false);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(loginPanel);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

}
