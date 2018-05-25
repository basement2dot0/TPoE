package com.basement2dot0.tpoe.com.basement2dot0.tope.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;


public class Audio
{
    private Music music;
    private static Audio instance;
    
    private Audio()
    {

    }
    public void playAudio(String filePath, boolean isLooping, float volume)
    {
        music = Gdx.audio.newMusic(Gdx.files.internal(filePath));
        music.setLooping(isLooping);
        music.setVolume(volume);
        music.play();
    }
    public static Audio getInstance()
    {
        if (instance == null)
            instance = new Audio();
        return instance;
    }
}
