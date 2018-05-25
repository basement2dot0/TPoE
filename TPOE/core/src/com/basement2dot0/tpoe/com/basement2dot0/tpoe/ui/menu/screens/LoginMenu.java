package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import java.awt.*;

public class LoginMenu extends Table {
    private Skin skin;
    private Label lblUsername;
    private Label lblPassword;
    private Label lblTitle;
    private TextField txtUsername;
    private TextField txtPassword;
    private TextButton btnLogin;
    private TextButton btnRegister;

    private TextureAtlas buttonAtlas;
    private BitmapFont font;





    public LoginMenu(Skin skin)
    {

        this.skin = skin;
        buttonAtlas = new TextureAtlas(Gdx.files.internal("ui/button.pack"));
        font = new BitmapFont(Gdx.files.internal("ui/new.fnt"), false);
        skin.addRegions(buttonAtlas);
        this.setFillParent(true);
        initializeLayout();
        addComponentsToLayout();
    }

    private void initializeLayout()
    {
        lblTitle = new Label("Pslams of Eia", skin);
        lblUsername = new Label("Username:", skin);
        txtUsername = new TextField("", skin);

        lblPassword = new Label("Password:", skin);
        txtPassword = new TextField("", skin);
        txtPassword.setPasswordCharacter('*');
        txtPassword.setPasswordMode(true);

        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = skin.getDrawable("buttonOff");
        style.down = skin.getDrawable("buttonOn");
        style.font = font;


        btnLogin = new TextButton("Login", style);
        btnRegister = new TextButton("Register", style);

    }

    private void addComponentsToLayout()
    {
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
