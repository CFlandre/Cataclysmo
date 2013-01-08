package com.cflandre.cataclysmo;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.cflandre.cataclysmo.Screens.SplashScreen;

public class Cataclysmo extends Game {
	
	public static final boolean fullscreen = false;
	public static final boolean running = false;
	public static final boolean VSYNC = true;
	
	public final String VERSION = "Version 0.0.0.01 Pre-Alpha";
	
	public SplashScreen getSplashScreen() {
		return new SplashScreen(this);
	}
	

	@Override
	public void create() {		
	
		Gdx.app.log("Cataclysmo.LOG", "Game Starting...");
		setScreen(getSplashScreen() );
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {		
		super.render();
		
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
