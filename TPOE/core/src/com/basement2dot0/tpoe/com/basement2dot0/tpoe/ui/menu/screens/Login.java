package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.basement2dot0.tpoe.com.basement2dot0.tope.audio.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.basement2dot0.tpoe.MainGame;

public class Login implements Screen
{
    private MainGame game;

    private Stage stage;
    private Skin skin;
    private LoginMenu loginMenu;
    private Audio audio;
    private OrthographicCamera camera;

    private int screenWidth;
    private int screenHeight;

    public Login(MainGame game)
    {
        this.game = game;
        screenWidth = Gdx.graphics.getWidth();
        screenHeight = Gdx.graphics.getHeight();
        skin = new Skin(Gdx.files.internal("skins/glassy-ui.json"));
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

        loginMenu = new LoginMenu(skin);
        stage.addActor(loginMenu);
    }

    @Override
    public void show()
    {

        Gdx.gl.glClearColor(0.311f, 0.311f, 0.311f, 0.311f);
        audio = new Audio();

        loginMenu.getBtnLogin().addListener(new ClickListener()
        {
            public void clicked(InputEvent event, float xPosition, float yPosition)
            {
                game.setScreen(new CharacterSheet(game));
                super.clicked(event, xPosition, yPosition);
            }
        });

        loginMenu.getBtnRegister().addListener(new ClickListener()
        {
            public void clicked(InputEvent event, float xPosition, float yPosition)
            {
                game.setScreen(new Register(game));
                super.clicked(event, xPosition, yPosition);

            }
        });
    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.getSpriteBatch().setProjectionMatrix(camera.combined);

        game.getSpriteBatch().begin();
        stage.draw();
        stage.act(Gdx.graphics.getDeltaTime());
        game.getSpriteBatch().end();




        //handleInput();

    }

    @Override
    public void resize(int width, int height)
    {
        stage.getViewport().update(width, height);
    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void hide()
    {


    }

    @Override
    public void dispose()
    {
        stage.dispose();
        game.getSpriteBatch().dispose();
    }
}
