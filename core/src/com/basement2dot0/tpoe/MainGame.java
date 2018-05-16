package com.basement2dot0.tpoe;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.basement2dot0.tpoe.screens.Menu;

public class MainGame extends Game
{
	private SpriteBatch spriteBatch;

	private float screenWidth;
	private float screenHeight;
	
	@Override
	public void create ()
	{
		spriteBatch = new SpriteBatch();
		this.setScreen(new Menu(this));
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

}
