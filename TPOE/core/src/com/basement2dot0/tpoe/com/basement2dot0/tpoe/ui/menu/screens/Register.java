package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.basement2dot0.tpoe.MainGame;

public class Register implements Screen
{

    private MainGame game;

    // Scene2D components
    private Skin skin;
    private Stage stage;
    private RegisterMenu registerComponents;

    public Register(MainGame game)
    {
        this.game = game;

        skin = new Skin(Gdx.files.internal("skins/glassy-ui.json"));

        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        registerComponents = new RegisterMenu(skin);

        // Char limits (HOW TO)
        registerComponents.getUsernameField().setMaxLength(10);
        registerComponents.getPasswordField().setMaxLength(15);
        registerComponents.getRepeat_passwordField().setMaxLength(15);
        registerComponents.getEmailField().setMaxLength(50);

        stage.addActor(registerComponents);
    }

    public void show()
    {
        Gdx.gl.glClearColor(0.311f, 0.311f, 0.311f, 0.311f);

        registerComponents.getSubmit().addListener(new ClickListener()
        {

            public void clicked(InputEvent event, float x, float y)
            {
                System.out.println("Account Created");
                super.clicked(event, x, y);
            }
        });

        registerComponents.getBack().addListener(new ClickListener()
        {

            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new Login(game));
                super.clicked(event, x, y);
            }
        });
    }

    public void render(float delta)
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    public void resize(int width, int height)
    {
    }

    public void pause()
    {

    }

    public void resume()
    {

    }

    public void hide()
    {

    }

    public void dispose()
    {
        stage.dispose();
    }
}
