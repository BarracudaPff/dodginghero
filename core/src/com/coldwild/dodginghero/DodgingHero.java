package com.coldwild.dodginghero;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coldwild.dodginghero.screens.GameScreen;

public class DodgingHero extends Game {
    public Resources res;

    @Override
    public void create () {
        res = new Resources();
        setScreen(new GameScreen(this));
    }

    @Override
    public void dispose () {
        res.dispose();
    }
}
