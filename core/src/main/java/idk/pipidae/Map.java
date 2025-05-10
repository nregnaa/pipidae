package idk.pipidae;

public class Map {
    private Vector2Int size;
    private Tile[][] tiles;

    public Map(int x, int y) {
        this.size = new Vector2Int(x, y);
        this.tiles = new Tile[size.y][size.x];
    }

    // TODO: Generate or load map or something

    public void setTile(int x, int y, Tile tile) {
        tiles[y][x] = tile;
    }
    public Tile getTile(int x, int y) {
        return tiles[y][x];
    }

    public int getX() {
        return size.x;
    }
    public int getY() {
        return size.y;
    }
}
