package com.basement2dot0.tpoe.com.basement2dot0.tpoe.menus.screens;

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
    public Login(MainGame game)
    {
        this.game = game;

        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        skin = new Skin(Gdx.files.internal("skins/uiskin.json"));
        loginMenu = new LoginMenu(skin);
        stage.addActor(loginMenu);
    }

    @Override
    public void show()
    {
        Gdx.gl.glClearColor(0.311f, 0.311f, 0.311f, 0.311f);

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
        stage.draw();
        handleInput();

    }

    @Override
    public void resize(int width, int height)
    {

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

    }

    public void handleInput()
    {

    }
}
