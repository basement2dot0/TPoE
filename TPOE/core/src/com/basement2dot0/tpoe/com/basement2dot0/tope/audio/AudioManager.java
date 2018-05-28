package com.basement2dot0.tpoe.com.basement2dot0.tope.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;


public class AudioManager
{
    private AssetManager audioManager;

    public AudioManager()
    {
        audioManager = new AssetManager();
        audioManager.load("audio/main.mp3", Music.class);
        audioManager.finishLoading();
    }

    public AssetManager getAudioManager()
    {
        return audioManager;
    }
}
