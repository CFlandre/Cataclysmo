package com.cflandre.cataclysmo.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class Screens implements Screen {

	int game_width = 1280;
	int game_height = 720;
	
	 Game game;
	
	public Screens (Game game){
		this.game = game;
	}
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor( 0f, 0f, 1f, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );
	}

	@Override
	public void resize(int width, int height) {
		
		
	}

	@Override
	public void show() {
		
		
	}

	@Override
	public void hide() {
		
		
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void resume() {
		
		
	}

	@Override
	public void dispose() {
		
		
	}

}
