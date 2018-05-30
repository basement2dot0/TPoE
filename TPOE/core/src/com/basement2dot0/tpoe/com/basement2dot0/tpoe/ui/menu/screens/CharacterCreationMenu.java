package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.graphics.Color;

public class CharacterCreationMenu extends WidgetGroup
{
    private Skin skin;
    private Label lblTitle;
    private Label lblName;
    private Label lblSkinColor;
    private Label lblEyeColor;
    private Label lblEyeShape;
    private Label lblHairStyle;
    private Label lblHairColor;
    private TextField txtName;
    private Slider skinColor;
    private Slider eyeColor;
    private Slider eyeShape;
    private Slider hairStyle;
    private Slider hairColor;
    private TextButton btnCreate;
    private TextButton btnBack;
    
    private TextureAtlas buttonAtlas;
    private BitmapFont font;
    
    public CharacterCreationMenu(Skin skin)
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
        
        TextButton.TextButtonStyle tbStyle = new TextButton.TextButtonStyle();
        tbStyle.up = skin.getDrawable("buttonOff");
        tbStyle.down = skin.getDrawable("buttonOn");
        tbStyle.font = font;
        
        lblTitle = new Label("Character Creation", labelStyle);
        lblTitle.setPosition(uiUtility.widthPositioning(lblTitle),uiUtility.heightPositioning(lblTitle,275));
        
        lblName = new Label("Name", skin);
        lblName.setPosition(uiUtility.widthPositioning(lblName,-250),uiUtility.heightPositioning(lblTitle,225));
        txtName = new TextField("", skin);
        txtName.setPosition(uiUtility.widthPositioning(txtName, -100),uiUtility.heightPositioning(txtName, 225));
        txtName.setMaxLength(15);
        
        lblSkinColor = new Label("Skin Color", skin);
        lblSkinColor.setPosition(uiUtility.widthPositioning(lblSkinColor,-250),(uiUtility.heightPositioning(lblSkinColor,175)));
        
        skinColor = new Slider(1,10,2,false,skin);
        skinColor.setPosition(uiUtility.widthPositioning(skinColor,-100),uiUtility.heightPositioning(skinColor,175));
        
        lblEyeColor = new Label("Eye Color", skin);
        lblEyeColor.setPosition(uiUtility.widthPositioning(lblEyeColor,-250),uiUtility.heightPositioning(lblEyeColor,125));
        
        eyeColor = new Slider(1,10,2,false,skin);
        eyeColor.setPosition(uiUtility.widthPositioning(eyeColor,-100),uiUtility.heightPositioning(eyeColor,125));
        
        lblEyeShape = new Label("Eye Shape", skin);
        lblEyeShape.setPosition(uiUtility.widthPositioning(lblEyeShape,-250),uiUtility.heightPositioning(lblEyeShape,75));
        
        eyeShape = new Slider(1,10,2,false,skin);
        eyeShape.setPosition(uiUtility.widthPositioning(eyeShape,-100),uiUtility.heightPositioning(eyeShape,75));
        
        lblHairStyle = new Label("Hair Style", skin);
        lblHairStyle.setPosition(uiUtility.widthPositioning(lblHairStyle,-250),uiUtility.heightPositioning(lblHairStyle,25));
        
        hairStyle = new Slider(1,10,2,false,skin);
        hairStyle.setPosition(uiUtility.widthPositioning(hairStyle,-100),uiUtility.heightPositioning(hairStyle,25));
        
        lblHairColor = new Label("Hair Color", skin);
        lblHairColor.setPosition(uiUtility.widthPositioning(lblHairColor,-250),uiUtility.heightPositioning(lblHairColor,-25));  
        
        hairColor = new Slider(1,10,2,false,skin);
        hairColor.setPosition(uiUtility.widthPositioning(hairColor,-100),uiUtility.heightPositioning(hairColor,-25));
        
        btnCreate = new TextButton("Create!", tbStyle);
        btnCreate.setPosition(uiUtility.widthPositioning(btnCreate, 150),uiUtility.heightPositioning(btnCreate, -200));
        
        btnBack = new TextButton("Back", tbStyle);
        btnBack.setPosition(uiUtility.widthPositioning(btnBack, -150),uiUtility.heightPositioning(btnBack,-200));
    }

    private void addComponentsToLayout()
    {
        this.addActor(lblTitle);
        this.addActor(lblName);
        this.addActor(txtName);
        this.addActor(lblSkinColor);
        this.addActor(skinColor);
        this.addActor(lblEyeColor);
        this.addActor(eyeColor);
        this.addActor(lblEyeShape);
        this.addActor(eyeShape);
        this.addActor(lblHairStyle);
        this.addActor(hairStyle);
        this.addActor(lblHairColor);
        this.addActor(hairColor);
        this.addActor(btnCreate);
        this.addActor(btnBack);
    }
    public TextField getCharacterName()
    {
        return txtName;
    }
    public Slider getSkinColor()
    {
        return skinColor;
    }
    public Slider getEyeColor()
    {
        return eyeColor;
    }
    public Slider getEyeShape()
    {
        return eyeShape;
    }
    public Slider getHairStyle()
    {
        return hairStyle;
    }
    public Slider getHairColor()
    {
        return hairColor;
    }
    public TextButton getCreate()
    {
        return btnCreate;
    }
    public TextButton getBack()
    {
        return btnBack;
    }
}
