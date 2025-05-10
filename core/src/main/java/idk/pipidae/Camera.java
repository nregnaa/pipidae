package idk.pipidae;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Camera extends Entity {
    private float zoom;

    public Camera(int x, int y) {
        super(x, y);
        this.zoom = 1f;
    }

    public void render(Batch batch, Map map) {

        // TODO: Actually make this do the correct thing lol

        int w = Tile.width;
        int h = Tile.height;
        int X = map.getX();
        int Y = map.getY();

        // batch.draw(isoTileTest.tex, 0, 0);
        // batch.draw(isoTileTest.tex, w, h);

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

                batch.draw(map.getTile(x, y).tex, screenPosX, screenPosY);
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

                batch.draw(map.getTile(x, y).tex, screenPosX, screenPosY);
                --x;
                ++y;
            }
            ++order;
        }
        batch.setColor(Color.WHITE);
    }
}
