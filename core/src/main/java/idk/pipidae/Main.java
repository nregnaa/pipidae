package idk.pipidae;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.Color;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;

    private Texture isoTileTest;

    @Override
    public void create() {
        batch = new SpriteBatch();

        isoTileTest = new Texture("isoTileTest.png");
    }

    @Override
    public void render() {
        // ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        ScreenUtils.clear(0f, 0f, 0f, 1f);

        batch.begin();

        int X = 10;
        int Y = 8;
        int w = isoTileTest.getWidth();
        int h = isoTileTest.getHeight() - 1; // TODO: Only using -1 because it is smoother because height is odd. Should actually be even though, so no -1.
        // System.out.println(w + " " + h); // 50x25

        batch.draw(isoTileTest, 0, 0);
        batch.draw(isoTileTest, w, h);

        // Isometric rendering order test
        // TODO: Put in separate file and stuff
        float maxOrder = X + Y - 1; // DEBUG: Just for testing
        int order = 1; // DEBUG: Just for testing
        int x = 0;
        int y = 0;
        // TODO: Reuse stuff in common between the two loops
        for (int i = 0; i < X; ++i) {
            x = i;
            y = 0;
            float col = order / maxOrder;
            batch.setColor(col, col, col, 1f);
            for (int j = 0; j < Math.min(i + 1, Y); ++j) {
                int screenPosX = x*w + ((x+y)%2)*w/2; // TODO: Fix x position
                int screenPosY = Gdx.graphics.getHeight() - (x + y + 1) * h / 2;

                batch.draw(isoTileTest, screenPosX, screenPosY);
                --x;
                ++y;
            }
            ++order;
        }
        for (int i = 1; i < Y; ++i) {
            y = i;
            x = X - 1;
            float col = order / maxOrder;
            batch.setColor(col, col, col, 1f);
            for (int j = 0; j < Math.min(Y - i, X); ++j) {
                int screenPosX = x*w + ((x+y)%2)*w/2;
                int screenPosY = Gdx.graphics.getHeight() - (x + y + 1) * h / 2;

                batch.draw(isoTileTest, screenPosX, screenPosY);
                --x;
                ++y;
            }
            ++order;
        }
        batch.setColor(Color.WHITE);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        isoTileTest.dispose();
    }
}
