package com.basement2dot0.tpoe;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens.Login;

public class MainGame extends Game
{
	private SpriteBatch spriteBatch;

	private float screenWidth = 600f;
	private float screenHeight = 800f;
	
	@Override
	public void create ()
	{
		spriteBatch = new SpriteBatch();
		this.setScreen(new Login(this));
	}

	@Override
	public void render ()
	{
		super.render();
	}
	
	@Override
	public void dispose ()
	{
		spriteBatch.dispose();
	}

	public SpriteBatch getSpriteBatch()
	{
		return spriteBatch;
	}

	public float getScreenWidth()
	{
		return screenWidth;
	}

	public void setScreenWidth(float width)
	{
		screenWidth = width;
	}

	public float getScreenHeight()
	{
		return screenHeight;
	}

	public void setScreenHeight(float height)
	{
		screenHeight = height;
	}

    public Object getSprintBatch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object setSpriteBatch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
