package com.basement2dot0.tpoe.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.basement2dot0.tpoe.MainGame;

public class CharacterSheet implements Screen
{

    private MainGame game;
    public CharacterSheet(MainGame game)
    {
        this.game = game;
    }

    @Override
    public void show()
    {
        Gdx.gl.glClearColor(1, 1, 0, 1);
    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
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
