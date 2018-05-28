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
    
    private float width = Gdx.graphics.getWidth();
    private float height = Gdx.graphics.getHeight();
    
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
    private void initializeLayout() //Sets the location of widgets
    {
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.fontColor = Color.WHITE;
        labelStyle.font = font;

        //Using the methods in the uiUtility class to set the object's positions
        lblTitle = new Label("Pslams of Eia", labelStyle);
        lblTitle.setPosition((uiUtility.widthPositioning(lblTitle)), uiUtility.heightPositioning(lblTitle, -250.0f));

        lblUsername = new Label("Username:", skin);
        lblUsername.setPosition((uiUtility.widthPositioning(lblUsername, -200.0f)), uiUtility.heightPositioning(lblUsername, 30.0f));
        txtUsername = new TextField("", skin);
        txtUsername.setPosition((uiUtility.widthPositioning(txtUsername)), (uiUtility.heightPositioning(txtUsername, 30.0f)));
        txtUsername.setWidth(300.0f);
        lblPassword = new Label("Password:", skin);
        lblPassword.setPosition((uiUtility.widthPositioning(lblPassword, -200.0f)), uiUtility.heightPositioning(lblPassword, -30.0f));
        txtPassword = new TextField("", skin);
        txtPassword.setPosition((uiUtility.widthPositioning(txtPassword)), uiUtility.heightPositioning(txtPassword, -30.0f));
        txtPassword.setWidth(300.0f);
        txtPassword.setPasswordCharacter('*');
        txtPassword.setPasswordMode(true);

        TextButton.TextButtonStyle buttonStyle = new TextButton.TextButtonStyle();
        buttonStyle.up = skin.getDrawable("buttonOff");
        buttonStyle.down = skin.getDrawable("buttonOn");
        buttonStyle.font = font;

        btnLogin = new TextButton("Login", buttonStyle);
        btnLogin.setPosition((uiUtility.widthPositioning(btnLogin, 20.0f)), uiUtility.heightPositioning(btnLogin, -130.0f));
        //btnLogin.setBounds(10.0f, 10.0f, 200.0f, 200);
        btnAudio = new TextButton("", skin);
        btnAudio.setPosition((uiUtility.widthPositioning(btnAudio, 490.0f)), uiUtility.heightPositioning(btnAudio,270.0f));
        btnAudio.setSize(50.0f, 50.0f);
        btnRegister = new TextButton("Create Account", buttonStyle);
        btnRegister.setPosition((uiUtility.widthPositioning(btnRegister, 20.0f)),uiUtility.heightPositioning(btnRegister, -250.0f));




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
