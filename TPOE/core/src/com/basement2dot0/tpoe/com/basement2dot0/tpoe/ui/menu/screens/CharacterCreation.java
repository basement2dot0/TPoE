
package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.basement2dot0.tpoe.com.basement2dot0.tope.audio.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.basement2dot0.tpoe.MainGame;


public class CharacterCreation implements Screen
{
    private MainGame game;
    
    private Stage stage;
    private Skin skin;
    private CharacterCreationMenu ccMenu;
    
    public CharacterCreation(MainGame game)
    {
        this.game = game;
        skin = new Skin(Gdx.files.internal("skins/glassy-ui.json"));
        
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        
        ccMenu = new CharacterCreationMenu(skin);
        stage.addActor(ccMenu);
    }
    @Override
    public void show() 
    {
        Gdx.gl.glClearColor(0.311f, 0.311f, 0.311f, 0.311f);
        
        ccMenu.getCreate().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    //Code for the window that comes after Character Creation
                    super.clicked(event, xPosition, yPosition);
                }
            });
        ccMenu.getBack().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    game.setScreen(new Login(game));
                    super.clicked(event, xPosition, yPosition);
                }
            });
        ccMenu.getSkinColor().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    super.clicked(event, xPosition, yPosition);
                }
            });
     
            ccMenu.getEyeColor().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    super.clicked(event, xPosition, yPosition);
                }
            });
       
            ccMenu.getEyeShape().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    super.clicked(event, xPosition, yPosition);
                }
            });
      
            ccMenu.getHairStyle().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    super.clicked(event, xPosition, yPosition);
                }
            });
          
            ccMenu.getHairColor().addListener(new ClickListener()
            {
                public void clicked(InputEvent event, float xPosition, float yPosition)
                {
                    super.clicked(event, xPosition, yPosition);
                }
            });
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        game.getSpriteBatch().begin();
        stage.draw();
        stage.act();
        game.getSpriteBatch().end();
        
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
    
}
