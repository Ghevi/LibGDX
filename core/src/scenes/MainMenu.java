package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.ghevi.mylibgdxtester.GameMain;

import helpers.GameInfo;

public class MainMenu implements Screen {

    private GameMain game;
    private Texture bg;
    private Sprite player;

    public MainMenu(GameMain game){
        this.game = game;
        bg = new Texture("Game Bg.png");
        player = new Sprite(new Texture("Player 1.png"));
        player.setPosition((GameInfo.WIDTH / 2) - player.getWidth() / 2, (GameInfo.HEIGHT / 2) - player.getHeight() / 2);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.getBatch().begin();
        game.getBatch().draw(bg, 0, 0);
        game.getBatch().draw(player, player.getX(), player.getY());
        game.getBatch().end();
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

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
} // main menu
