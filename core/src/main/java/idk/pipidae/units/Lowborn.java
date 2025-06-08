package idk.pipidae.units;

import java.util.List;

public class Lowborn implements Title{
    public Lowborn(String name, int health){
        this.name = name;
        this.health = health;
    }

    public Title demote(){
        return null;
    }

    public void update(){
        unitDecision().perform();
    }

    // TODO: Lag en egen behaviour class/ai for unitDecision.
    public Action unitDecision(){
        return new Walk(this);
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public List<Action> getActionlist(){
        return actionlist;
    }

    private String name;
    private int health;
    private List<Action> actionlist;
}
