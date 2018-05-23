package com.basement2dot0.tpoe.com.basement2dot0.tpoe.menus.screens;

import com.badlogic.gdx.scenes.scene2d.ui.*;

public class RegisterMenu extends Table {

    private Skin skin;

    private Label usernameLabel;
    private TextField usernameField;
    private Label passwordLabel;
    private TextField passwordField;
    private Label repeat_passwordLabel;
    private TextField repeat_passwordField;
    private Label emailLabel;
    private TextField emailField;

    private TextButton submit;
    private TextButton back;

    public RegisterMenu(Skin skin)
    {
        this.skin = skin;
        this.setFillParent(true);
        initializeComponents();
        addComponents();
    }

    public void initializeComponents()
    {
        usernameLabel = new Label("Username", skin);
        usernameField = new TextField("", skin);

        passwordLabel = new Label("Password", skin);
        passwordField = new TextField("", skin);
        passwordField.setPasswordCharacter('*');
        passwordField.setPasswordMode(true);

        repeat_passwordLabel = new Label("Repeat Password", skin);
        repeat_passwordField = new TextField("", skin);
        repeat_passwordField.setPasswordCharacter('*');
        repeat_passwordField.setPasswordMode(true);

        emailLabel = new Label("Email", skin);
        emailField = new TextField("", skin);

        submit = new TextButton("Register", skin);
        back = new TextButton("Back", skin);
    }

    public void addComponents(){
        this.add(usernameLabel).pad(5);
        this.add(usernameField).pad(5).width(200);
        this.row();
        this.add(passwordLabel).pad(5);
        this.add(passwordField).pad(5).width(200);
        this.row();
        this.add(repeat_passwordLabel).pad(5);
        this.add(repeat_passwordField).pad(5).width(200);
        this.row();
        this.add(emailLabel).pad(5);
        this.add(emailField).pad(5).width(200);
        this.row();
        this.add(back).width(150).pad(5).padTop(20);
        this.add(submit).width(150).pad(5).padTop(20).width(200);
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public TextField getEmailField() {
        return emailField;
    }

    public TextButton getSubmit() {
        return submit;
    }

    public TextButton getBack() {
        return back;
    }

    public TextField getRepeat_passwordField() {
        return repeat_passwordField;
    }
}
