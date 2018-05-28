package com.basement2dot0.tpoe.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.basement2dot0.tpoe.MainGame;

public class DesktopLauncher
{
	public static void main (String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Pslams of Eia";
		config.width = 800;
		config.height = 600;
		new LwjglApplication(new MainGame(), config);
	}
}
