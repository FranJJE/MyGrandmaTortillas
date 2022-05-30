package main.view.frames;

import main.view.components.JLabelLogo;
import main.view.components.JPanelBackground;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame
{
    /*--------------------- LogIn Window ---------------------*/
    public JPanelBackground loginPanel;
    public JLabelLogo loginTitle;
    public JLabel loginUserLabel;
    public JLabel loginPassLabel;
    public JTextField loginUserField;
    public JPasswordField loginPassField;
    public JButton loginButton;
    public JButton signupButton;

    public LoginFrame()
    {
        initLogin();
    }

    public void initLogin()
    {
        /*--------------------- Etiquetas para el titulo y los campos ---------------------*/
        loginTitle = new JLabelLogo("src\\main\\view\\images\\logo.png");
        loginTitle.setOpaque(false);
        loginTitle.setBounds(250-200,25,400,50);
        loginTitle.setFont( new Font( "SansSerif", Font.BOLD,28));
        loginTitle.setVerticalAlignment(JLabel.CENTER);
        loginTitle.setHorizontalAlignment(JLabel.CENTER);

        loginUserLabel = new JLabel("Username:");
        loginUserLabel.setBounds(50,100,150,35);
        loginUserLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        loginUserLabel.setForeground(Color.white);

        loginPassLabel = new JLabel("Password:");
        loginPassLabel.setBounds(50,150,150,35);
        loginPassLabel.setFont( new Font("SansSerif", Font.BOLD,18));
        loginPassLabel.setForeground(Color.white);

        /*--------------------- Campo de texto para usuario y contraseña ---------------------*/
        loginUserField = new JTextField();
        loginUserField.setBounds(200, 100, 250, 35);
        loginUserField.setBackground(Color.decode("#d5dedd"));
        loginUserField.setMargin(new Insets(0, 10, 0, 0));
        loginUserField.setFont( new Font( "SansSerif", Font.BOLD,18));

        loginPassField = new JPasswordField();
        loginPassField.setBounds(200, 150, 250, 35);
        loginPassField.setMargin(new Insets(0, 10, 0, 0));
        loginPassField.setBackground(Color.decode("#d5dedd"));
        loginPassField.setFont( new Font( "SansSerif", Font.BOLD,18));


        /*--------------------- Botón para enviar la información ---------------------*/
        loginButton = new JButton("Log in");
        loginButton.setBackground(Color.white);
        loginButton.setOpaque(false);
        loginButton.setBounds(50,225,150,50);
        loginButton.setFont( new Font( "SansSerif", Font.BOLD,18));
        loginButton.setFocusPainted(false);
        loginButton.setForeground(Color.white);

        signupButton = new JButton("Sign Up");
        signupButton.setBackground(Color.white);
        signupButton.setOpaque(false);
        signupButton.setBounds(300,225,150,50);
        signupButton.setFont( new Font( "SansSerif", Font.BOLD,18));
        signupButton.setFocusPainted(false);
        signupButton.setForeground(Color.white);

        /*--------------------- Panel login ---------------------*/
        loginPanel = new JPanelBackground("src\\main\\view\\images\\loginBG.jpg");
        loginPanel.setLayout(null);
        loginPanel.setPreferredSize( new Dimension(500,300));
        loginPanel.add(loginTitle);
        loginPanel.add(loginUserLabel);
        loginPanel.add(loginPassLabel);
        loginPanel.add(loginUserField);
        loginPanel.add(loginPassField);
        loginPanel.add(loginButton);
        loginPanel.add(signupButton);


        /*--------------------- Ventana login ---------------------*/
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(loginPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
