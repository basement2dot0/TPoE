package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;

public class LoginMenu extends WidgetGroup{
    private Skin skin;

    private Label lblUsername;
    private Label lblPassword;
    private Label lblTitle;
    private TextField txtUsername;
    private TextField txtPassword;
    private TextButton btnLogin;
    private TextButton btnAudio;
    private TextButton btnRegister;

    private TextureAtlas buttonAtlas;
    private BitmapFont font;





    public LoginMenu(Skin skin)
    {

        this.skin = skin;
        buttonAtlas = new TextureAtlas(Gdx.files.internal("ui/buttons/button.pack"));
        font = new BitmapFont(Gdx.files.internal("ui/fonts/new.fnt"), false);
        skin.addRegions(buttonAtlas);
        this.setFillParent(true);
        initializeLayout();
        addComponentsToLayout();

    }

    private void initializeLayout()
    {
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.fontColor = Color.WHITE;
        labelStyle.font = font;


        lblTitle = new Label("Pslams of Eia", labelStyle);
        lblTitle.setPosition((Gdx.graphics.getWidth() - lblTitle.getWidth()) / 2.0f, (Gdx.graphics.getHeight() - lblTitle.getHeight()) / 2.0f + 250.0f);

        lblUsername = new Label("Username:", skin);
        lblUsername.setPosition((Gdx.graphics.getWidth() - lblUsername.getWidth()) / 2.0f - 200.0f, (Gdx.graphics.getHeight() - lblUsername.getHeight()) / 2.0f + 30.0f);
        txtUsername = new TextField("", skin);
        txtUsername.setPosition((Gdx.graphics.getWidth() - txtUsername.getWidth()) / 2.0f - 50.0f, (Gdx.graphics.getHeight() - txtUsername.getHeight()) / 2.0f + 30.0f);
        txtUsername.setWidth(300.0f);
        lblPassword = new Label("Password:", skin);
        lblPassword.setPosition((Gdx.graphics.getWidth() - lblPassword.getWidth()) / 2.0f - 200.0f, (Gdx.graphics.getHeight() - lblPassword.getHeight()) / 2.0f - 30.0f);
        txtPassword = new TextField("", skin);
        txtPassword.setPosition((Gdx.graphics.getWidth() - txtPassword.getWidth()) / 2.0f - 50.0f, (Gdx.graphics.getHeight() - txtPassword.getHeight()) / 2.0f - 30.0f);
        txtPassword.setWidth(300.0f);
        txtPassword.setPasswordCharacter('*');
        txtPassword.setPasswordMode(true);

        TextButton.TextButtonStyle buttonStyle = new TextButton.TextButtonStyle();
        buttonStyle.up = skin.getDrawable("buttonOff");
        buttonStyle.down = skin.getDrawable("buttonOn");
        buttonStyle.font = font;

        btnLogin = new TextButton("Login", buttonStyle);
        btnLogin.setPosition((Gdx.graphics.getWidth() - btnLogin.getWidth()) / 2.0f + 20.0f, (Gdx.graphics.getHeight() - btnLogin.getHeight()) / 2.0f + -130.0f);
        //btnLogin.setBounds(10.0f, 10.0f, 200.0f, 200);
        btnAudio = new TextButton("", skin);
        btnAudio.setPosition((Gdx.graphics.getWidth() - btnAudio.getWidth()) / 2.0f + 490.0f, (Gdx.graphics.getHeight() - btnAudio.getHeight()) / 2.0f + 270.0f);
        btnAudio.setSize(50.0f, 50.0f);
        btnRegister = new TextButton("Create Account", buttonStyle);
        btnRegister.setPosition((Gdx.graphics.getWidth() - btnRegister.getWidth()) / 2.0f + 20.0f, (Gdx.graphics.getHeight() - btnRegister.getHeight()) / 2.0f - 250.0f);




    }

    private void addComponentsToLayout()
    {
        this.addActor(lblTitle);
        this.addActor(btnAudio);
        this.addActor(lblUsername);
        this.addActor(txtUsername);
        this.addActor(lblPassword);
        this.addActor(txtPassword);
        this.addActor(btnLogin);
        this.addActor(btnRegister);
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
