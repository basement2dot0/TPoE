package com.basement2dot0.tpoe.com.basement2dot0.tpoe.menus.screens;

import com.badlogic.gdx.scenes.scene2d.ui.*;

public class LoginMenu extends Table {
    private Skin skin;
    private Label lblUsername;
    private Label lblPassword;
    private TextField txtUsername;
    private TextField txtPassword;
    private TextButton btnLogin;
    private TextButton btnRegister;

    public LoginMenu(Skin skin)
    {
        this.skin = skin;
        this.setFillParent(true);
        initializeLayout();
        addComponentsToLayout();

    }

    private void initializeLayout() {
        lblUsername = new Label("Username:", skin);
        txtUsername = new TextField("", skin);

        lblPassword = new Label("Password:", skin);
        txtPassword = new TextField("", skin);
        txtPassword.setPasswordCharacter('*');
        txtPassword.setPasswordMode(true);

        btnLogin = new TextButton("Login", skin);
        btnRegister = new TextButton("Register", skin);

    }

    private void addComponentsToLayout() {
        this.add(lblUsername).pad(5);
        this.add(txtUsername).pad(5).width(200);
        this.row();
        this.add(lblPassword).pad(5);
        this.add(txtPassword).pad(5).width(200);
        this.row();
        this.add(btnLogin).width(150).pad(5).padTop(20);
        this.add(btnRegister).width(150).pad(5).padTop(20).width(200);
    }

    public TextField getUsername()
    {
        return txtUsername;
    }

    public TextField getPassword()
    {
        return txtPassword;
    }

    public TextButton getBtnLogin()
    {
        return btnLogin;
    }

    public TextButton getBtnRegister()
    {
        return btnRegister;
    }
}
