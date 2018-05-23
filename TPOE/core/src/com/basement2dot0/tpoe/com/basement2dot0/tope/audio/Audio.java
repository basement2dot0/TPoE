package com.basement2dot0.tpoe.com.basement2dot0.tope.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class Audio
{
    private Music music;

    public Audio()
    {
        music = Gdx.audio.newMusic(Gdx.files.internal("audio/main.mp3"));
        music.setLooping(true);
        music.setVolume(0.0f);
        music.play();
    }


}
