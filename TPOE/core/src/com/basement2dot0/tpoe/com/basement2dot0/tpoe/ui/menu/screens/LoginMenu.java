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

        //Using the methods in the UIUtility class to set the object's positions
        lblTitle = new Label("Pslams of Eia", labelStyle);
        lblTitle.setPosition((UIUtility.widthPositioning(lblTitle)), UIUtility.heightPositioning(lblTitle, +250.0f));

        lblUsername = new Label("Username:", skin);
        lblUsername.setPosition((UIUtility.widthPositioning(lblUsername, -200.0f)), UIUtility.heightPositioning(lblUsername, 70.0f));
        txtUsername = new TextField("", skin);
        txtUsername.setPosition((UIUtility.widthPositioning(txtUsername, -30.0f)), (UIUtility.heightPositioning(txtUsername, 70.0f)));
        txtUsername.setWidth(300.0f);
        lblPassword = new Label("Password:", skin);
        lblPassword.setPosition((UIUtility.widthPositioning(lblPassword, -200.0f)), UIUtility.heightPositioning(lblPassword, 10.0f));
        txtPassword = new TextField("", skin);
        txtPassword.setPosition((UIUtility.widthPositioning(txtPassword, -30.0f)), UIUtility.heightPositioning(txtPassword, 10.0f));
        txtPassword.setWidth(300.0f);
        txtPassword.setPasswordCharacter('*');
        txtPassword.setPasswordMode(true);

        TextButton.TextButtonStyle buttonStyle = new TextButton.TextButtonStyle();
        buttonStyle.up = skin.getDrawable("buttonOff");
        buttonStyle.down = skin.getDrawable("buttonOn");
        buttonStyle.font = font;

        btnLogin = new TextButton("Login", buttonStyle);
        btnLogin.setPosition((UIUtility.widthPositioning(btnLogin, 20.0f)), UIUtility.heightPositioning(btnLogin, -130.0f));
        btnAudio = new TextButton("", skin);
        btnAudio.setPosition((UIUtility.widthPositioning(btnAudio, 490.0f)), UIUtility.heightPositioning(btnAudio,270.0f));
        btnAudio.setColor(Color.BLUE);
        btnAudio.setSize(50.0f, 50.0f);
        btnRegister = new TextButton("Create Account", buttonStyle);
        btnRegister.setPosition((UIUtility.widthPositioning(btnRegister, 20.0f)),UIUtility.heightPositioning(btnRegister, -250.0f));




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

    public TextButton getBtnAudio()
    {
        return btnAudio;
    }


}
