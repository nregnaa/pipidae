package idk.pipidae.units;

import java.util.List;

public class Lowborn implements Title{
    public Lowborn(String name, int health){
        this.name = name;
        this.health = health;
    }

    public Title getBase(){
        return null;
    }

    public void update(List<Need> needs, List<Order> orders){
        performAction(unitDecision(needs, orders));
    }

    protected Action unitDecision(List<Need> needs, List<Order> orders);

    protected void performAction(Action action);

    private String name;
    private int health;
}
