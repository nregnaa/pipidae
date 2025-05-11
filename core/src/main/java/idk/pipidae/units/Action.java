package idk.pipidae.units;

public interface Action{
    public void emit(Title receiver);
    public void tell(Title receiver);
    public void handle();
}
