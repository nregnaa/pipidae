package idk.pipidae;

public class Player extends Entity {
    public Camera cam;

    public Player(int x, int y) {
        super(x, y);
        this.cam = new Camera(x, y);
    }
}
