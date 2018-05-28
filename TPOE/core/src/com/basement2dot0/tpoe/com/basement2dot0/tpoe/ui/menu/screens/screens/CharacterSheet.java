package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens.screens;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.basement2dot0.tpoe.MainGame;

public class CharacterSheet implements Screen
{

    private MainGame game;

    private Stage stage;
    private Skin skin;
    private TextButton login;


    public CharacterSheet(MainGame game)
    {
        this.game = game;
    }

    @Override
    public void show()
    {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        Skin skin = new Skin();
        Pixmap pixMap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
        pixMap.setColor(Color.WHITE);
        pixMap.fill();
        skin.add("white", new Texture(pixMap));
        Table table = new Table();

        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();

        skin.add("default", textButtonStyle);

        stage.addActor(table);
        login = new TextButton("Login",skin,"default");

        table.add(login);
        table.add(new Image(skin.newDrawable("white", Color.RED))).size(64);

    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        handleInput();
        stage.draw();

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
