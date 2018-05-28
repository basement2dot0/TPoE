package com.basement2dot0.tpoe.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.basement2dot0.tpoe.MainGame;

public class DesktopLauncher
{
	public static void main (String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "Psalms of Eia";
                config.height = 600;
                config.width = 800;
		new LwjglApplication(new MainGame(), config);
	}
}

