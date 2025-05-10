package idk.pipidae;

import com.badlogic.gdx.graphics.Texture;

public class Tile {
    public static final int width = 50;
    public static final int height = 24;

    public Texture tex;

    public Tile(String texture) {
        this.tex = new Texture(texture);
    }
}
