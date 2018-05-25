package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.*;

public class CharacterCreationMenu extends Table
{
    private Skin skin;
    private Label lblTitle;
    private Label lblName;
    private Label lblSkinColor;
    private Label lblEyeColor;
    private Label lblEyeShape;
    private Label lblHeadShape;
    private Label lblHairColor;
    private TextField txtName;
    private SelectBox boxSkinColor;
    private SelectBox boxEyeColor;
    private SelectBox boxEyeShape;
    private SelectBox boxHeadShape;
    private SelectBox boxHairColor;
    private TextButton btnCreate;
    
    private TextureAtlas buttonAtlas;
    private BitmapFont font;
    
    public CharacterCreationMenu(Skin skin)
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
        lblTitle = new Label("Psalms of Eia", skin);
        
        lblName = new Label("Name",skin);
        txtName = new TextField("", skin);
        txtName.setMaxLength(15);
        lblSkinColor = new Label("Skin color", skin);
        boxSkinColor = new SelectBox(skin);
        lblEyeColor = new Label("Eye color", skin);
        boxEyeColor = new SelectBox(skin);
        lblEyeShape = new Label("Eye shape", skin);
        boxEyeShape = new SelectBox(skin);
        lblHeadShape = new Label("Head shape", skin);
        boxHeadShape = new SelectBox(skin);
        lblHairColor = new Label("Hair color", skin);
        boxHairColor = new SelectBox(skin);
        
        TextButton.TextButtonStyle tbStyle = new TextButton.TextButtonStyle();
        tbStyle.up = skin.getDrawable("buttonOff");
        tbStyle.down = skin.getDrawable("buttonOn");
        tbStyle.font = font;
        
        btnCreate = new TextButton("Create!", tbStyle);
        
        SelectBox.SelectBoxStyle sbStyle = new SelectBox.SelectBoxStyle();
    }

    private void addComponentsToLayout()
    {
        this.add(lblName).pad(5);
        this.add(txtName).pad(5).width(200);
        this.row();
        this.add(lblSkinColor).pad(5);
        this.add(boxSkinColor).pad(5).width(200);
        this.row();
        this.add(lblEyeColor).pad(5);
        this.add(boxEyeColor).pad(5).width(200);
        this.row();
        this.add(lblEyeShape).pad(5);
        this.add(boxEyeShape).pad(5).width(200);
        this.row();
        this.add(lblHeadShape).pad(5);
        this.add(boxHeadShape).pad(5).width(200);
        this.row();
        this.add(lblHairColor).pad(5);
        this.add(boxHairColor).pad(5).width(200);
        this.row();
        this.add(btnCreate).width(150).pad(5).padTop(10).width(200);
    }
    public TextField getCharacterName()
    {
        return txtName;
    }
    public SelectBox getSkinColor()
    {
        return boxSkinColor;
    }
    public SelectBox getEyeColor()
    {
        return boxEyeColor;
    }
    public SelectBox getEyeShape()
    {
        return boxEyeShape;
    }
    public SelectBox getHeadShape()
    {
        return boxHeadShape;
    }
    public SelectBox getHairColor()
    {
        return boxHairColor;
    }
    public TextButton getCreate()
    {
        return btnCreate;
    }
}
