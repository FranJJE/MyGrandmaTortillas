package main.view.frames;

import main.view.components.JLabelLogo;
import main.view.components.JPanelBackground;
import main.view.fonts.CustomFont;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.util.ArrayList;

public class SignupFrame extends JFrame
{
    /*--------------------- SignUp Window ---------------------*/
        public final JPanel signupPanel;
            public final JLabelLogo logoLabel;
            public final JLabel userLabel;
            public final JTextField userField;
            public final JLabel passLabel;
            public final JTextField passField;
            public final JLabel confirmPassLabel;
            public final JTextField confirmPassField;
            public final JLabel nameLabel;
            public final JTextField nameField;
            public final JLabel lastnameLabel;
            public final JTextField lastnameField;
            public final JLabel birthLabel;
            public final JTextField birthField;
            public final JLabel emailLabel;
            public final JTextField emailField;
            public final JButton createUserButton;
            public final JButton cancelButton;

        public final ArrayList<JTextField> textFieldsArr = new ArrayList<>();

    public SignupFrame()
    {
        /*--------------------- Logo ---------------------*/
        logoLabel = new JLabelLogo("src\\main\\view\\images\\logo.png");
        logoLabel.setBounds(0,0,500,50);
        logoLabel.setPreferredSize( new Dimension(300,50));
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        /*--------------------- Field 1 ---------------------*/
        userLabel = new JLabel("Username");
        userLabel.setBounds(20,70,200,30);
        userField = new JTextField();
        userField.setBounds(200,70,260,30);
        textFieldsArr.add(userField);

        /*--------------------- Field 2 ---------------------*/
        passLabel = new JLabel("Password");
        passLabel.setBounds(20,120,200,30);
        passField = new JPasswordField();
        passField.setBounds(200,120,260,30);
        textFieldsArr.add(passField);

        /*--------------------- Field 3 ---------------------*/
        confirmPassLabel = new JLabel("Confirm password");
        confirmPassLabel.setBounds(20,170,200,30);
        confirmPassField = new JPasswordField();
        confirmPassField.setBounds(200,170,260,30);

        /*--------------------- Field 4 ---------------------*/
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(20,220,200,30);
        nameField = new JTextField();
        nameField.setBounds(200,220,260,30);
        textFieldsArr.add(nameField);

        /*--------------------- Field 5 ---------------------*/
        lastnameLabel = new JLabel("Last name");
        lastnameLabel.setBounds(20,270,200,30);
        lastnameField = new JTextField();
        lastnameField.setBounds(200,270,260,30);
        textFieldsArr.add(lastnameField);

        /*--------------------- Field 6 ---------------------*/
        birthLabel = new JLabel("Date of birth");
        birthLabel.setBounds(20,320,200,30);
        try {
            birthField = new JFormattedTextField( new MaskFormatter("## - ## - ####"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        birthField.setBounds(200,320,260,30);
        birthField.setHorizontalAlignment(JTextField.CENTER);
        textFieldsArr.add(birthField);

        /*--------------------- Field 7 ---------------------*/
        emailLabel = new JLabel("Contact email");
        emailLabel.setBounds(20,370,200,30);
        emailField = new JTextField();
        emailField.setBounds(200,370,260,30);
        textFieldsArr.add(emailField);

        /*--------------------- Buttons ---------------------*/
        createUserButton = new JButton("Create");
        createUserButton.setBounds(250-150,430,100,50);
        createUserButton.setBackground(Color.white);
        createUserButton.setOpaque(false);
        createUserButton.setFocusPainted(false);
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(250+50,430,100,50);
        cancelButton.setBackground(Color.white);
        cancelButton.setOpaque(false);
        cancelButton.setFocusPainted(false);

        /*--------------------- Panel registro ---------------------*/
        signupPanel = new JPanelBackground("src\\main\\view\\images\\signupBG.jpg");
        signupPanel.setLayout(null);
        signupPanel.setPreferredSize( new Dimension(500,500));
        signupPanel.add(logoLabel);
        signupPanel.add(userLabel);
        signupPanel.add(userField);
        signupPanel.add(passLabel);
        signupPanel.add(passField);
        signupPanel.add(nameLabel);
        signupPanel.add(nameField);
        signupPanel.add(lastnameLabel);
        signupPanel.add(lastnameField);
        signupPanel.add(birthLabel);
        signupPanel.add(birthField);
        signupPanel.add(emailLabel);
        signupPanel.add(emailField);
        signupPanel.add(confirmPassLabel);
        signupPanel.add(confirmPassField);
        signupPanel.add(createUserButton);
        signupPanel.add(cancelButton);

        for(Component c : signupPanel.getComponents())
        {
            if(c instanceof JLabel || c instanceof JButton)
            {
                c.setForeground(Color.white);
            }
            if(c instanceof JTextField)
            {
                ((JTextField) c).setMargin( new Insets(0,10,0,0));
            }
            c.setFont( CustomFont.coolvetica(18) );
        }

        /*--------------------- Ventana registro ---------------------*/
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(signupPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(false);
    }
}
