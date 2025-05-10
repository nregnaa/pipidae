package idk.pipidae;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.Color;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;

    private Map map;
    private Player player;

    private Tile isoTileTest;

    @Override
    public void create() {
        batch = new SpriteBatch();
    
        map = new Map(10, 8);
        player = new Player(5, 5);

        isoTileTest = new Tile("isoTileTest.png");
        for (int y = 0; y < map.getY(); ++y) {
            for (int x = 0; x < map.getX(); ++x) {
                map.setTile(x, y, isoTileTest);
            }
        }
    }

    @Override
    public void render() {
        // ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        ScreenUtils.clear(0f, 0f, 0f, 1f);

        batch.begin();

        player.cam.render(batch, map);

        // int X = 10;
        // int Y = 8;
        // int w = isoTileTest.tex.getWidth();
        // int h = isoTileTest.tex.getHeight() - 1; // TODO: Only using -1 because it is smoother because height is odd. Should actually be even though, so no -1.
        // System.out.println(w + " " + h); // 50x25

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        isoTileTest.tex.dispose();
    }
}
