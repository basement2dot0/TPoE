package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.Viewport;
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
    private AudioManager audioManager;
    private Music audio;


    public Login(MainGame game)
    {
        audioManager = new AudioManager();
        this.game = game;
        skin = new Skin(Gdx.files.internal("skins/glassy-ui.json"));
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        loginMenu = new LoginMenu(skin);
        stage.addActor(loginMenu);
        audio = audioManager.getAudioManager().get("audio/main.mp3");
        audio.setLooping(true);
        audio.stop();

    }

    @Override
    public void show()
    {
        loginMenu.getBtnAudio().setColor(Color.RED);
        Gdx.gl.glClearColor(0.311f, 0.311f, 0.311f, 0.311f);

        loginMenu.getBtnLogin().addListener(new ClickListener()
        {
            public void clicked(InputEvent event, float xPosition, float yPosition)
            {
                System.out.println("Logging in");
            }
        });

        loginMenu.getBtnRegister().addListener(new ClickListener()
        {
            public void clicked(InputEvent event, float xPosition, float yPosition)
            {
                System.out.println("Create Account");
            }
        });

        loginMenu.getBtnAudio().addListener(new ClickListener()
        {
            public void clicked(InputEvent event, float xPosition, float yPosition)
            {
                if(!audio.isPlaying())
                {
                    audio.play();
                    loginMenu.getBtnAudio().setColor(Color.BLUE);

                }
                else
                {
                    audio.stop();
                    loginMenu.getBtnAudio().setColor(Color.RED);
                }

            }
        });

}

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.getSpriteBatch().begin();
        stage.draw();
        stage.act();
        game.getSpriteBatch().end();


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
        game.getSpriteBatch().dispose();
        stage.dispose();
        audio.dispose();
        audioManager.getAudioManager().dispose();
    }
}
